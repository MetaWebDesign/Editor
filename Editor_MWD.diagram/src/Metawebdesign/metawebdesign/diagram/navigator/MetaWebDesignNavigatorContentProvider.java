package Metawebdesign.metawebdesign.diagram.navigator;

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
public class MetaWebDesignNavigatorContentProvider implements
		ICommonContentProvider {

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
	public MetaWebDesignNavigatorContentProvider() {
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
			ArrayList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem> result = new ArrayList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem>();
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
							Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup) {
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup group = (Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem) {
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem navigatorItem = (Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem) parentElement;
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
		switch (Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getVisualID(view)) {

		case Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID: {
			LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem> result = new LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup links = new Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup(
					Metawebdesign.metawebdesign.diagram.part.Messages.NavigatorGroupName_Root_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID));
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID));
<<<<<<< HEAD
=======
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID));
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID));
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID));
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID));
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID));
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID));
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID));
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID: {
			LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem> result = new LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem>();
			Node sv = (Node) view;
<<<<<<< HEAD
=======
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup outgoinglinks = new Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup(
					Metawebdesign.metawebdesign.diagram.part.Messages.NavigatorGroupName_Page_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.PageCompartmentCajonPageEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.PageCompartmentCajonPageEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID: {
			LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem> result = new LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem>();
			Node sv = (Node) view;
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup incominglinks = new Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup(
					Metawebdesign.metawebdesign.diagram.part.Messages.NavigatorGroupName_Class_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup outgoinglinks = new Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup(
					Metawebdesign.metawebdesign.diagram.part.Messages.NavigatorGroupName_Class_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ClassCompartmentCajonClassEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ClassCompartmentCajonClassEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ClassCompartmentCajonClassEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
<<<<<<< HEAD
=======
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
<<<<<<< HEAD
=======
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID: {
			LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem> result = new LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenu2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenu2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID: {
			LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem> result = new LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem>();
			Node sv = (Node) view;
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup outgoinglinks = new Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup(
					Metawebdesign.metawebdesign.diagram.part.Messages.NavigatorGroupName_Form_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

<<<<<<< HEAD
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID: {
			LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem> result = new LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenuEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenuEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

=======
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID: {
			LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem> result = new LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenu2EditPart.VISUAL_ID));
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenuEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			connectedViews = getChildrenByType(
					connectedViews,
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
<<<<<<< HEAD
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenu2EditPart.VISUAL_ID));
=======
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenuEditPart.VISUAL_ID));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			connectedViews = getChildrenByType(
					connectedViews,
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

<<<<<<< HEAD
=======
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID: {
			LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem> result = new LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup target = new Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup(
					Metawebdesign.metawebdesign.diagram.part.Messages.NavigatorGroupName_RelationView_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup source = new Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup(
					Metawebdesign.metawebdesign.diagram.part.Messages.NavigatorGroupName_RelationView_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID));
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

>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID: {
			LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem> result = new LinkedList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup target = new Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup(
					Metawebdesign.metawebdesign.diagram.part.Messages.NavigatorGroupName_RelationClass_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup source = new Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorGroup(
					Metawebdesign.metawebdesign.diagram.part.Messages.NavigatorGroupName_RelationClass_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
							.getType(Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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
		return Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem> result = new ArrayList<Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem) {
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem abstractNavigatorItem = (Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignAbstractNavigatorItem) element;
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
