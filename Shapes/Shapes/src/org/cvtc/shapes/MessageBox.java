package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog {

	public MessageBox() {
	}
	
	public int show(String message, String title) {
		
		// JOptionPane method
		JOptionPane.showMessageDialog(null, message, title, 1);
		
		return JOptionPane.OK_OPTION;
	}


}