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
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?ViewUpdateAttribute", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateAttribute_2001); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?Attribute_Not_Derived", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2002); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?View", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.View_2003); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?Page", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Page_2004); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?Admin", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Admin_2005); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?Create", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Create_2006); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?ViewInput", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewInput_2007); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?ViewUpdateObject", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateObject_2008); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?ViewAdmin", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewAdmin_2009); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?Class", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2010); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?ViewAttribute", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewAttribute_2011); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?ListView", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ListView_2012); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?ViewIndex", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewIndex_2014); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?Attribute_Derived", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2015); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?Delete", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Delete_2016); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?UpdateObject", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.UpdateObject_2017); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://modeluno/1.0?UpdateAttribute", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.UpdateAttribute_2018); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://modeluno/1.0?RelationService", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationService_4001); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://modeluno/1.0?RelationAttribute", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationAttribute_4003); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://modeluno/1.0?RelationClass", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationClass_4005); //$NON-NLS-1$
		case Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://modeluno/1.0?RelationView", Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007); //$NON-NLS-1$
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
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			return getViewUpdateAttribute_2001Text(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2002Text(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2003Text(view);
		case Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2004Text(view);
		case Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			return getAdmin_2005Text(view);
		case Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2006Text(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			return getViewInput_2007Text(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			return getViewUpdateObject_2008Text(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			return getViewAdmin_2009Text(view);
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2010Text(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2011Text(view);
		case Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID:
			return getListView_2012Text(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			return getViewIndex_2014Text(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2015Text(view);
		case Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			return getDelete_2016Text(view);
		case Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			return getUpdateObject_2017Text(view);
		case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return getUpdateAttribute_2018Text(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID:
			return getRelationService_4001Text(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID:
			return getRelationAttribute_4003Text(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4005Text(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getRelationView_4007Text(view);
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
	private String getViewUpdateAttribute_2001Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateAttribute_2001,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeTitleEditPart.VISUAL_ID));
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
	private String getAttribute_Not_Derived_2002Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2002,
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
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getView_2003Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.View_2003,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.ViewNameEditPart.VISUAL_ID));
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
	private String getPage_2004Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Page_2004,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.PageTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAdmin_2005Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Admin_2005,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.AdminNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCreate_2006Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Create_2006,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.CreateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getViewInput_2007Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewInput_2007,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.ViewInputTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getViewUpdateObject_2008Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateObject_2008,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getViewAdmin_2009Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewAdmin_2009,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.ViewAdminTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2010Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2010,
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
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getViewAttribute_2011Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewAttribute_2011,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.ViewAttributeTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getListView_2012Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ListView_2012,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.ListViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getViewIndex_2014Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewIndex_2014,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.ViewIndexTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_Derived_2015Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2015,
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
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelete_2016Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Delete_2016,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.DeleteNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUpdateObject_2017Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.UpdateObject_2017,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.UpdateObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUpdateAttribute_2018Text(View view) {
		IParser parser = Modeluno.modeluno.diagram.providers.ModelunoParserProvider
				.getParser(
						Modeluno.modeluno.diagram.providers.ModelunoElementTypes.UpdateAttribute_2018,
						view.getElement() != null ? view.getElement() : view,
						Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
								.getType(Modeluno.modeluno.diagram.edit.parts.UpdateAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationService_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelationAttribute_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelationClass_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelationView_4007Text(View view) {
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
