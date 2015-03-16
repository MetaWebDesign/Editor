package Oo_method.oo_method.diagram.preferences;

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
		Oo_method.oo_method.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		Oo_method.oo_method.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		Oo_method.oo_method.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		Oo_method.oo_method.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		Oo_method.oo_method.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Oo_method.oo_method.diagram.part.Oo_methodDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
