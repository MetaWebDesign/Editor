package Metawebdesign.metawebdesign.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MetaWebDesignNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem) {
			Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem item = (Metawebdesign.metawebdesign.diagram.navigator.MetaWebDesignNavigatorItem) element;
			return Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
