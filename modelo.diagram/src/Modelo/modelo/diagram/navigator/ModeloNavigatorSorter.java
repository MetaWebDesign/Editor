package Modelo.modelo.diagram.navigator;

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
		if (element instanceof Modelo.modelo.diagram.navigator.ModeloNavigatorItem) {
			Modelo.modelo.diagram.navigator.ModeloNavigatorItem item = (Modelo.modelo.diagram.navigator.ModeloNavigatorItem) element;
			return Modelo.modelo.diagram.part.ModeloVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
