package Modelo.modelo.diagram.preferences;

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
		Modelo.modelo.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		Modelo.modelo.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		Modelo.modelo.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		Modelo.modelo.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		Modelo.modelo.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Modelo.modelo.diagram.part.ModeloDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
