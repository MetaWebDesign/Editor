/**
 *
 * $Id$
 */
package Metawebdesign.metawebdesign.validation;

import Metawebdesign.metawebdesign.Views;

/**
 * A sample validator interface for {@link Metawebdesign.metawebdesign.LinkView}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LinkViewValidator {
	boolean validate();

	boolean validateLinkView(Views value);
}
