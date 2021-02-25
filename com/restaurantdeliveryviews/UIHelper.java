package com.restaurantdeliveryviews;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class UIHelper {

	public static boolean ValidateEmptyFields(JPanel panel) {
		boolean result = true;
		
		//get all the components in the panel
		Component[] componentsOfThePanel = panel.getComponents();
		
		for (Component component : componentsOfThePanel) {
			
			if (component instanceof JTextField) {
				JTextField textFieldInContext = (JTextField) component;
				if (textFieldInContext.getText().isEmpty()) {
					//outline the component with red line
					textFieldInContext.setBorder(new LineBorder(Color.RED, 2));
					//set the flag to false;
					result = false;
				}
			} else if (component instanceof JComboBox) {
				JComboBox comboBoxInContext = (JComboBox) component;
				if (comboBoxInContext.getSelectedIndex() == 0) {
					comboBoxInContext.setBorder(new LineBorder(Color.RED, 2));
					//set the flag to false;
					result = false;
				}
			}
		}
		
		return result;
	}
}
