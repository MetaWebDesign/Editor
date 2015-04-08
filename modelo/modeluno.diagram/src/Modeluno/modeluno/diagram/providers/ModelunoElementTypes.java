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
	public static final IElementType Class_2001 = getElementType("modeluno.diagram.Class_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_4001 = getElementType("modeluno.diagram.Relation_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Atributte_4002 = getElementType("modeluno.diagram.Atributte_4002"); //$NON-NLS-1$

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

			elements.put(Class_2001,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getClass_());

			elements.put(Relation_4001,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getRelation());

			elements.put(Atributte_4002,
					Modeluno.modeluno.ModelunoPackage.eINSTANCE.getAtributte());
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
			KNOWN_ELEMENT_TYPES.add(Class_2001);
			KNOWN_ELEMENT_TYPES.add(Relation_4001);
			KNOWN_ELEMENT_TYPES.add(Atributte_4002);
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
			return Class_2001;
		case Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return Relation_4001;
		case Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
			return Atributte_4002;
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
