package com.restaurantdeliverymodels;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.restaurantdeliveryviews.AccountPanel;

/**
 * @author Alex
 * This class includes functions that could be useful everywhere in the program
 */
public class Functions {
	
	/**
	 * @param panel
	 * @return boolean
	 */
	public static boolean fieldsNotEmpty(JPanel panel) {
		// lets assume fields are not empty
		boolean fieldsCheck = true;
		// go through each component in the panel and
		// highlight the ones that are not filled
		Component[] components = panel.getComponents();
		for (Component field : components) {
			if (field instanceof JTextField) {
				// do something
				JTextField textFieldInContext = (JTextField) field;
				if (textFieldInContext.getText().isEmpty()) {
					textFieldInContext.setBorder(new LineBorder(Color.RED, 2));
					fieldsCheck = false;
				}
			}
		}
		return fieldsCheck;
	}
	
	/**
	 * @param msg
	 * Display an error message to the user
	 */
	public static void displayError(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * @param str
	 * @return
	 * Pass a string and it returns whether it is numeric or not
	 */
	public static boolean isNumeric(String str) {
		try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
	}

}
