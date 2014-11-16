package org.umbrella.MapWatcher.SwingUI;

import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class ShowTableListner implements TreeSelectionListener {
	private JTable bind_table = null;
	private JTree bind_tree = null;
	
	public ShowTableListner(JTable in_table, JTree in_tree){
		bind_table = in_table;
		bind_tree = in_tree;
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		DefaultMutableTreeNode cur_node = (DefaultMutableTreeNode) bind_tree.getLastSelectedPathComponent();
		JTable cur_table = (JTable) cur_node.getUserObject();
		bind_table.setModel(cur_table.getModel());
	}

}
