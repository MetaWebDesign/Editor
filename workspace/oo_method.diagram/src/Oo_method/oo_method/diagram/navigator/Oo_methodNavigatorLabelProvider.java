package Oo_method.oo_method.diagram.navigator;

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
public class Oo_methodNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Oo_method.oo_method.diagram.part.Oo_methodDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Oo_method.oo_method.diagram.part.Oo_methodDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem
				&& !isOwnView(((Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem) element)
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
		if (element instanceof Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorGroup) {
			Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorGroup group = (Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorGroup) element;
			return Oo_method.oo_method.diagram.part.Oo_methodDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem) {
			Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem navigatorItem = (Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem) element;
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
		switch (Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
				.getVisualID(view)) {
		case Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?oo_method?StructuralModel", Oo_method.oo_method.diagram.providers.Oo_methodElementTypes.StructuralModel_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Oo_method.oo_method.diagram.part.Oo_methodDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& Oo_method.oo_method.diagram.providers.Oo_methodElementTypes
						.isKnownElementType(elementType)) {
			image = Oo_method.oo_method.diagram.providers.Oo_methodElementTypes
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
		if (element instanceof Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorGroup) {
			Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorGroup group = (Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem) {
			Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem navigatorItem = (Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem) element;
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
		switch (Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
				.getVisualID(view)) {
		case Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID:
			return getStructuralModel_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStructuralModel_1000Text(View view) {
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
		return Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.MODEL_ID
				.equals(Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
						.getModelID(view));
	}

}
