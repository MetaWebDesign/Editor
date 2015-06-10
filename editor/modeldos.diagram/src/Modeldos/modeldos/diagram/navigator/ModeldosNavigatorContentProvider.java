package Modeldos.modeldos.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class ModeldosNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ModeldosNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem> result = new ArrayList<Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							Modeldos.modeldos.diagram.edit.parts.RootEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup) {
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup group = (Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem) {
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem navigatorItem = (Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getVisualID(view)) {

		case Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID: {
			LinkedList<Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem> result = new LinkedList<Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup links = new Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup(
					Modeldos.modeldos.diagram.part.Messages.NavigatorGroupName_Root_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID: {
			LinkedList<Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem> result = new LinkedList<Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup incominglinks = new Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup(
					Modeldos.modeldos.diagram.part.Messages.NavigatorGroupName_Class_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup outgoinglinks = new Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup(
					Modeldos.modeldos.diagram.part.Messages.NavigatorGroupName_Class_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.ClassAttributeInClassCajonEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.ClassAttributeInClassCajonEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.Derived2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID: {
			LinkedList<Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem> result = new LinkedList<Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.MenuGrupoInMenuCajonEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID: {
			LinkedList<Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem> result = new LinkedList<Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup target = new Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup(
					Modeldos.modeldos.diagram.part.Messages.NavigatorGroupName_RelationClass_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup source = new Modeldos.modeldos.diagram.navigator.ModeldosNavigatorGroup(
					Modeldos.modeldos.diagram.part.Messages.NavigatorGroupName_RelationClass_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
							.getType(Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Modeldos.modeldos.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem> result = new ArrayList<Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem) {
			Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem abstractNavigatorItem = (Modeldos.modeldos.diagram.navigator.ModeldosAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}