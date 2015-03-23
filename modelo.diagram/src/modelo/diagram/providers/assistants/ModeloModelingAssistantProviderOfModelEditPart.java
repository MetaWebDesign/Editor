package modelo.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import modelo.diagram.providers.ModeloElementTypes;
import modelo.diagram.providers.ModeloModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModeloModelingAssistantProviderOfModelEditPart extends
		ModeloModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModeloElementTypes.Class_2001);
		return types;
	}

}
