/*
 * generated by Xtext
 */
package org.eclipselabs.spray.shapes.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractShapeValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.eclipselabs.spray.shapes.shape.ShapePackage.eINSTANCE);
		return result;
	}
}