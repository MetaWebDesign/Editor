package Metawebdesign.metawebdesign.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class MetaWebDesignCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.diagram.part.MetaWebDesignCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.diagram.part.MetaWebDesignCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Metawebdesign.metawebdesign.diagram.part.Messages.MetaWebDesignCreationWizardTitle);
		setDefaultPageImageDescriptor(Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewMetawebdesignWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignCreationWizardPage(
				"DiagramModelFile", getSelection(), "metawebdesign_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Metawebdesign.metawebdesign.diagram.part.Messages.MetaWebDesignCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Metawebdesign.metawebdesign.diagram.part.Messages.MetaWebDesignCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignCreationWizardPage(
				"DomainModelFile", getSelection(), "metawebdesign") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".metawebdesign_diagram".length()); //$NON-NLS-1$
					setFileName(Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "metawebdesign")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Metawebdesign.metawebdesign.diagram.part.Messages.MetaWebDesignCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Metawebdesign.metawebdesign.diagram.part.Messages.MetaWebDesignCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										Metawebdesign.metawebdesign.diagram.part.Messages.MetaWebDesignCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								Metawebdesign.metawebdesign.diagram.part.Messages.MetaWebDesignCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
