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
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Form", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2001); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Derived", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2002); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Page", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2003); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?LinkView", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_2004); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Constraint", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2005); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?NotDerived", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2006); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?ViewAttribute", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_2007); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?LinkViewCRUD", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_2008); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?Class", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2009); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://metawebdesign/1.0?NavegationMenu", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2010); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://metawebdesign/1.0?ViewAttribute", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_3001); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://metawebdesign/1.0?NavegationMenu", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3002); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://metawebdesign/1.0?LinkView", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3003); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://metawebdesign/1.0?LinkViewCRUD", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3004); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://metawebdesign/1.0?Derived", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3005); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://metawebdesign/1.0?NotDerived", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3006); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://metawebdesign/1.0?RelationClass", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4001); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://metawebdesign/1.0?RelationView", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4002); //$NON-NLS-1$
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://metawebdesign/1.0?RelationContraint", Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4003); //$NON-NLS-1$
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
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2001Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2002Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2003Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
			return getLinkView_2004Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_2005Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2006Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2007Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
			return getLinkViewCRUD_2008Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2009Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
			return getNavegationMenu_2010Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID:
			return getViewAttribute_3001Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
			return getNavegationMenu_3002Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
			return getLinkView_3003Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
			return getLinkViewCRUD_3004Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3005Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3006Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4001Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getRelationView_4002Text(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintEditPart.VISUAL_ID:
			return getRelationContraint_4003Text(view);
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
	private String getForm_2001Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2001,
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
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDerived_2002Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2002,
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
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPage_2003Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2003,
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
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkView_2004Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_2004,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewNameEditPart.VISUAL_ID));
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
	private String getConstraint_2005Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2005,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintNameEditPart.VISUAL_ID));
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
	private String getNotDerived_2006Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2006,
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
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getViewAttribute_2007Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_2007,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkViewCRUD_2008Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_2008,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2009Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2009,
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
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNavegationMenu_2010Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2010,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getViewAttribute_3001Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_3001,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeName2EditPart.VISUAL_ID));
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
	private String getNavegationMenu_3002Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3002,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuName2EditPart.VISUAL_ID));
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
	private String getLinkView_3003Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3003,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewName2EditPart.VISUAL_ID));
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
	private String getLinkViewCRUD_3004Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3004,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDName2EditPart.VISUAL_ID));
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
	private String getDerived_3005Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3005,
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
							"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotDerived_3006Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3006,
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
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationClass_4001Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4001,
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
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationView_4002Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4002,
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
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationContraint_4003Text(View view) {
		IParser parser = Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignParserProvider
				.getParser(
						Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4003,
						view.getElement() != null ? view.getElement() : view,
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
								.getType(Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6003); //$NON-NLS-1$
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
