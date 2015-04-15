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
	private IParser classCname_5004Parser;

	/**
	 * @generated
	 */
	private IParser getClassCname_5004Parser() {
		if (classCname_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getClass_Cname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			classCname_5004Parser = parser;
		}
		return classCname_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser aDerivedAname_5005Parser;

	/**
	 * @generated
	 */
	private IParser getADerivedAname_5005Parser() {
		if (aDerivedAname_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAtributte_Aname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			aDerivedAname_5005Parser = parser;
		}
		return aDerivedAname_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser aNotDerivedAname_5006Parser;

	/**
	 * @generated
	 */
	private IParser getANotDerivedAname_5006Parser() {
		if (aNotDerivedAname_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAtributte_Aname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			aNotDerivedAname_5006Parser = parser;
		}
		return aNotDerivedAname_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID:
			return getClassCname_5004Parser();
		case Modeluno.modeluno.diagram.edit.parts.ADerivedAnameEditPart.VISUAL_ID:
			return getADerivedAname_5005Parser();
		case Modeluno.modeluno.diagram.edit.parts.ANotDerivedAnameEditPart.VISUAL_ID:
			return getANotDerivedAname_5006Parser();
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
