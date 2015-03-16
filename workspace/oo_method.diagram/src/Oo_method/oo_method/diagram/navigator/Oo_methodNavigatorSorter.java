package Oo_method.oo_method.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Oo_methodNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 1002;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem) {
			Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem item = (Oo_method.oo_method.diagram.navigator.Oo_methodNavigatorItem) element;
			return Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
