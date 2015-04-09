package Modeldos.modeldos.diagram.providers;

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
		ElementInitializers cached = Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
