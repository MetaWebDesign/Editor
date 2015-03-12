package oo_method.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
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
	public static List<oo_method.diagram.part.Oo_methodNodeDescriptor> getSemanticChildren(
			View view) {
		switch (oo_method.diagram.part.Oo_methodVisualIDRegistry
				.getVisualID(view)) {
		case oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID:
			return getStructuralModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<oo_method.diagram.part.Oo_methodNodeDescriptor> getStructuralModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		oo_method.StructuralModel modelElement = (oo_method.StructuralModel) view
				.getElement();
		LinkedList<oo_method.diagram.part.Oo_methodNodeDescriptor> result = new LinkedList<oo_method.diagram.part.Oo_methodNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClasses().iterator(); it
				.hasNext();) {
			oo_method.Class childElement = (oo_method.Class) it.next();
			int visualID = oo_method.diagram.part.Oo_methodVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == oo_method.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
				result.add(new oo_method.diagram.part.Oo_methodNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<oo_method.diagram.part.Oo_methodLinkDescriptor> getContainedLinks(
			View view) {
		switch (oo_method.diagram.part.Oo_methodVisualIDRegistry
				.getVisualID(view)) {
		case oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID:
			return getStructuralModel_1000ContainedLinks(view);
		case oo_method.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<oo_method.diagram.part.Oo_methodLinkDescriptor> getIncomingLinks(
			View view) {
		switch (oo_method.diagram.part.Oo_methodVisualIDRegistry
				.getVisualID(view)) {
		case oo_method.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<oo_method.diagram.part.Oo_methodLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (oo_method.diagram.part.Oo_methodVisualIDRegistry
				.getVisualID(view)) {
		case oo_method.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<oo_method.diagram.part.Oo_methodLinkDescriptor> getStructuralModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<oo_method.diagram.part.Oo_methodLinkDescriptor> getClass_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<oo_method.diagram.part.Oo_methodLinkDescriptor> getClass_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<oo_method.diagram.part.Oo_methodLinkDescriptor> getClass_2001OutgoingLinks(
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
		public List<oo_method.diagram.part.Oo_methodNodeDescriptor> getSemanticChildren(
				View view) {
			return Oo_methodDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<oo_method.diagram.part.Oo_methodLinkDescriptor> getContainedLinks(
				View view) {
			return Oo_methodDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<oo_method.diagram.part.Oo_methodLinkDescriptor> getIncomingLinks(
				View view) {
			return Oo_methodDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<oo_method.diagram.part.Oo_methodLinkDescriptor> getOutgoingLinks(
				View view) {
			return Oo_methodDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
