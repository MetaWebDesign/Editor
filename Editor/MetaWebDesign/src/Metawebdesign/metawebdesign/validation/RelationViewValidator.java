/**
 *
 * $Id$
 */
package Metawebdesign.metawebdesign.validation;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.Views;
import Metawebdesign.metawebdesign.typeHorizontalPosition;
import Metawebdesign.metawebdesign.typePresentation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Metawebdesign.metawebdesign.RelationView}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelationViewValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateTypePresentation(typePresentation value);
	boolean validatePositionHorizontal(typeHorizontalPosition value);
	boolean validatePositionVertical(int value);
	boolean validateGoViews(EList<Views> value);
	boolean validateRhasViews(EList<Views> value);
	boolean validateRViewsHasClass(EList<Metawebdesign.metawebdesign.Class> value);
	boolean validateRviewsGoToClass(EList<Metawebdesign.metawebdesign.Class> value);
	boolean validateGetAttribute(Attributes value);
	boolean validateRow(int value);
}
