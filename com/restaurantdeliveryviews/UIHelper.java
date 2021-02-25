package com.restaurantdeliveryviews;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class UIHelper {

	public static boolean ValidateEmptyFields(JPanel panel) {
		ResetBorderLines(panel);
		boolean result = true;
		
		//get all the components in the panel
		Component[] componentsOfThePanel = panel.getComponents();
		
		for (Component component : componentsOfThePanel) {
			
			if (component instanceof JTextField) {
				JTextField textFieldInContext = (JTextField) component;
				if (textFieldInContext.getText().isEmpty()) {
					//outline the component with red line
					SetBorderColorToComponent(textFieldInContext, Color.RED);
					//set the flag to false;
					result = false;
				}
			} else if (component instanceof JComboBox) {
				JComboBox comboBoxInContext = (JComboBox) component;
				if (comboBoxInContext.getSelectedIndex() == 0) {
					SetBorderColorToComponent(comboBoxInContext, Color.RED);
					//set the flag to false;
					result = false;
				}
			} else if (component instanceof JPanel) {
				result = ValidateEmptyFields((JPanel)component);
			}
		}
		
		return result;
	}
	
	public static void ResetBorderLines(JPanel panel) {
		//get all the components in the panel
		Component[] componentsOfThePanel = panel.getComponents();
		for (Component component : componentsOfThePanel) {
			if ((component instanceof JTextField) || (component instanceof JComboBox)) {
				((JComponent) component).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			}
		}
	}
	
	public static void SetBorderColorToComponent(JComponent component, Color color) {
		if (color == null) {
			component.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		} else {
			component.setBorder(new LineBorder(color, 2));
		}
		
	}
}
