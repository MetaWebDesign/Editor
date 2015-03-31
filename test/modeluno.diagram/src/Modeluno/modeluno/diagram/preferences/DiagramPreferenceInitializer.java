package Modeluno.modeluno.diagram.preferences;

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
		Modeluno.modeluno.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		Modeluno.modeluno.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		Modeluno.modeluno.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		Modeluno.modeluno.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		Modeluno.modeluno.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
