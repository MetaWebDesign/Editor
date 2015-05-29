package Modeluno.modeluno.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ModelunoNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem
				&& !isOwnView(((Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup) {
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup group = (Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup) element;
			return Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem) {
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem navigatorItem = (Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://modeluno/1.0?Map", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Map_1000); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?Attribute_Derived", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2001); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?Class", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2002); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?Attribute_Not_Derived", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2003); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://modeluno/1.0?Attribute_Relation", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Relation_4001); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://modeluno/1.0?Class_Relation", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_Relation_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& Modeluno.modeluno.diagram.providers.ModelunoElementTypes
						.isKnownElementType(elementType)) {
			image = Modeluno.modeluno.diagram.providers.ModelunoElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup) {
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup group = (Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem) {
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem navigatorItem = (Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getMap_1000Text(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2001Text(view);
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2002Text(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2003Text(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID:
			return getAttribute_Relation_4001Text(view);
		case Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID:
			return getClass_Relation_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMap_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAttribute_Derived_2001Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2001,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2002Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2002,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_Not_Derived_2003Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2003,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedAnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_Relation_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClass_Relation_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Modeluno.modeluno.diagram.edit.parts.MapEditPart.MODEL_ID
				.equals(Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
						.getModelID(view));
	}

}
