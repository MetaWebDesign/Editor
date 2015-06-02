package Modelouno.modeluno.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Attribute_DerivedItemSemanticEditPolicy
		extends
		Modelouno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Attribute_DerivedItemSemanticEditPolicy() {
		super(
				Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2017);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(incomingLink) == Modelouno.modeluno.diagram.edit.parts.Relation_AttributeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(outgoingLink) == Modelouno.modeluno.diagram.edit.parts.PresetationUnitEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Attribute_4001 == req
				.getElementType()) {
			return null;
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.PresetationUnit_4005 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.PresetationUnitCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Attribute_4001 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.Relation_AttributeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.PresetationUnit_4005 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case Modelouno.modeluno.diagram.edit.parts.Relation_AttributeEditPart.VISUAL_ID:
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.Relation_AttributeReorientCommand(
					req));
		case Modelouno.modeluno.diagram.edit.parts.PresetationUnitEditPart.VISUAL_ID:
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.PresetationUnitReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
