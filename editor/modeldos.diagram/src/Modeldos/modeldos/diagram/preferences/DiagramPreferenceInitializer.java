package Modeldos.modeldos.diagram.preferences;

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
		Modeldos.modeldos.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		Modeldos.modeldos.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		Modeldos.modeldos.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		Modeldos.modeldos.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		Modeldos.modeldos.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
