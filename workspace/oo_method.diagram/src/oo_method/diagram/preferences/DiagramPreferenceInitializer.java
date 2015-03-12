package oo_method.diagram.preferences;

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
		oo_method.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		oo_method.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		oo_method.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		oo_method.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		oo_method.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return oo_method.diagram.part.Oo_methodDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
