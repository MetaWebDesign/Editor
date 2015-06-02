package Modelouno.modeluno.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ModelunoNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Modelouno.modeluno.diagram.navigator.ModelunoNavigatorItem) {
			Modelouno.modeluno.diagram.navigator.ModelunoNavigatorItem item = (Modelouno.modeluno.diagram.navigator.ModelunoNavigatorItem) element;
			return Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
