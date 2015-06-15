package Metawebdesign.metawebdesign.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MetaWebDesignModelingAssistantProviderOfRootEditPart
		extends
		Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2001);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2002);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2003);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2004);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Menu_2005);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2006);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_2007);
		return types;
	}

}
