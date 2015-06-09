package Modeldos.modeldos.diagram.providers;

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
public class ModeldosParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser menuNombre_5002Parser;

	/**
	 * @generated
	 */
	private IParser getMenuNombre_5002Parser() {
		if (menuNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getMenu_Nombre() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			menuNombre_5002Parser = parser;
		}
		return menuNombre_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupNombre_5003Parser;

	/**
	 * @generated
	 */
	private IParser getGroupNombre_5003Parser() {
		if (groupNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getGroup_Nombre() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			groupNombre_5003Parser = parser;
		}
		return groupNombre_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDerivedName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getNotDerivedName_5004Parser() {
		if (notDerivedName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getAttributes_Name() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			notDerivedName_5004Parser = parser;
		}
		return notDerivedName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser formTitle_5005Parser;

	/**
	 * @generated
	 */
	private IParser getFormTitle_5005Parser() {
		if (formTitle_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getViews_Title() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			formTitle_5005Parser = parser;
		}
		return formTitle_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser pageTitle_5006Parser;

	/**
	 * @generated
	 */
	private IParser getPageTitle_5006Parser() {
		if (pageTitle_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getViews_Title() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			pageTitle_5006Parser = parser;
		}
		return pageTitle_5006Parser;
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
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getClass_Name() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			className_5009Parser = parser;
		}
		return className_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser derivedName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getDerivedName_5010Parser() {
		if (derivedName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getAttributes_Name() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			derivedName_5010Parser = parser;
		}
		return derivedName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupNombre_5001Parser;

	/**
	 * @generated
	 */
	private IParser getGroupNombre_5001Parser() {
		if (groupNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getGroup_Nombre() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			groupNombre_5001Parser = parser;
		}
		return groupNombre_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDerivedName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getNotDerivedName_5007Parser() {
		if (notDerivedName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getAttributes_Name() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			notDerivedName_5007Parser = parser;
		}
		return notDerivedName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser derivedName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getDerivedName_5008Parser() {
		if (derivedName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getAttributes_Name() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			derivedName_5008Parser = parser;
		}
		return derivedName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationClassRelationName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getRelationClassRelationName_6001Parser() {
		if (relationClassRelationName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getRelationClass_RelationName() };
			Modeldos.modeldos.diagram.parsers.MessageFormatParser parser = new Modeldos.modeldos.diagram.parsers.MessageFormatParser(
					features);
			relationClassRelationName_6001Parser = parser;
		}
		return relationClassRelationName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Modeldos.modeldos.diagram.edit.parts.MenuNombreEditPart.VISUAL_ID:
			return getMenuNombre_5002Parser();
		case Modeldos.modeldos.diagram.edit.parts.GroupNombreEditPart.VISUAL_ID:
			return getGroupNombre_5003Parser();
		case Modeldos.modeldos.diagram.edit.parts.NotDerivedNameEditPart.VISUAL_ID:
			return getNotDerivedName_5004Parser();
		case Modeldos.modeldos.diagram.edit.parts.FormTitleEditPart.VISUAL_ID:
			return getFormTitle_5005Parser();
		case Modeldos.modeldos.diagram.edit.parts.PageTitleEditPart.VISUAL_ID:
			return getPageTitle_5006Parser();
		case Modeldos.modeldos.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
			return getClassName_5009Parser();
		case Modeldos.modeldos.diagram.edit.parts.DerivedNameEditPart.VISUAL_ID:
			return getDerivedName_5010Parser();
		case Modeldos.modeldos.diagram.edit.parts.GroupNombre2EditPart.VISUAL_ID:
			return getGroupNombre_5001Parser();
		case Modeldos.modeldos.diagram.edit.parts.NotDerivedName2EditPart.VISUAL_ID:
			return getNotDerivedName_5007Parser();
		case Modeldos.modeldos.diagram.edit.parts.DerivedName2EditPart.VISUAL_ID:
			return getDerivedName_5008Parser();
		case Modeldos.modeldos.diagram.edit.parts.RelationClassRelationNameEditPart.VISUAL_ID:
			return getRelationClassRelationName_6001Parser();
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
			return getParser(Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
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
			if (Modeldos.modeldos.diagram.providers.ModeldosElementTypes
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
