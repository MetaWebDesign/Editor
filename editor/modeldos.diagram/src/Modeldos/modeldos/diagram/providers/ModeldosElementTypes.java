package Modeldos.modeldos.diagram.providers;

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
public class ModeldosElementTypes {

	/**
	 * @generated
	 */
	private ModeldosElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Root_1000 = getElementType("modeldos.diagram.Root_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_2001 = getElementType("modeldos.diagram.Class_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Form_2002 = getElementType("modeldos.diagram.Form_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Page_2003 = getElementType("modeldos.diagram.Page_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_2004 = getElementType("modeldos.diagram.Group_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Menu_2005 = getElementType("modeldos.diagram.Menu_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Derived_2006 = getElementType("modeldos.diagram.Derived_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NotDerived_2007 = getElementType("modeldos.diagram.NotDerived_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NotDerived_3001 = getElementType("modeldos.diagram.NotDerived_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Derived_3002 = getElementType("modeldos.diagram.Derived_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_3003 = getElementType("modeldos.diagram.Group_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationClass_4001 = getElementType("modeldos.diagram.RelationClass_4001"); //$NON-NLS-1$

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
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getRoot());

			elements.put(Class_2001,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getClass_());

			elements.put(Form_2002,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getForm());

			elements.put(Page_2003,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getPage());

			elements.put(Group_2004,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getGroup());

			elements.put(Menu_2005,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getMenu());

			elements.put(Derived_2006,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getDerived());

			elements.put(NotDerived_2007,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getNotDerived());

			elements.put(NotDerived_3001,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getNotDerived());

			elements.put(Derived_3002,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getDerived());

			elements.put(Group_3003,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE.getGroup());

			elements.put(RelationClass_4001,
					Modeldos.modeldos.ModeldosPackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(Class_2001);
			KNOWN_ELEMENT_TYPES.add(Form_2002);
			KNOWN_ELEMENT_TYPES.add(Page_2003);
			KNOWN_ELEMENT_TYPES.add(Group_2004);
			KNOWN_ELEMENT_TYPES.add(Menu_2005);
			KNOWN_ELEMENT_TYPES.add(Derived_2006);
			KNOWN_ELEMENT_TYPES.add(NotDerived_2007);
			KNOWN_ELEMENT_TYPES.add(NotDerived_3001);
			KNOWN_ELEMENT_TYPES.add(Derived_3002);
			KNOWN_ELEMENT_TYPES.add(Group_3003);
			KNOWN_ELEMENT_TYPES.add(RelationClass_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return Root_1000;
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return Class_2001;
		case Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return Form_2002;
		case Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return Page_2003;
		case Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return Group_2004;
		case Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return Menu_2005;
		case Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return Derived_2006;
		case Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return NotDerived_2007;
		case Modeldos.modeldos.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return NotDerived_3001;
		case Modeldos.modeldos.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return Derived_3002;
		case Modeldos.modeldos.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return Group_3003;
		case Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return RelationClass_4001;
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
			return Modeldos.modeldos.diagram.providers.ModeldosElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return Modeldos.modeldos.diagram.providers.ModeldosElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return Modeldos.modeldos.diagram.providers.ModeldosElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
