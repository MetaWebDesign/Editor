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
	private IParser derivedName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getDerivedName_5013Parser() {
		if (derivedName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getAttributes_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			derivedName_5013Parser = parser;
		}
		return derivedName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewAttributeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getViewAttributeName_5006Parser() {
		if (viewAttributeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getViewAttribute_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			viewAttributeName_5006Parser = parser;
		}
		return viewAttributeName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDerivedName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getNotDerivedName_5016Parser() {
		if (notDerivedName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getAttributes_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			notDerivedName_5016Parser = parser;
		}
		return notDerivedName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser navegationMenuName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getNavegationMenuName_5014Parser() {
		if (navegationMenuName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getNavegationMenu_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			navegationMenuName_5014Parser = parser;
		}
		return navegationMenuName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5011Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5011Parser() {
		if (className_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getClass_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			className_5011Parser = parser;
		}
		return className_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser pageTitle_5005Parser;

	/**
	 * @generated
	 */
	private IParser getPageTitle_5005Parser() {
		if (pageTitle_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getViews_Title() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			pageTitle_5005Parser = parser;
		}
		return pageTitle_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkViewCRUDName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getLinkViewCRUDName_5017Parser() {
		if (linkViewCRUDName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getLink_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			linkViewCRUDName_5017Parser = parser;
		}
		return linkViewCRUDName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintName_5012Parser() {
		if (constraintName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getConstraint_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			constraintName_5012Parser = parser;
		}
		return constraintName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkViewName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getLinkViewName_5007Parser() {
		if (linkViewName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getLink_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			linkViewName_5007Parser = parser;
		}
		return linkViewName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkViewCRUDName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getLinkViewCRUDName_5002Parser() {
		if (linkViewCRUDName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getLink_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			linkViewCRUDName_5002Parser = parser;
		}
		return linkViewCRUDName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkViewName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getLinkViewName_5001Parser() {
		if (linkViewName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getLink_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			linkViewName_5001Parser = parser;
		}
		return linkViewName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintName_5010Parser() {
		if (constraintName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getConstraint_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			constraintName_5010Parser = parser;
		}
		return constraintName_5010Parser;
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
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getAttributes_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			derivedName_5008Parser = parser;
		}
		return derivedName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDerivedName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getNotDerivedName_5009Parser() {
		if (notDerivedName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getAttributes_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			notDerivedName_5009Parser = parser;
		}
		return notDerivedName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser navegationMenuName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getNavegationMenuName_5003Parser() {
		if (navegationMenuName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getNavegationMenu_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			navegationMenuName_5003Parser = parser;
		}
		return navegationMenuName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewAttributeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getViewAttributeName_5004Parser() {
		if (viewAttributeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getViewAttribute_Name() };
			Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser parser = new Metawebdesign.metawebdesign.diagram.parsers.MessageFormatParser(
					features);
			viewAttributeName_5004Parser = parser;
		}
		return viewAttributeName_5004Parser;
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
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedNameEditPart.VISUAL_ID:
			return getDerivedName_5013Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeNameEditPart.VISUAL_ID:
			return getViewAttributeName_5006Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedNameEditPart.VISUAL_ID:
			return getNotDerivedName_5016Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuNameEditPart.VISUAL_ID:
			return getNavegationMenuName_5014Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
			return getClassName_5011Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageTitleEditPart.VISUAL_ID:
			return getPageTitle_5005Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDNameEditPart.VISUAL_ID:
			return getLinkViewCRUDName_5017Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintNameEditPart.VISUAL_ID:
			return getConstraintName_5012Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewNameEditPart.VISUAL_ID:
			return getLinkViewName_5007Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDName2EditPart.VISUAL_ID:
			return getLinkViewCRUDName_5002Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewName2EditPart.VISUAL_ID:
			return getLinkViewName_5001Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintName2EditPart.VISUAL_ID:
			return getConstraintName_5010Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedName2EditPart.VISUAL_ID:
			return getDerivedName_5008Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart.VISUAL_ID:
			return getNotDerivedName_5009Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuName2EditPart.VISUAL_ID:
			return getNavegationMenuName_5003Parser();
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeName2EditPart.VISUAL_ID:
			return getViewAttributeName_5004Parser();
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
