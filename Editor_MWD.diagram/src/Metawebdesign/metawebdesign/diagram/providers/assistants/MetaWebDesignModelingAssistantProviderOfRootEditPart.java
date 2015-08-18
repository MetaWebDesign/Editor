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
		List<IElementType> types = new ArrayList<IElementType>(10);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2001);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2002);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2003);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_2004);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2005);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2006);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_2007);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_2008);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2009);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2010);
		return types;
	}

}
