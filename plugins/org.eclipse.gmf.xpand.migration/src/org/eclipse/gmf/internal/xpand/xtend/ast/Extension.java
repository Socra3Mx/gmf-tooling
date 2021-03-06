/*
 * <copyright>
 *
 * Copyright (c) 2005-2008 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *     Alexander Shatalin (Borland)
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.xtend.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.eval.EvaluationListener;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.expression.ast.DeclaredParameter;
import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;

public abstract class Extension extends SyntaxElement /*implements ParameterizedCallable*/ {

    private final Identifier name;

    private final List<DeclaredParameter> formalParameters;

    protected ExtensionFile file;

    protected final boolean cached;

    private final boolean isPrivate;

    protected final Identifier returnType;

    private List<EClassifier> resolvedParameterTypes = null;

    public Extension(final int start, final int end, final int line, final int startOffset, final int endOffset, final Identifier name,
            final Identifier returnType, final List<DeclaredParameter> formalParameters, final boolean cached, final boolean isPrivate) {
        super(start, end, line, startOffset, endOffset);
        this.name = name;
        this.formalParameters = formalParameters;
        this.returnType = returnType;
        this.cached = cached;
        this.isPrivate = isPrivate;
    }

    public List<DeclaredParameter> getFormalParameters() {
        return formalParameters;
    }

    public String getName() {
        return name.getValue();
    }

    public final EClassifier getReturnType(final EClassifier[] parameters, ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        ctx = ctx.cloneWithResource(getExtensionFile());
        return internalGetReturnType(parameters, ctx, issues);
    }

    protected abstract EClassifier internalGetReturnType(EClassifier[] parameters, ExecutionContext ctx, Set<AnalysationIssue> issues);

    public final void analyze(ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        final List<DeclaredParameter> params = getFormalParameters();
        final Set<String> usedNames = new HashSet<String>();
        for (final Iterator<DeclaredParameter> iter = params.iterator(); iter.hasNext();) {
            final DeclaredParameter p = iter.next();
            final EClassifier pt = ctx.getTypeForName(p.getType().getValue());
            if (pt == null) {
                issues.add(new AnalysationIssue(AnalysationIssue.Type.TYPE_NOT_FOUND, "Type not found: "
                        + p.getType().getValue(), p.getType()));
            }
            if (!usedNames.add(p.getName().getValue())) {
                issues.add(new AnalysationIssue(AnalysationIssue.Type.SYNTAX_ERROR, "Duplicate parameter name: "
                        + p.getName().getValue(), p.getName()));
            }
            ctx = ctx.cloneWithVariable(new Variable(p.getName().getValue(), pt));
        }
        if (returnType != null) {
            final EClassifier pt = ctx.getTypeForName(returnType.getValue());
            if (pt == null) {
                issues.add(new AnalysationIssue(AnalysationIssue.Type.TYPE_NOT_FOUND, "Type not found: "
                        + returnType.getValue(), returnType));
            }
        }
        analyzeInternal(ctx, issues);
    }

    protected abstract void analyzeInternal(ExecutionContext ctx, Set<AnalysationIssue> issues);

    private final Map<List<Object>, Object> cache = new HashMap<List<Object>, Object>();

    public Object evaluate(final Object[] parameters, ExecutionContext ctx) {
        if (cached) {
            final List<Object> l = Arrays.asList(parameters);
            if (cache.containsKey(l)) {
				return cache.get(l);
			}
        }
        if (getExtensionFile() == null) {
            throw new IllegalStateException("No containing file!");
        }
        ctx = ctx.cloneWithResource(getExtensionFile());
        notifyEnter(ctx);
        final Object result;
        try {
        	result = evaluateInternal(parameters, ctx);
        } finally {
        	notifyLeave(ctx);
        }
        if (cached) {
            cache.put(Arrays.asList(parameters), result);
        }
        return result;
    }

    public final void setExtensionFile(final ExtensionFile f) {
        file = f;
    }

    public ExtensionFile getExtensionFile() {
        return file;
    }

    protected abstract Object evaluateInternal(Object[] parameters, ExecutionContext ctx);

    public List<String> getParameterNames() {
        final List<String> names = new ArrayList<String>();
        for (final Iterator<DeclaredParameter> iter = getFormalParameters().iterator(); iter.hasNext();) {
            names.add((iter.next()).getName().getValue());
        }
        return names;
    }

    public void init(final ExecutionContext ctx) {
        if (resolvedParameterTypes == null) {
            try {
                resolvedParameterTypes = new ArrayList<EClassifier>();
                for (final Iterator<DeclaredParameter> iter = getFormalParameters().iterator(); iter.hasNext();) {
                    final String name = (iter.next()).getType().getValue();
                    final EClassifier t = ctx.getTypeForName(name);
                    if (t == null) {
						throw new EvaluationException("Couldn't resolve type for '" + name
                                + "'. Did you forget to configure the corresponding metamodel?", this);
					}
                    resolvedParameterTypes.add(t);
                }
                resolvedParameterTypes = Collections.unmodifiableList(resolvedParameterTypes);
            } catch (final RuntimeException e) {
                resolvedParameterTypes = null;
                throw e;
            }
        }
    }

    public List<EClassifier> getParameterTypes() {
        return resolvedParameterTypes;
    }

    public Identifier getReturnTypeIdentifier() {
        return returnType;
    }

    @Override
    public String toString() {
        return (returnType != null ? returnType.getValue() + " " : "") + getName() + "(" + paramsToString() + ")";
    }

    private String paramsToString() {
        final StringBuffer buff = new StringBuffer();
        for (final Iterator<DeclaredParameter> iter = getFormalParameters().iterator(); iter.hasNext();) {
            final DeclaredParameter element = iter.next();
            buff.append(element.getType() + " " + element.getName());
            if (iter.hasNext()) {
                buff.append(",");
            }
        }
        return buff.toString();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    private void notifyEnter(ExecutionContext ctx) {
    	EvaluationListener l = ctx.getEvaluationListener();
    	if (l != null) {
    		l.enter(this, ctx);
    	}
    }

    private void notifyLeave(ExecutionContext ctx) {
    	EvaluationListener l = ctx.getEvaluationListener();
    	if (l != null) {
    		l.leave(this, ctx);
    	}
    }
}
