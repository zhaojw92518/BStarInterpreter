package org.umbrella.MapWatcher.SwingUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Enumeration;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

import org.antlr.v4.codegen.model.chunk.ThisRulePropertyRef_ctx;
import org.umbrella.MapWatcher.ValueWatcher;

public class WatcherUI extends JFrame{
	private static LinkedList<JTable> tables = new LinkedList<>();
	private static int data_width = 400;
	
	public static void set_data_width(int in_width){
		data_width = in_width;
	}

	private JButton test_button = new JButton("test");
	private JTextField test_input = new JTextField();
	private JTable show_table = new JTable();
	
	private JTree watch_tree;
	
	public WatcherUI(int width, int height, DefaultMutableTreeNode in_node){
		super("WatcherUI");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		watch_tree = new JTree(in_node);
		watch_tree.setCellRenderer(new WatcherTreeCellRenderer());
		watch_tree.setShowsRootHandles(true);
		watch_tree.addTreeSelectionListener(new ShowTableListner(show_table, watch_tree));
		JScrollPane scroll_pane = new JScrollPane();
		scroll_pane.setViewportView(watch_tree);
		scroll_pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll_pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		JSplitPane split_pane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		show_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane bottom_panel = new JScrollPane(show_table);
		bottom_panel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		bottom_panel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		split_pane.setTopComponent(scroll_pane);
		split_pane.setBottomComponent(bottom_panel);
		split_pane.setDividerLocation(0.1);
		this.add(split_pane);
		this.setSize(width, height);
		this.setVisible(true);
	}
	
	public void set_table_model(TableModel in_model){
		show_table.setModel(in_model);
		show_table.setPreferredSize(new Dimension(600, 50));
		this.repaint();
	}
	

	
	class WatcherTreeCellRenderer extends JScrollPane implements TreeCellRenderer {

        private static final long serialVersionUID = 1L;
        private JTable table;

        public WatcherTreeCellRenderer() {
            super();
            table = new JTable();
            this.setViewportView(table);
        }

        public Component getTreeCellRendererComponent(JTree tree, Object value,
                boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        	JTable cur_table = (JTable) ((DefaultMutableTreeNode) value).getUserObject();
        	table.setModel(cur_table.getModel());
            table.setPreferredScrollableViewportSize(table.getPreferredSize());
            table.getTableHeader().setResizingAllowed(true);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            table.setPreferredSize(new Dimension(400, 20));
            table.getColumnModel().getColumn(0).setPreferredWidth(250);
            table.getColumnModel().getColumn(1).setPreferredWidth(250);
            table.getColumnModel().getColumn(2).setPreferredWidth(data_width);
            table.getTableHeader().setVisible(false);
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setPreferredSize(new Dimension(0, 0));
            table.getTableHeader().setDefaultRenderer(renderer);
            tables.add(table);
            return this;
        }
    }
}
