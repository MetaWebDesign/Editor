package Modeldos.modeldos.diagram.navigator;

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
public class ModeldosNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem
				&& !isOwnView(((Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem) element)
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
		if (element instanceof Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup) {
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup group = (Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup) element;
			return Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem) {
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem navigatorItem = (Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem) element;
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
		switch (Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getVisualID(view)) {
		case Modeldos.modeldos.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://modeldos/1.0?Map", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Map_1000); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeldos/1.0?Class", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2001); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://modeldos/1.0?Relation", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Relation_4001); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://modeldos/1.0?Atributte", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Atributte_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& Modeldos.modeldos.diagram.providers.ModeldosElementTypes
						.isKnownElementType(elementType)) {
			image = Modeldos.modeldos.diagram.providers.ModeldosElementTypes
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
		if (element instanceof Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup) {
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup group = (Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem) {
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem navigatorItem = (Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem) element;
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
		switch (Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getVisualID(view)) {
		case Modeldos.modeldos.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getMap_1000Text(view);
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001Text(view);
		case Modeldos.modeldos.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001Text(view);
		case Modeldos.modeldos.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
			return getAtributte_4002Text(view);
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
	private String getClass_2001Text(View view) {
		IParser parser = Modeldos.modeldos.diagram.providers.ModeldosParserProvider
				.getParser(
						Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2001,
						view.getElement() != null ? view.getElement() : view,
						Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
								.getType(Modeldos.modeldos.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelation_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAtributte_4002Text(View view) {
		IParser parser = Modeldos.modeldos.diagram.providers.ModeldosParserProvider
				.getParser(
						Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Atributte_4002,
						view.getElement() != null ? view.getElement() : view,
						Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
								.getType(Modeldos.modeldos.diagram.edit.parts.AtributteAnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
		return Modeldos.modeldos.diagram.edit.parts.MapEditPart.MODEL_ID
				.equals(Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
						.getModelID(view));
	}

}
