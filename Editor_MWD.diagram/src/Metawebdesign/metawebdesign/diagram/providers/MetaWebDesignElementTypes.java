package Metawebdesign.metawebdesign.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MetaWebDesignElementTypes {

	/**
	 * @generated
	 */
	private MetaWebDesignElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Root_1000 = getElementType("Editor_MWD.diagram.Root_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Form_2005 = getElementType("Editor_MWD.diagram.Form_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_2011 = getElementType("Editor_MWD.diagram.Class_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkViewCRUD_2010 = getElementType("Editor_MWD.diagram.LinkViewCRUD_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_2009 = getElementType("Editor_MWD.diagram.Group_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NavegationMenu_2007 = getElementType("Editor_MWD.diagram.NavegationMenu_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CallAtribute_2006 = getElementType("Editor_MWD.diagram.CallAtribute_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NotDerived_2008 = getElementType("Editor_MWD.diagram.NotDerived_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Derived_2004 = getElementType("Editor_MWD.diagram.Derived_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Page_2003 = getElementType("Editor_MWD.diagram.Page_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Constraint_2002 = getElementType("Editor_MWD.diagram.Constraint_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Menu_2012 = getElementType("Editor_MWD.diagram.Menu_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkView_2001 = getElementType("Editor_MWD.diagram.LinkView_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CallAtribute_3001 = getElementType("Editor_MWD.diagram.CallAtribute_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NavegationMenu_3002 = getElementType("Editor_MWD.diagram.NavegationMenu_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkView_3003 = getElementType("Editor_MWD.diagram.LinkView_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkViewCRUD_3004 = getElementType("Editor_MWD.diagram.LinkViewCRUD_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Derived_3005 = getElementType("Editor_MWD.diagram.Derived_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NotDerived_3006 = getElementType("Editor_MWD.diagram.NotDerived_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_3007 = getElementType("Editor_MWD.diagram.Group_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationContraint_4001 = getElementType("Editor_MWD.diagram.RelationContraint_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationView_4003 = getElementType("Editor_MWD.diagram.RelationView_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationClass_4002 = getElementType("Editor_MWD.diagram.RelationClass_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Root_1000,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getRoot());

			elements.put(Form_2005,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getForm());

			elements.put(Class_2011,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getClass_());

			elements.put(LinkViewCRUD_2010,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getLinkViewCRUD());

			elements.put(Group_2009,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getGroup());

			elements.put(NavegationMenu_2007,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getNavegationMenu());

			elements.put(CallAtribute_2006,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getCallAtribute());

			elements.put(NotDerived_2008,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getNotDerived());

			elements.put(Derived_2004,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getDerived());

			elements.put(Page_2003,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getPage());

			elements.put(Constraint_2002,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getConstraint());

			elements.put(Menu_2012,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getMenu());

			elements.put(LinkView_2001,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getLinkView());

			elements.put(CallAtribute_3001,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getCallAtribute());

			elements.put(NavegationMenu_3002,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getNavegationMenu());

			elements.put(LinkView_3003,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getLinkView());

			elements.put(LinkViewCRUD_3004,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getLinkViewCRUD());

			elements.put(Derived_3005,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getDerived());

			elements.put(NotDerived_3006,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getNotDerived());

			elements.put(Group_3007,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getGroup());

			elements.put(RelationContraint_4001,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getRelationContraint());

			elements.put(RelationView_4003,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getRelationView());

			elements.put(RelationClass_4002,
					Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
							.getRelationClass());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Root_1000);
			KNOWN_ELEMENT_TYPES.add(Form_2005);
			KNOWN_ELEMENT_TYPES.add(Class_2011);
			KNOWN_ELEMENT_TYPES.add(LinkViewCRUD_2010);
			KNOWN_ELEMENT_TYPES.add(Group_2009);
			KNOWN_ELEMENT_TYPES.add(NavegationMenu_2007);
			KNOWN_ELEMENT_TYPES.add(CallAtribute_2006);
			KNOWN_ELEMENT_TYPES.add(NotDerived_2008);
			KNOWN_ELEMENT_TYPES.add(Derived_2004);
			KNOWN_ELEMENT_TYPES.add(Page_2003);
			KNOWN_ELEMENT_TYPES.add(Constraint_2002);
			KNOWN_ELEMENT_TYPES.add(Menu_2012);
			KNOWN_ELEMENT_TYPES.add(LinkView_2001);
			KNOWN_ELEMENT_TYPES.add(CallAtribute_3001);
			KNOWN_ELEMENT_TYPES.add(NavegationMenu_3002);
			KNOWN_ELEMENT_TYPES.add(LinkView_3003);
			KNOWN_ELEMENT_TYPES.add(LinkViewCRUD_3004);
			KNOWN_ELEMENT_TYPES.add(Derived_3005);
			KNOWN_ELEMENT_TYPES.add(NotDerived_3006);
			KNOWN_ELEMENT_TYPES.add(Group_3007);
			KNOWN_ELEMENT_TYPES.add(RelationContraint_4001);
			KNOWN_ELEMENT_TYPES.add(RelationView_4003);
			KNOWN_ELEMENT_TYPES.add(RelationClass_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return Root_1000;
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return Form_2005;
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return Class_2011;
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
			return LinkViewCRUD_2010;
		case Metawebdesign.metawebdesign.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return Group_2009;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
			return NavegationMenu_2007;
		case Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeEditPart.VISUAL_ID:
			return CallAtribute_2006;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return NotDerived_2008;
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return Derived_2004;
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return Page_2003;
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return Constraint_2002;
		case Metawebdesign.metawebdesign.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return Menu_2012;
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
			return LinkView_2001;
		case Metawebdesign.metawebdesign.diagram.edit.parts.CallAtribute2EditPart.VISUAL_ID:
			return CallAtribute_3001;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
			return NavegationMenu_3002;
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
			return LinkView_3003;
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
			return LinkViewCRUD_3004;
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return Derived_3005;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return NotDerived_3006;
		case Metawebdesign.metawebdesign.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return Group_3007;
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintEditPart.VISUAL_ID:
			return RelationContraint_4001;
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return RelationView_4003;
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return RelationClass_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
