package com.restaurantdeliverycontrollers;

import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliveryviews.AccountPanel;
import com.restaurantdeliveryviews.MenuPanel;

public class MenuCore {
	MenuPanel menuPanel;

	MenuCore() {
		
		BindActionEvents();
	}

	private void BindActionEvents() {
		MenuPanel.getAddBtn().addActionListener(e -> addItemToMenuTable());
		MenuPanel.getSaveBtn().addActionListener(e -> {

		});
		MenuPanel.getBtnEdit().addActionListener(e -> {

		});
		MenuPanel.getBtnDelete().addActionListener(e -> {

		});
		MenuPanel.getSelectBtn().addActionListener(e -> {

		});

	}

	public void addItemToMenuTable() {
		Database.addItem(new Item("", 0));
		DefaultTableModel model = (DefaultTableModel) menuPanel.getTable().getModel();
		model.addRow(new Object[] { MenuPanel.getItemNameTextField(), MenuPanel.getItemPriceTextField() });
	}

	public void saveItemToDatabase() {
		String itemObtainedFromUI = MenuPanel.getItemNameTextField().getText();
		String itempriceObtainedFromUi = MenuPanel.getItemPriceTextField().getText();
		Database.getItems();
	}
}
