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
	private IParser classCname_5001Parser;

	/**
	 * @generated
	 */
	private IParser getClassCname_5001Parser() {
		if (classCname_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getClass_Cname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			classCname_5001Parser = parser;
		}
		return classCname_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributteAname_6001Parser;

	/**
	 * @generated
	 */
	private IParser getAtributteAname_6001Parser() {
		if (atributteAname_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAtributte_Aname() };
			EAttribute[] editableFeatures = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAtributte_Aname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			atributteAname_6001Parser = parser;
		}
		return atributteAname_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID:
			return getClassCname_5001Parser();
		case Modeluno.modeluno.diagram.edit.parts.AtributteAnameEditPart.VISUAL_ID:
			return getAtributteAname_6001Parser();
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
