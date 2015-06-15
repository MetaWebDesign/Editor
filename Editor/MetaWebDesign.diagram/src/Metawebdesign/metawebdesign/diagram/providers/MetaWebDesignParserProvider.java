package Metawebdesign.metawebdesign.diagram.providers;

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
public class MetaWebDesignParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser formTitle_5001Parser;

	/**
	 * @generated
	 */
	private IParser getFormTitle_5001Parser() {
		if (formTitle_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getViews_Title() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			formTitle_5001Parser = parser;
		}
		return formTitle_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser menuName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getMenuName_5003Parser() {
		if (menuName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getMenu_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			menuName_5003Parser = parser;
		}
		return menuName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser derivedName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getDerivedName_5004Parser() {
		if (derivedName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getAttributes_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			derivedName_5004Parser = parser;
		}
		return derivedName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDerivedName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getNotDerivedName_5005Parser() {
		if (notDerivedName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getAttributes_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			notDerivedName_5005Parser = parser;
		}
		return notDerivedName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getGroupName_5006Parser() {
		if (groupName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getGroup_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			groupName_5006Parser = parser;
		}
		return groupName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5009Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5009Parser() {
		if (className_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getClass_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			className_5009Parser = parser;
		}
		return className_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser pageTitle_5010Parser;

	/**
	 * @generated
	 */
	private IParser getPageTitle_5010Parser() {
		if (pageTitle_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getViews_Title() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			pageTitle_5010Parser = parser;
		}
		return pageTitle_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getGroupName_5002Parser() {
		if (groupName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getGroup_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			groupName_5002Parser = parser;
		}
		return groupName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser derivedName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getDerivedName_5007Parser() {
		if (derivedName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getAttributes_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			derivedName_5007Parser = parser;
		}
		return derivedName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDerivedName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getNotDerivedName_5008Parser() {
		if (notDerivedName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getAttributes_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			notDerivedName_5008Parser = parser;
		}
		return notDerivedName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationViewName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getRelationViewName_6001Parser() {
		if (relationViewName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getRelationView_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			relationViewName_6001Parser = parser;
		}
		return relationViewName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationClassName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getRelationClassName_6002Parser() {
		if (relationClassName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getRelationClass_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			relationClassName_6002Parser = parser;
		}
		return relationClassName_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormTitleEditPart.VISUAL_ID:
			return getFormTitle_5001Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.MenuNameEditPart.VISUAL_ID:
			return getMenuName_5003Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedNameEditPart.VISUAL_ID:
			return getDerivedName_5004Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedNameEditPart.VISUAL_ID:
			return getNotDerivedName_5005Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.GroupNameEditPart.VISUAL_ID:
			return getGroupName_5006Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
			return getClassName_5009Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageTitleEditPart.VISUAL_ID:
			return getPageTitle_5010Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.GroupName2EditPart.VISUAL_ID:
			return getGroupName_5002Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedName2EditPart.VISUAL_ID:
			return getDerivedName_5007Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart.VISUAL_ID:
			return getNotDerivedName_5008Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewNameEditPart.VISUAL_ID:
			return getRelationViewName_6001Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassNameEditPart.VISUAL_ID:
			return getRelationClassName_6002Parser();
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
			return getParser(Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
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
			if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
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
