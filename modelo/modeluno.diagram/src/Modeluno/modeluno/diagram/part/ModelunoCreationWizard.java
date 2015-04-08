package Modeluno.modeluno.diagram.part;

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
public class ModelunoCreationWizard extends Wizard implements INewWizard {

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
	protected Modeluno.modeluno.diagram.part.ModelunoCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.diagram.part.ModelunoCreationWizardPage domainModelFilePage;

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
		setWindowTitle(Modeluno.modeluno.diagram.part.Messages.ModelunoCreationWizardTitle);
		setDefaultPageImageDescriptor(Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewModelunoWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new Modeluno.modeluno.diagram.part.ModelunoCreationWizardPage(
				"DiagramModelFile", getSelection(), "modeluno_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Modeluno.modeluno.diagram.part.Messages.ModelunoCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Modeluno.modeluno.diagram.part.Messages.ModelunoCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new Modeluno.modeluno.diagram.part.ModelunoCreationWizardPage(
				"DomainModelFile", getSelection(), "modeluno") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".modeluno_diagram".length()); //$NON-NLS-1$
					setFileName(Modeluno.modeluno.diagram.part.ModelunoDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "modeluno")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Modeluno.modeluno.diagram.part.Messages.ModelunoCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Modeluno.modeluno.diagram.part.Messages.ModelunoCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = Modeluno.modeluno.diagram.part.ModelunoDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						Modeluno.modeluno.diagram.part.ModelunoDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										Modeluno.modeluno.diagram.part.Messages.ModelunoCreationWizardOpenEditorError,
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
								Modeluno.modeluno.diagram.part.Messages.ModelunoCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
