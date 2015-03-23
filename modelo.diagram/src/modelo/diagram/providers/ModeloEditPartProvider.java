package modelo.diagram.providers;

import modelo.diagram.edit.parts.ModelEditPart;
import modelo.diagram.edit.parts.ModeloEditPartFactory;
import modelo.diagram.part.ModeloVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class ModeloEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ModeloEditPartProvider() {
		super(new ModeloEditPartFactory(),
				ModeloVisualIDRegistry.TYPED_INSTANCE, ModelEditPart.MODEL_ID);
	}

}
