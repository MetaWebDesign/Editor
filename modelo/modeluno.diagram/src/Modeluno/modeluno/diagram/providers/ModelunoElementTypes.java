package Modeluno.modeluno.diagram.providers;

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
public class ModelunoElementTypes {

	/**
	 * @generated
	 */
	private ModelunoElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Map_1000 = getElementType("modeluno.diagram.Map_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewAdmin_2009 = getElementType("modeluno.diagram.ViewAdmin_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Admin_2005 = getElementType("modeluno.diagram.Admin_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewIndex_2014 = getElementType("modeluno.diagram.ViewIndex_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewInput_2007 = getElementType("modeluno.diagram.ViewInput_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ListView_2012 = getElementType("modeluno.diagram.ListView_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_2010 = getElementType("modeluno.diagram.Class_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Delete_2016 = getElementType("modeluno.diagram.Delete_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_Not_Derived_2002 = getElementType("modeluno.diagram.Attribute_Not_Derived_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Page_2004 = getElementType("modeluno.diagram.Page_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewAttribute_2011 = getElementType("modeluno.diagram.ViewAttribute_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewUpdateAttribute_2001 = getElementType("modeluno.diagram.ViewUpdateAttribute_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_Derived_2015 = getElementType("modeluno.diagram.Attribute_Derived_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UpdateAttribute_2018 = getElementType("modeluno.diagram.UpdateAttribute_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewUpdateObject_2008 = getElementType("modeluno.diagram.ViewUpdateObject_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType View_2003 = getElementType("modeluno.diagram.View_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Create_2006 = getElementType("modeluno.diagram.Create_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UpdateObject_2017 = getElementType("modeluno.diagram.UpdateObject_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationClass_4005 = getElementType("modeluno.diagram.RelationClass_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationService_4001 = getElementType("modeluno.diagram.RelationService_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationView_4007 = getElementType("modeluno.diagram.RelationView_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationAttribute_4003 = getElementType("modeluno.diagram.RelationAttribute_4003"); //$NON-NLS-1$

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

			elements.put(Map_1000,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getMap());

			elements.put(ViewAdmin_2009,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getViewAdmin());

			elements.put(Admin_2005,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getAdmin());

			elements.put(ViewIndex_2014,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getViewIndex());

			elements.put(ViewInput_2007,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getViewInput());

			elements.put(ListView_2012,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getListView());

			elements.put(Class_2010,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getClass_());

			elements.put(Delete_2016,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getDelete());

			elements.put(Attribute_Not_Derived_2002,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getAttribute_Not_Derived());

			elements.put(Page_2004,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getPage());

			elements.put(ViewAttribute_2011,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getViewAttribute());

			elements.put(ViewUpdateAttribute_2001,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getViewUpdateAttribute());

			elements.put(Attribute_Derived_2015,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getAttribute_Derived());

			elements.put(UpdateAttribute_2018,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getUpdateAttribute());

			elements.put(ViewUpdateObject_2008,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getViewUpdateObject());

			elements.put(View_2003,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getView());

			elements.put(Create_2006,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getCreate());

			elements.put(UpdateObject_2017,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getUpdateObject());

			elements.put(RelationClass_4005,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getRelationClass());

			elements.put(RelationService_4001,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getRelationService());

			elements.put(RelationView_4007,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getRelationView());

			elements.put(RelationAttribute_4003,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getRelationAttribute());
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
			KNOWN_ELEMENT_TYPES.add(Map_1000);
			KNOWN_ELEMENT_TYPES.add(ViewAdmin_2009);
			KNOWN_ELEMENT_TYPES.add(Admin_2005);
			KNOWN_ELEMENT_TYPES.add(ViewIndex_2014);
			KNOWN_ELEMENT_TYPES.add(ViewInput_2007);
			KNOWN_ELEMENT_TYPES.add(ListView_2012);
			KNOWN_ELEMENT_TYPES.add(Class_2010);
			KNOWN_ELEMENT_TYPES.add(Delete_2016);
			KNOWN_ELEMENT_TYPES.add(Attribute_Not_Derived_2002);
			KNOWN_ELEMENT_TYPES.add(Page_2004);
			KNOWN_ELEMENT_TYPES.add(ViewAttribute_2011);
			KNOWN_ELEMENT_TYPES.add(ViewUpdateAttribute_2001);
			KNOWN_ELEMENT_TYPES.add(Attribute_Derived_2015);
			KNOWN_ELEMENT_TYPES.add(UpdateAttribute_2018);
			KNOWN_ELEMENT_TYPES.add(ViewUpdateObject_2008);
			KNOWN_ELEMENT_TYPES.add(View_2003);
			KNOWN_ELEMENT_TYPES.add(Create_2006);
			KNOWN_ELEMENT_TYPES.add(UpdateObject_2017);
			KNOWN_ELEMENT_TYPES.add(RelationClass_4005);
			KNOWN_ELEMENT_TYPES.add(RelationService_4001);
			KNOWN_ELEMENT_TYPES.add(RelationView_4007);
			KNOWN_ELEMENT_TYPES.add(RelationAttribute_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return Map_1000;
		case Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			return ViewAdmin_2009;
		case Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			return Admin_2005;
		case Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			return ViewIndex_2014;
		case Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			return ViewInput_2007;
		case Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID:
			return ListView_2012;
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return Class_2010;
		case Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			return Delete_2016;
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return Attribute_Not_Derived_2002;
		case Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return Page_2004;
		case Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return ViewAttribute_2011;
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			return ViewUpdateAttribute_2001;
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return Attribute_Derived_2015;
		case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return UpdateAttribute_2018;
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			return ViewUpdateObject_2008;
		case Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return View_2003;
		case Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return Create_2006;
		case Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			return UpdateObject_2017;
		case Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return RelationClass_4005;
		case Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID:
			return RelationService_4001;
		case Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return RelationView_4007;
		case Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID:
			return RelationAttribute_4003;
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
			return Modeluno.modeluno.diagram.providers.ModelunoElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return Modeluno.modeluno.diagram.providers.ModelunoElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return Modeluno.modeluno.diagram.providers.ModelunoElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
