package oo_method.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = oo_method.diagram.part.Oo_methodDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			oo_method.diagram.part.Oo_methodDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
