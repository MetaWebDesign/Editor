package Metawebdesign.metawebdesign.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		Metawebdesign.metawebdesign.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		Metawebdesign.metawebdesign.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		Metawebdesign.metawebdesign.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		Metawebdesign.metawebdesign.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		Metawebdesign.metawebdesign.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
