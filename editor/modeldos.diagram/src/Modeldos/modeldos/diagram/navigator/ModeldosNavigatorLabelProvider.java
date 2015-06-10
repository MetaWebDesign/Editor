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
		case Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://modeldos/1.0?Root", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Root_1000); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeldos/1.0?Menu", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Menu_2001); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeldos/1.0?Group", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Group_2002); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeldos/1.0?NotDerived", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.NotDerived_2003); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeldos/1.0?Form", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Form_2004); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeldos/1.0?Page", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Page_2005); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeldos/1.0?Class", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2006); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeldos/1.0?Derived", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Derived_2007); //$NON-NLS-1$
		case Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://modeldos/1.0?RelationClass", Modeldos.modeldos.diagram.providers.ModeldosElementTypes.RelationClass_4001); //$NON-NLS-1$
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
		case Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getRoot_1000Text(view);
		case Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getMenu_2001Text(view);
		case Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2002Text(view);
		case Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2003Text(view);
		case Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2004Text(view);
		case Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2005Text(view);
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2006Text(view);
		case Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2007Text(view);
		case Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRoot_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMenu_2001Text(View view) {
		IParser parser = Modeldos.modeldos.diagram.providers.ModeldosParserProvider
				.getParser(
						Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Menu_2001,
						view.getElement() != null ? view.getElement() : view,
						Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
								.getType(Modeldos.modeldos.diagram.edit.parts.MenuNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_2002Text(View view) {
		IParser parser = Modeldos.modeldos.diagram.providers.ModeldosParserProvider
				.getParser(
						Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Group_2002,
						view.getElement() != null ? view.getElement() : view,
						Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
								.getType(Modeldos.modeldos.diagram.edit.parts.GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotDerived_2003Text(View view) {
		IParser parser = Modeldos.modeldos.diagram.providers.ModeldosParserProvider
				.getParser(
						Modeldos.modeldos.diagram.providers.ModeldosElementTypes.NotDerived_2003,
						view.getElement() != null ? view.getElement() : view,
						Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
								.getType(Modeldos.modeldos.diagram.edit.parts.NotDerivedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForm_2004Text(View view) {
		IParser parser = Modeldos.modeldos.diagram.providers.ModeldosParserProvider
				.getParser(
						Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Form_2004,
						view.getElement() != null ? view.getElement() : view,
						Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
								.getType(Modeldos.modeldos.diagram.edit.parts.FormTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPage_2005Text(View view) {
		IParser parser = Modeldos.modeldos.diagram.providers.ModeldosParserProvider
				.getParser(
						Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Page_2005,
						view.getElement() != null ? view.getElement() : view,
						Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
								.getType(Modeldos.modeldos.diagram.edit.parts.PageTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2006Text(View view) {
		IParser parser = Modeldos.modeldos.diagram.providers.ModeldosParserProvider
				.getParser(
						Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2006,
						view.getElement() != null ? view.getElement() : view,
						Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
								.getType(Modeldos.modeldos.diagram.edit.parts.ClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDerived_2007Text(View view) {
		IParser parser = Modeldos.modeldos.diagram.providers.ModeldosParserProvider
				.getParser(
						Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Derived_2007,
						view.getElement() != null ? view.getElement() : view,
						Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
								.getType(Modeldos.modeldos.diagram.edit.parts.DerivedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationClass_4001Text(View view) {
		IParser parser = Modeldos.modeldos.diagram.providers.ModeldosParserProvider
				.getParser(
						Modeldos.modeldos.diagram.providers.ModeldosElementTypes.RelationClass_4001,
						view.getElement() != null ? view.getElement() : view,
						Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
								.getType(Modeldos.modeldos.diagram.edit.parts.RelationClassNameEditPart.VISUAL_ID));
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
		return Modeldos.modeldos.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
						.getModelID(view));
	}

}
