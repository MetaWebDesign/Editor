package Modeldos.modeldos.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ModeldosNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem) {
			Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem item = (Modeldos.modeldos.diagram.navigator.ModeldosNavigatorItem) element;
			return Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
