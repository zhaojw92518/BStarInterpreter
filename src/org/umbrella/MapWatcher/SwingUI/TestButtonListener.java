package org.umbrella.MapWatcher.SwingUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class TestButtonListener implements ActionListener {
	private JTextField input_text = null;
	
	public TestButtonListener(JTextField in_text) {
		input_text = in_text;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Integer temp_int = new Integer(input_text.getText());
		WatcherUI.set_data_width(temp_int);
	}

}
