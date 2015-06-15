package Metawebdesign.metawebdesign.diagram.navigator;

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
public class MetaWebDesignNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem
				&& !isOwnView(((Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem) element)
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
		if (element instanceof Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup) {
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup group = (Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup) element;
			return Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem) {
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem navigatorItem = (Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem) element;
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
		switch (Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getVisualID(view)) {
		case Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://metawebdesign/1.0?Root", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Root_1000); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Class", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2001); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?NotDerived", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2002); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Derived", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2003); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Page", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2004); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Menu", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Menu_2005); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Form", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2006); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Group", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_2007); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://metawebdesign/1.0?Derived", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3001); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://metawebdesign/1.0?NotDerived", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3002); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://metawebdesign/1.0?Group", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_3003); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://metawebdesign/1.0?RelationView", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://metawebdesign/1.0?RelationClass", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
						.isKnownElementType(elementType)) {
			image = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
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
		if (element instanceof Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup) {
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup group = (Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem) {
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem navigatorItem = (Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem) element;
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
		switch (Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getVisualID(view)) {
		case Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getRoot_1000Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2002Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2003Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2004Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getMenu_2005Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2006Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2007Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3001Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3002Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3003Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getRelationView_4001Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4002Text(view);
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
	private String getClass_2001Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2001,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotDerived_2002Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2002,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDerived_2003Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2003,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.DerivedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPage_2004Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2004,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.PageTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMenu_2005Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Menu_2005,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.MenuNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForm_2006Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2006,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.FormTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_2007Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_2007,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDerived_3001Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3001,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.DerivedName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotDerived_3002Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3002,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_3003Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_3003,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.GroupName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationView_4001Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationClass_4002Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
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
		return Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
						.getModelID(view));
	}

}
