package Modelo.modelo.diagram.part;

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
public class ModeloCreationWizard extends Wizard implements INewWizard {

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
	protected Modelo.modelo.diagram.part.ModeloCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected Modelo.modelo.diagram.part.ModeloCreationWizardPage domainModelFilePage;

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
		setWindowTitle(Modelo.modelo.diagram.part.Messages.ModeloCreationWizardTitle);
		setDefaultPageImageDescriptor(Modelo.modelo.diagram.part.ModeloDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewModeloWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new Modelo.modelo.diagram.part.ModeloCreationWizardPage(
				"DiagramModelFile", getSelection(), "modelo_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Modelo.modelo.diagram.part.Messages.ModeloCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Modelo.modelo.diagram.part.Messages.ModeloCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new Modelo.modelo.diagram.part.ModeloCreationWizardPage(
				"DomainModelFile", getSelection(), "modelo") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".modelo_diagram".length()); //$NON-NLS-1$
					setFileName(Modelo.modelo.diagram.part.ModeloDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "modelo")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Modelo.modelo.diagram.part.Messages.ModeloCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Modelo.modelo.diagram.part.Messages.ModeloCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = Modelo.modelo.diagram.part.ModeloDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						Modelo.modelo.diagram.part.ModeloDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										Modelo.modelo.diagram.part.Messages.ModeloCreationWizardOpenEditorError,
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
								Modelo.modelo.diagram.part.Messages.ModeloCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				Modelo.modelo.diagram.part.ModeloDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
