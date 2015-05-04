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
	public static final IElementType Class_2007 = getElementType("modeluno.diagram.Class_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_Not_Derived_2008 = getElementType("modeluno.diagram.Attribute_Not_Derived_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Constraints_2009 = getElementType("modeluno.diagram.Constraints_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_Derived_2010 = getElementType("modeluno.diagram.Attribute_Derived_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Constraints_Relation_4007 = getElementType("modeluno.diagram.Constraints_Relation_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_Relation_4008 = getElementType("modeluno.diagram.Class_Relation_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_Relation_4009 = getElementType("modeluno.diagram.Attribute_Relation_4009"); //$NON-NLS-1$

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

			elements.put(Class_2007,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getClass_());

			elements.put(Attribute_Not_Derived_2008,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getAttribute_Not_Derived());

			elements.put(Constraints_2009,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getConstraints());

			elements.put(Attribute_Derived_2010,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getAttribute_Derived());

			elements.put(Constraints_Relation_4007,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getConstraints_Relation());

			elements.put(Class_Relation_4008,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getClass_Relation());

			elements.put(Attribute_Relation_4009,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getAttribute_Relation());
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
			KNOWN_ELEMENT_TYPES.add(Class_2007);
			KNOWN_ELEMENT_TYPES.add(Attribute_Not_Derived_2008);
			KNOWN_ELEMENT_TYPES.add(Constraints_2009);
			KNOWN_ELEMENT_TYPES.add(Attribute_Derived_2010);
			KNOWN_ELEMENT_TYPES.add(Constraints_Relation_4007);
			KNOWN_ELEMENT_TYPES.add(Class_Relation_4008);
			KNOWN_ELEMENT_TYPES.add(Attribute_Relation_4009);
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
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return Class_2007;
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return Attribute_Not_Derived_2008;
		case Modeluno.modeluno.diagram.edit.parts.ConstraintsEditPart.VISUAL_ID:
			return Constraints_2009;
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return Attribute_Derived_2010;
		case Modeluno.modeluno.diagram.edit.parts.Constraints_RelationEditPart.VISUAL_ID:
			return Constraints_Relation_4007;
		case Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID:
			return Class_Relation_4008;
		case Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID:
			return Attribute_Relation_4009;
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
