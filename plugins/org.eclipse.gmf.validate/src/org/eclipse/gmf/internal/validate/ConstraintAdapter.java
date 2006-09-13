/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *    Radek Dvorak (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.validate;

import java.text.MessageFormat;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ocl.parser.EcoreEnvironment;
import org.eclipse.emf.ocl.types.TypesPackage;
import org.eclipse.gmf.internal.validate.expressions.AbstractExpression;
import org.eclipse.gmf.internal.validate.expressions.IEvaluationEnvironment;
import org.eclipse.gmf.internal.validate.expressions.IModelExpression;

public class ConstraintAdapter extends AbstractExpression {
	private IModelExpression expression;
	private EClassifier resultType;
	
	public ConstraintAdapter(IModelExpression expression) {
		super(expression.getBody(), expression.getContext(), null);
		this.expression = expression;
		if(getStatus().isOK()) {
			this.resultType = expression.getResultType();				
			if(this.resultType != null && !expression.isLooselyTyped()) { 
				Class resultClass = resultType.getInstanceClass();
				if(!(Boolean.class.equals(resultClass) || boolean.class.equals(resultClass))) {
					String msg = MessageFormat.format(
							Messages.invalidConstraintExprType, 
							new Object[] { resultType.getName(), getBody() }); 
					setStatus(new Status(IStatus.ERROR, 
							GMFValidationPlugin.getPluginId(),
							StatusCodes.INVALID_EXPRESSION_TYPE, msg, null));
				}
			}			
		}
	}
		
	
	public IStatus getStatus() {
		if(expression.getStatus().isOK()) {
			return super.getStatus();
		}
		return expression.getStatus();
	}
	
	public String getLanguage() {	
		return expression.getLanguage();
	}
	
	public boolean isLooselyTyped() {
		return expression.isLooselyTyped();
	}
	
	public boolean isAssignableToElement(ETypedElement typedElement) {
		EClassifier classifier = EcoreEnvironment.getOCLType(typedElement);
		return classifier != null ? classifier == TypesPackage.eINSTANCE.getPrimitiveBoolean() : false;
	}
	
	public boolean isAssignableTo(EClassifier ecoreType) {
		EClassifier classifier = EcoreEnvironment.getOCLType(ecoreType);
		return classifier != null ? classifier == TypesPackage.eINSTANCE.getPrimitiveBoolean() : false;
	}
	
	public EClassifier getResultType() {
		return resultType;
	}
	
	protected Object doEvaluate(Object context) {
		return expression.evaluate(context);
	}

	protected Object doEvaluate(Object context, IEvaluationEnvironment extEnvironment) {
		return expression.evaluate(context, extEnvironment);
	}
	
	public boolean isSatisfied(EObject context) {
		Object value = evaluate(context);
		return (value instanceof Boolean) ? ((Boolean)value).booleanValue() : false;
	}
}