package modelo.diagram.navigator;

import modelo.diagram.part.ModeloVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ModeloNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ModeloNavigatorItem) {
			ModeloNavigatorItem item = (ModeloNavigatorItem) element;
			return ModeloVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
