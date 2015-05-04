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
	private IParser classCname_5007Parser;

	/**
	 * @generated
	 */
	private IParser getClassCname_5007Parser() {
		if (classCname_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getClass_Cname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			classCname_5007Parser = parser;
		}
		return classCname_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_Not_DerivedAname_5008Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_Not_DerivedAname_5008Parser() {
		if (attribute_Not_DerivedAname_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAttribute_Aname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			attribute_Not_DerivedAname_5008Parser = parser;
		}
		return attribute_Not_DerivedAname_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintsComments_5009Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintsComments_5009Parser() {
		if (constraintsComments_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getConstraints_Comments() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			constraintsComments_5009Parser = parser;
		}
		return constraintsComments_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_DerivedAname_5010Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_DerivedAname_5010Parser() {
		if (attribute_DerivedAname_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAttribute_Aname() };
			Modeluno.modeluno.diagram.parsers.MessageFormatParser parser = new Modeluno.modeluno.diagram.parsers.MessageFormatParser(
					features);
			attribute_DerivedAname_5010Parser = parser;
		}
		return attribute_DerivedAname_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID:
			return getClassCname_5007Parser();
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedAnameEditPart.VISUAL_ID:
			return getAttribute_Not_DerivedAname_5008Parser();
		case Modeluno.modeluno.diagram.edit.parts.ConstraintsCommentsEditPart.VISUAL_ID:
			return getConstraintsComments_5009Parser();
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart.VISUAL_ID:
			return getAttribute_DerivedAname_5010Parser();
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
