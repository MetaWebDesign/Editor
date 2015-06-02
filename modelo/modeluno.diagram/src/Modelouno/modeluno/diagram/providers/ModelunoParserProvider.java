package Modelouno.modeluno.diagram.providers;

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
	private IParser createName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCreateName_5001Parser() {
		if (createName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getCreate_Name() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			createName_5001Parser = parser;
		}
		return createName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewIndexTitle_5002Parser;

	/**
	 * @generated
	 */
	private IParser getViewIndexTitle_5002Parser() {
		if (viewIndexTitle_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewIndexTitle_5002Parser = parser;
		}
		return viewIndexTitle_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewUpdateObjectTitle_5003Parser;

	/**
	 * @generated
	 */
	private IParser getViewUpdateObjectTitle_5003Parser() {
		if (viewUpdateObjectTitle_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewUpdateObjectTitle_5003Parser = parser;
		}
		return viewUpdateObjectTitle_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser adminName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getAdminName_5004Parser() {
		if (adminName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getAdmin_Name() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			adminName_5004Parser = parser;
		}
		return adminName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser classCname_5005Parser;

	/**
	 * @generated
	 */
	private IParser getClassCname_5005Parser() {
		if (classCname_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getClass_Cname() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			classCname_5005Parser = parser;
		}
		return classCname_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser updateObjectName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getUpdateObjectName_5006Parser() {
		if (updateObjectName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getUpdateObject_Name() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			updateObjectName_5006Parser = parser;
		}
		return updateObjectName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser pageTitle_5007Parser;

	/**
	 * @generated
	 */
	private IParser getPageTitle_5007Parser() {
		if (pageTitle_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			pageTitle_5007Parser = parser;
		}
		return pageTitle_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser deleteName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getDeleteName_5008Parser() {
		if (deleteName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getDelete_Name() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			deleteName_5008Parser = parser;
		}
		return deleteName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewAdminTitle_5009Parser;

	/**
	 * @generated
	 */
	private IParser getViewAdminTitle_5009Parser() {
		if (viewAdminTitle_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewAdminTitle_5009Parser = parser;
		}
		return viewAdminTitle_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewUpdateAttributeTitle_5010Parser;

	/**
	 * @generated
	 */
	private IParser getViewUpdateAttributeTitle_5010Parser() {
		if (viewUpdateAttributeTitle_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewUpdateAttributeTitle_5010Parser = parser;
		}
		return viewUpdateAttributeTitle_5010Parser;
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
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewAttributeTitle_5011Parser = parser;
		}
		return viewAttributeTitle_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser indexName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getIndexName_5012Parser() {
		if (indexName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getIndex_Name() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			indexName_5012Parser = parser;
		}
		return indexName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getViewName_5013Parser() {
		if (viewName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getView_Name() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewName_5013Parser = parser;
		}
		return viewName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser updateAttributeName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getUpdateAttributeName_5014Parser() {
		if (updateAttributeName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getUpdateAttribute_Name() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			updateAttributeName_5014Parser = parser;
		}
		return updateAttributeName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_Not_DerivedAname_5015Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_Not_DerivedAname_5015Parser() {
		if (attribute_Not_DerivedAname_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getAttribute_Aname() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			attribute_Not_DerivedAname_5015Parser = parser;
		}
		return attribute_Not_DerivedAname_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewInputTitle_5016Parser;

	/**
	 * @generated
	 */
	private IParser getViewInputTitle_5016Parser() {
		if (viewInputTitle_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getViews_Title() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			viewInputTitle_5016Parser = parser;
		}
		return viewInputTitle_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_DerivedAname_5017Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_DerivedAname_5017Parser() {
		if (attribute_DerivedAname_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getAttribute_Aname() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			attribute_DerivedAname_5017Parser = parser;
		}
		return attribute_DerivedAname_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser presetationUnitName_field_6001Parser;

	/**
	 * @generated
	 */
	private IParser getPresetationUnitName_field_6001Parser() {
		if (presetationUnitName_field_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getPresetationUnit_Name_field() };
			Modelouno.modeluno.diagram.parsers.MessageFormatParser parser = new Modelouno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			presetationUnitName_field_6001Parser = parser;
		}
		return presetationUnitName_field_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Modelouno.modeluno.diagram.edit.parts.CreateNameEditPart.VISUAL_ID:
			return getCreateName_5001Parser();
		case Modelouno.modeluno.diagram.edit.parts.ViewIndexTitleEditPart.VISUAL_ID:
			return getViewIndexTitle_5002Parser();
		case Modelouno.modeluno.diagram.edit.parts.ViewUpdateObjectTitleEditPart.VISUAL_ID:
			return getViewUpdateObjectTitle_5003Parser();
		case Modelouno.modeluno.diagram.edit.parts.AdminNameEditPart.VISUAL_ID:
			return getAdminName_5004Parser();
		case Modelouno.modeluno.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID:
			return getClassCname_5005Parser();
		case Modelouno.modeluno.diagram.edit.parts.UpdateObjectNameEditPart.VISUAL_ID:
			return getUpdateObjectName_5006Parser();
		case Modelouno.modeluno.diagram.edit.parts.PageTitleEditPart.VISUAL_ID:
			return getPageTitle_5007Parser();
		case Modelouno.modeluno.diagram.edit.parts.DeleteNameEditPart.VISUAL_ID:
			return getDeleteName_5008Parser();
		case Modelouno.modeluno.diagram.edit.parts.ViewAdminTitleEditPart.VISUAL_ID:
			return getViewAdminTitle_5009Parser();
		case Modelouno.modeluno.diagram.edit.parts.ViewUpdateAttributeTitleEditPart.VISUAL_ID:
			return getViewUpdateAttributeTitle_5010Parser();
		case Modelouno.modeluno.diagram.edit.parts.ViewAttributeTitleEditPart.VISUAL_ID:
			return getViewAttributeTitle_5011Parser();
		case Modelouno.modeluno.diagram.edit.parts.IndexNameEditPart.VISUAL_ID:
			return getIndexName_5012Parser();
		case Modelouno.modeluno.diagram.edit.parts.ViewNameEditPart.VISUAL_ID:
			return getViewName_5013Parser();
		case Modelouno.modeluno.diagram.edit.parts.UpdateAttributeNameEditPart.VISUAL_ID:
			return getUpdateAttributeName_5014Parser();
		case Modelouno.modeluno.diagram.edit.parts.Attribute_Not_DerivedAnameEditPart.VISUAL_ID:
			return getAttribute_Not_DerivedAname_5015Parser();
		case Modelouno.modeluno.diagram.edit.parts.ViewInputTitleEditPart.VISUAL_ID:
			return getViewInputTitle_5016Parser();
		case Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart.VISUAL_ID:
			return getAttribute_DerivedAname_5017Parser();
		case Modelouno.modeluno.diagram.edit.parts.PresetationUnitName_fieldEditPart.VISUAL_ID:
			return getPresetationUnitName_field_6001Parser();
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
			return getParser(Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
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
			if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes
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
