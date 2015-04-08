package Modeluno.modeluno.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ModelunoNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem) {
			Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem item = (Modeluno.modeluno.diagram.navigator.ModelunoNavigatorItem) element;
			return Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
