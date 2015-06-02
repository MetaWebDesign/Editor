package Modeluno.modeluno.diagram.navigator;

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
public class ModelunoNavigatorContentProvider implements ICommonContentProvider {

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
	public ModelunoNavigatorContentProvider() {
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
			ArrayList<Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem> result = new ArrayList<Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem>();
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
							Modeluno.modeluno.diagram.edit.parts.MapEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup) {
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup group = (Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem) {
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem navigatorItem = (Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem) parentElement;
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
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {

		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup links = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Map_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_ViewUpdateAttribute_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Attribute_Not_Derived_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_View_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup outgoinglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_View_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Page_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Admin_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup outgoinglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Admin_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Create_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup outgoinglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Create_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_ViewInput_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_ViewUpdateObject_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_ViewAdmin_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Class_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup outgoinglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Class_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_ViewAttribute_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_ListView_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup outgoinglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_ListView_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_ViewIndex_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Attribute_Derived_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Delete_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup outgoinglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_Delete_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_UpdateObject_2017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup outgoinglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_UpdateObject_2017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Node sv = (Node) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup incominglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_UpdateAttribute_2018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup outgoinglinks = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_UpdateAttribute_2018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup target = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_RelationService_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup source = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_RelationService_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup target = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_RelationAttribute_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup source = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_RelationAttribute_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup target = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_RelationClass_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup source = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_RelationClass_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID: {
			LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem> result = new LinkedList<Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup target = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_RelationView_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup source = new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorGroup(
					Modeluno.modeluno.diagram.part.Messages.NavigatorGroupName_RelationView_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
							.getType(Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID));
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
		return Modeluno.modeluno.diagram.edit.parts.MapEditPart.MODEL_ID
				.equals(Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem> result = new ArrayList<Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem) {
			Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem abstractNavigatorItem = (Modeluno.modeluno.diagram.navigator.ModelunoAbstractNavigatorItem) element;
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
