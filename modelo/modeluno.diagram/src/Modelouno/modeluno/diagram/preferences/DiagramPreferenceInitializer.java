package Modelouno.modeluno.diagram.preferences;

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
		Modelouno.modeluno.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		Modelouno.modeluno.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		Modelouno.modeluno.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		Modelouno.modeluno.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		Modelouno.modeluno.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Modelouno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
