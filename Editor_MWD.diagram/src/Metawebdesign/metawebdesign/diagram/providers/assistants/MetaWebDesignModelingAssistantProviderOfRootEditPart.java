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
		List<IElementType> types = new ArrayList<IElementType>(9);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2006);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_2002);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2009);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2007);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2004);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2001);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_2010);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2005);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_2003);
		return types;
	}

}
