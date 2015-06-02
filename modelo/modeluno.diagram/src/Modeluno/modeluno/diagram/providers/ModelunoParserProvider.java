package Modeluno.modeluno.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ModelunoParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser viewAdminTitle_5009Parser;

	/**
	 * @generated
	 */
	private IParser getViewAdminTitle_5009Parser() {
		if (viewAdminTitle_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewAdminTitle_5009Parser = parser;
		}
		return viewAdminTitle_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser adminName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getAdminName_5005Parser() {
		if (adminName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAdmin_Name() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			adminName_5005Parser = parser;
		}
		return adminName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewIndexTitle_5014Parser;

	/**
	 * @generated
	 */
	private IParser getViewIndexTitle_5014Parser() {
		if (viewIndexTitle_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewIndexTitle_5014Parser = parser;
		}
		return viewIndexTitle_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewInputTitle_5007Parser;

	/**
	 * @generated
	 */
	private IParser getViewInputTitle_5007Parser() {
		if (viewInputTitle_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewInputTitle_5007Parser = parser;
		}
		return viewInputTitle_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser listViewName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getListViewName_5012Parser() {
		if (listViewName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getListView_Name() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			listViewName_5012Parser = parser;
		}
		return listViewName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser classCname_5010Parser;

	/**
	 * @generated
	 */
	private IParser getClassCname_5010Parser() {
		if (classCname_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getClass_Cname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			classCname_5010Parser = parser;
		}
		return classCname_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser deleteName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getDeleteName_5016Parser() {
		if (deleteName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getDelete_Name() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			deleteName_5016Parser = parser;
		}
		return deleteName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_Not_DerivedAname_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_Not_DerivedAname_5002Parser() {
		if (attribute_Not_DerivedAname_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAttribute_Aname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			attribute_Not_DerivedAname_5002Parser = parser;
		}
		return attribute_Not_DerivedAname_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser pageTitle_5004Parser;

	/**
	 * @generated
	 */
	private IParser getPageTitle_5004Parser() {
		if (pageTitle_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			pageTitle_5004Parser = parser;
		}
		return pageTitle_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewAttributeTitle_5011Parser;

	/**
	 * @generated
	 */
	private IParser getViewAttributeTitle_5011Parser() {
		if (viewAttributeTitle_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewAttributeTitle_5011Parser = parser;
		}
		return viewAttributeTitle_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewUpdateAttributeTitle_5001Parser;

	/**
	 * @generated
	 */
	private IParser getViewUpdateAttributeTitle_5001Parser() {
		if (viewUpdateAttributeTitle_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewUpdateAttributeTitle_5001Parser = parser;
		}
		return viewUpdateAttributeTitle_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_DerivedAname_5015Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_DerivedAname_5015Parser() {
		if (attribute_DerivedAname_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAttribute_Aname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			attribute_DerivedAname_5015Parser = parser;
		}
		return attribute_DerivedAname_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser updateAttributeName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getUpdateAttributeName_5018Parser() {
		if (updateAttributeName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getUpdateAttribute_Name() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			updateAttributeName_5018Parser = parser;
		}
		return updateAttributeName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewUpdateObjectTitle_5008Parser;

	/**
	 * @generated
	 */
	private IParser getViewUpdateObjectTitle_5008Parser() {
		if (viewUpdateObjectTitle_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewUpdateObjectTitle_5008Parser = parser;
		}
		return viewUpdateObjectTitle_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getViewName_5003Parser() {
		if (viewName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getView_Name() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewName_5003Parser = parser;
		}
		return viewName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser createName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getCreateName_5006Parser() {
		if (createName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getCreate_Name() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			createName_5006Parser = parser;
		}
		return createName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser updateObjectName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getUpdateObjectName_5017Parser() {
		if (updateObjectName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getUpdateObject_Name() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			updateObjectName_5017Parser = parser;
		}
		return updateObjectName_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Modeluno.modeluno.diagram.edit.parts.ViewAdminTitleEditPart.VISUAL_ID:
			return getViewAdminTitle_5009Parser();
		case Modeluno.modeluno.diagram.edit.parts.AdminNameEditPart.VISUAL_ID:
			return getAdminName_5005Parser();
		case Modeluno.modeluno.diagram.edit.parts.ViewIndexTitleEditPart.VISUAL_ID:
			return getViewIndexTitle_5014Parser();
		case Modeluno.modeluno.diagram.edit.parts.ViewInputTitleEditPart.VISUAL_ID:
			return getViewInputTitle_5007Parser();
		case Modeluno.modeluno.diagram.edit.parts.ListViewNameEditPart.VISUAL_ID:
			return getListViewName_5012Parser();
		case Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID:
			return getClassCname_5010Parser();
		case Modeluno.modeluno.diagram.edit.parts.DeleteNameEditPart.VISUAL_ID:
			return getDeleteName_5016Parser();
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedAnameEditPart.VISUAL_ID:
			return getAttribute_Not_DerivedAname_5002Parser();
		case Modeluno.modeluno.diagram.edit.parts.PageTitleEditPart.VISUAL_ID:
			return getPageTitle_5004Parser();
		case Modeluno.modeluno.diagram.edit.parts.ViewAttributeTitleEditPart.VISUAL_ID:
			return getViewAttributeTitle_5011Parser();
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeTitleEditPart.VISUAL_ID:
			return getViewUpdateAttributeTitle_5001Parser();
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart.VISUAL_ID:
			return getAttribute_DerivedAname_5015Parser();
		case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeNameEditPart.VISUAL_ID:
			return getUpdateAttributeName_5018Parser();
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectTitleEditPart.VISUAL_ID:
			return getViewUpdateObjectTitle_5008Parser();
		case Modeluno.modeluno.diagram.edit.parts.ViewNameEditPart.VISUAL_ID:
			return getViewName_5003Parser();
		case Modeluno.modeluno.diagram.edit.parts.CreateNameEditPart.VISUAL_ID:
			return getCreateName_5006Parser();
		case Modeluno.modeluno.diagram.edit.parts.UpdateObjectNameEditPart.VISUAL_ID:
			return getUpdateObjectName_5017Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (Modeluno.modeluno.diagram.providers.ModelunoElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
