/**
 *
 * $Id$
 */
package Metawebdesign.metawebdesign.validation;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.typeCardinality;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Metawebdesign.metawebdesign.RelationClass}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelationClassValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateFromClass(EList<Metawebdesign.metawebdesign.Class> value);
	boolean validateAttribute_Class_A(Attributes value);
	boolean validateAttribute_Class_B(Attributes value);
	boolean validateCardinality_Class_A(typeCardinality value);
	boolean validateCardinality_Class_B(typeCardinality value);
}
