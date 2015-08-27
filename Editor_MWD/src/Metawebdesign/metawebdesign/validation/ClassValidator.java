/**
 *
 * $Id$
 */
package Metawebdesign.metawebdesign.validation;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.RelationClass;
import Metawebdesign.metawebdesign.RelationContraint;
import Metawebdesign.metawebdesign.TypeRol;
import Metawebdesign.metawebdesign.Views;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Metawebdesign.metawebdesign.Class}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ClassValidator {
	boolean validate();

	boolean validateHasAttributes(EList<Attributes> value);
	boolean validateName(String value);
	boolean validateId(int value);
	boolean validateFunctionCreate(TypeRol value);
	boolean validateFunctionDelete(TypeRol value);
	boolean validateFunctionUpdate(TypeRol value);
	boolean validateFunctionIndex(TypeRol value);
	boolean validateFunctionView(TypeRol value);
	boolean validateFunctionAdmin(TypeRol value);
	boolean validateHasRelationClass(EList<RelationClass> value);
	boolean validateGoRelationClass(EList<RelationClass> value);
	boolean validateHasView(Views value);
	boolean validateHasRelationConstraint(EList<RelationContraint> value);
	boolean validateGoRConstriant1(EList<RelationContraint> value);
}
