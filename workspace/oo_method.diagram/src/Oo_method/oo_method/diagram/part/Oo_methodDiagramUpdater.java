package Oo_method.oo_method.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Oo_methodDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Oo_method.oo_method.diagram.part.Oo_methodNodeDescriptor> getSemanticChildren(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Oo_method.oo_method.diagram.part.Oo_methodLinkDescriptor> getContainedLinks(
			View view) {
		switch (Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
				.getVisualID(view)) {
		case Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID:
			return getStructuralModel_1000ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Oo_method.oo_method.diagram.part.Oo_methodLinkDescriptor> getIncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Oo_method.oo_method.diagram.part.Oo_methodLinkDescriptor> getOutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Oo_method.oo_method.diagram.part.Oo_methodLinkDescriptor> getStructuralModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<Oo_method.oo_method.diagram.part.Oo_methodNodeDescriptor> getSemanticChildren(
				View view) {
			return Oo_methodDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Oo_method.oo_method.diagram.part.Oo_methodLinkDescriptor> getContainedLinks(
				View view) {
			return Oo_methodDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Oo_method.oo_method.diagram.part.Oo_methodLinkDescriptor> getIncomingLinks(
				View view) {
			return Oo_methodDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Oo_method.oo_method.diagram.part.Oo_methodLinkDescriptor> getOutgoingLinks(
				View view) {
			return Oo_methodDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
