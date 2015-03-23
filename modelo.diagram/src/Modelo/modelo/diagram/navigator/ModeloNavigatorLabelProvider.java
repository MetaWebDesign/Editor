package Modelo.modelo.diagram.navigator;

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
public class ModeloNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Modelo.modelo.diagram.part.ModeloDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Modelo.modelo.diagram.part.ModeloDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Modelo.modelo.diagram.navigator.ModeloNavigatorItem
				&& !isOwnView(((Modelo.modelo.diagram.navigator.ModeloNavigatorItem) element)
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
		if (element instanceof Modelo.modelo.diagram.navigator.ModeloNavigatorGroup) {
			Modelo.modelo.diagram.navigator.ModeloNavigatorGroup group = (Modelo.modelo.diagram.navigator.ModeloNavigatorGroup) element;
			return Modelo.modelo.diagram.part.ModeloDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof Modelo.modelo.diagram.navigator.ModeloNavigatorItem) {
			Modelo.modelo.diagram.navigator.ModeloNavigatorItem navigatorItem = (Modelo.modelo.diagram.navigator.ModeloNavigatorItem) element;
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
		switch (Modelo.modelo.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view)) {
		case Modelo.modelo.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://modelo/1.0?Model", Modelo.modelo.diagram.providers.ModeloElementTypes.Model_1000); //$NON-NLS-1$
		case Modelo.modelo.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modelo/1.0?Class", Modelo.modelo.diagram.providers.ModeloElementTypes.Class_2001); //$NON-NLS-1$
		case Modelo.modelo.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://modelo/1.0?Relation", Modelo.modelo.diagram.providers.ModeloElementTypes.Relation_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Modelo.modelo.diagram.part.ModeloDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& Modelo.modelo.diagram.providers.ModeloElementTypes
						.isKnownElementType(elementType)) {
			image = Modelo.modelo.diagram.providers.ModeloElementTypes
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
		if (element instanceof Modelo.modelo.diagram.navigator.ModeloNavigatorGroup) {
			Modelo.modelo.diagram.navigator.ModeloNavigatorGroup group = (Modelo.modelo.diagram.navigator.ModeloNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Modelo.modelo.diagram.navigator.ModeloNavigatorItem) {
			Modelo.modelo.diagram.navigator.ModeloNavigatorItem navigatorItem = (Modelo.modelo.diagram.navigator.ModeloNavigatorItem) element;
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
		switch (Modelo.modelo.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view)) {
		case Modelo.modelo.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case Modelo.modelo.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001Text(view);
		case Modelo.modelo.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClass_2001Text(View view) {
		IParser parser = Modelo.modelo.diagram.providers.ModeloParserProvider
				.getParser(
						Modelo.modelo.diagram.providers.ModeloElementTypes.Class_2001,
						view.getElement() != null ? view.getElement() : view,
						Modelo.modelo.diagram.part.ModeloVisualIDRegistry
								.getType(Modelo.modelo.diagram.edit.parts.ClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modelo.modelo.diagram.part.ModeloDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
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
		return Modelo.modelo.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(Modelo.modelo.diagram.part.ModeloVisualIDRegistry
						.getModelID(view));
	}

}
