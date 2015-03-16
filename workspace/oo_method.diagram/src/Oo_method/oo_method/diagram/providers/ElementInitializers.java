package Oo_method.oo_method.diagram.providers;

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
		ElementInitializers cached = Oo_method.oo_method.diagram.part.Oo_methodDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			Oo_method.oo_method.diagram.part.Oo_methodDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
