package Modeluno.modeluno.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModelunoModelingAssistantProviderOfMapEditPart extends
		Modeluno.modeluno.diagram.providers.ModelunoModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2001);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2002);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2003);
		return types;
	}

}
