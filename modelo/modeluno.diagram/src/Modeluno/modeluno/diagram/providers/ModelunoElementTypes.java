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
	public static final IElementType Class_2004 = getElementType("modeluno.diagram.Class_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ANotDerived_2006 = getElementType("modeluno.diagram.ANotDerived_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ADerived_2005 = getElementType("modeluno.diagram.ADerived_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RAttribute_4005 = getElementType("modeluno.diagram.RAttribute_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_4006 = getElementType("modeluno.diagram.Relation_4006"); //$NON-NLS-1$

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

			elements.put(Class_2004,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getClass_());

			elements.put(ANotDerived_2006,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE
							.getANotDerived());

			elements.put(ADerived_2005,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getADerived());

			elements.put(RAttribute_4005,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getRAttribute());

			elements.put(Relation_4006,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getRelation());
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
			KNOWN_ELEMENT_TYPES.add(Class_2004);
			KNOWN_ELEMENT_TYPES.add(ANotDerived_2006);
			KNOWN_ELEMENT_TYPES.add(ADerived_2005);
			KNOWN_ELEMENT_TYPES.add(RAttribute_4005);
			KNOWN_ELEMENT_TYPES.add(Relation_4006);
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
			return Class_2004;
		case Modeluno.modeluno.diagram.edit.parts.ANotDerivedEditPart.VISUAL_ID:
			return ANotDerived_2006;
		case Modeluno.modeluno.diagram.edit.parts.ADerivedEditPart.VISUAL_ID:
			return ADerived_2005;
		case Modeluno.modeluno.diagram.edit.parts.RAttributeEditPart.VISUAL_ID:
			return RAttribute_4005;
		case Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return Relation_4006;
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
