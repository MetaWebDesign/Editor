package Modelouno.modeluno.diagram.providers;

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
			Modelouno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
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
	public static final IElementType Create_2001 = getElementType("modeluno.diagram.Create_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewIndex_2002 = getElementType("modeluno.diagram.ViewIndex_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewUpdateObject_2003 = getElementType("modeluno.diagram.ViewUpdateObject_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Admin_2004 = getElementType("modeluno.diagram.Admin_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_2005 = getElementType("modeluno.diagram.Class_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UpdateObject_2006 = getElementType("modeluno.diagram.UpdateObject_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Page_2007 = getElementType("modeluno.diagram.Page_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Delete_2008 = getElementType("modeluno.diagram.Delete_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewAdmin_2009 = getElementType("modeluno.diagram.ViewAdmin_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewUpdateAttribute_2010 = getElementType("modeluno.diagram.ViewUpdateAttribute_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewAttribute_2011 = getElementType("modeluno.diagram.ViewAttribute_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Index_2012 = getElementType("modeluno.diagram.Index_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType View_2013 = getElementType("modeluno.diagram.View_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UpdateAttribute_2014 = getElementType("modeluno.diagram.UpdateAttribute_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_Not_Derived_2015 = getElementType("modeluno.diagram.Attribute_Not_Derived_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewInput_2016 = getElementType("modeluno.diagram.ViewInput_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_Derived_2017 = getElementType("modeluno.diagram.Attribute_Derived_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_Attribute_4001 = getElementType("modeluno.diagram.Relation_Attribute_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_View_4002 = getElementType("modeluno.diagram.Relation_View_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_Class_4003 = getElementType("modeluno.diagram.Relation_Class_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_Service_4004 = getElementType("modeluno.diagram.Relation_Service_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PresetationUnit_4005 = getElementType("modeluno.diagram.PresetationUnit_4005"); //$NON-NLS-1$

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
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getMap());

			elements.put(Create_2001,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getCreate());

			elements.put(ViewIndex_2002,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getViewIndex());

			elements.put(ViewUpdateObject_2003,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getViewUpdateObject());

			elements.put(Admin_2004,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getAdmin());

			elements.put(Class_2005,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getClass_());

			elements.put(UpdateObject_2006,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getUpdateObject());

			elements.put(Page_2007,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getPage());

			elements.put(Delete_2008,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getDelete());

			elements.put(ViewAdmin_2009,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getViewAdmin());

			elements.put(ViewUpdateAttribute_2010,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getViewUpdateAttribute());

			elements.put(ViewAttribute_2011,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getViewAttribute());

			elements.put(Index_2012,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getIndex());

			elements.put(View_2013,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getView());

			elements.put(UpdateAttribute_2014,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getUpdateAttribute());

			elements.put(Attribute_Not_Derived_2015,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getAttribute_Not_Derived());

			elements.put(ViewInput_2016,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE.getViewInput());

			elements.put(Attribute_Derived_2017,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getAttribute_Derived());

			elements.put(Relation_Attribute_4001,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getRelation_Attribute());

			elements.put(Relation_View_4002,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getRelation_View());

			elements.put(Relation_Class_4003,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getRelation_Class());

			elements.put(Relation_Service_4004,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getRelation_Service());

			elements.put(PresetationUnit_4005,
					Modelouno.modeluno.ModelunoPackage.eINSTANCE
							.getPresetationUnit());
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
			KNOWN_ELEMENT_TYPES.add(Create_2001);
			KNOWN_ELEMENT_TYPES.add(ViewIndex_2002);
			KNOWN_ELEMENT_TYPES.add(ViewUpdateObject_2003);
			KNOWN_ELEMENT_TYPES.add(Admin_2004);
			KNOWN_ELEMENT_TYPES.add(Class_2005);
			KNOWN_ELEMENT_TYPES.add(UpdateObject_2006);
			KNOWN_ELEMENT_TYPES.add(Page_2007);
			KNOWN_ELEMENT_TYPES.add(Delete_2008);
			KNOWN_ELEMENT_TYPES.add(ViewAdmin_2009);
			KNOWN_ELEMENT_TYPES.add(ViewUpdateAttribute_2010);
			KNOWN_ELEMENT_TYPES.add(ViewAttribute_2011);
			KNOWN_ELEMENT_TYPES.add(Index_2012);
			KNOWN_ELEMENT_TYPES.add(View_2013);
			KNOWN_ELEMENT_TYPES.add(UpdateAttribute_2014);
			KNOWN_ELEMENT_TYPES.add(Attribute_Not_Derived_2015);
			KNOWN_ELEMENT_TYPES.add(ViewInput_2016);
			KNOWN_ELEMENT_TYPES.add(Attribute_Derived_2017);
			KNOWN_ELEMENT_TYPES.add(Relation_Attribute_4001);
			KNOWN_ELEMENT_TYPES.add(Relation_View_4002);
			KNOWN_ELEMENT_TYPES.add(Relation_Class_4003);
			KNOWN_ELEMENT_TYPES.add(Relation_Service_4004);
			KNOWN_ELEMENT_TYPES.add(PresetationUnit_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Modelouno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return Map_1000;
		case Modelouno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return Create_2001;
		case Modelouno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			return ViewIndex_2002;
		case Modelouno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			return ViewUpdateObject_2003;
		case Modelouno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			return Admin_2004;
		case Modelouno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return Class_2005;
		case Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			return UpdateObject_2006;
		case Modelouno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return Page_2007;
		case Modelouno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			return Delete_2008;
		case Modelouno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			return ViewAdmin_2009;
		case Modelouno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			return ViewUpdateAttribute_2010;
		case Modelouno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return ViewAttribute_2011;
		case Modelouno.modeluno.diagram.edit.parts.IndexEditPart.VISUAL_ID:
			return Index_2012;
		case Modelouno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return View_2013;
		case Modelouno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return UpdateAttribute_2014;
		case Modelouno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return Attribute_Not_Derived_2015;
		case Modelouno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			return ViewInput_2016;
		case Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return Attribute_Derived_2017;
		case Modelouno.modeluno.diagram.edit.parts.Relation_AttributeEditPart.VISUAL_ID:
			return Relation_Attribute_4001;
		case Modelouno.modeluno.diagram.edit.parts.Relation_ViewEditPart.VISUAL_ID:
			return Relation_View_4002;
		case Modelouno.modeluno.diagram.edit.parts.Relation_ClassEditPart.VISUAL_ID:
			return Relation_Class_4003;
		case Modelouno.modeluno.diagram.edit.parts.Relation_ServiceEditPart.VISUAL_ID:
			return Relation_Service_4004;
		case Modelouno.modeluno.diagram.edit.parts.PresetationUnitEditPart.VISUAL_ID:
			return PresetationUnit_4005;
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
			return Modelouno.modeluno.diagram.providers.ModelunoElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return Modelouno.modeluno.diagram.providers.ModelunoElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return Modelouno.modeluno.diagram.providers.ModelunoElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
