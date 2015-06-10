package Modeldos.modeldos.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModeldosModelingAssistantProviderOfRootEditPart extends
		Modeldos.modeldos.diagram.providers.ModeldosModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2001);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Form_2002);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Page_2003);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Group_2004);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Menu_2005);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Derived_2006);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.NotDerived_2007);
		return types;
	}

}
