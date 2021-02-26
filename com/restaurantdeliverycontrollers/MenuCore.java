package com.restaurantdeliverycontrollers;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliveryviews.MenuPanel;

public class MenuCore {
	MenuPanel menuPanel;

	MenuCore(CRUDAction crudAction) {
		BindRestrauntsToComboBox();

		BindActionEvents();
		
	}

	private void BindRestrauntsToComboBox() {
		ArrayList<Restaurant> restaurants = Database.getRestaurants();
		
		
	}

	private void BindActionEvents() {
		MenuPanel.getAddBtn().addActionListener(e -> {
//			addItemToMenuTable(item);
		});
		MenuPanel.getSaveBtn().addActionListener(e -> {

		});
		MenuPanel.getBtnEdit().addActionListener(e -> {

		});
		MenuPanel.getBtnDelete().addActionListener(e -> {

		});
		MenuPanel.getSelectBtn().addActionListener(e -> {

		});

	}

	public void addItemToMenuTable(Item item) {
		Database.addItem(item);
		DefaultTableModel model = (DefaultTableModel) menuPanel.getTable().getModel();
		model.addRow(new Object[] { MenuPanel.getItemNameTextField(), MenuPanel.getItemPriceTextField() });
	}

	public void saveItemToDatabase() {
		String itemObtainedFromUI = MenuPanel.getItemNameTextField().getText();
		String itempriceObtainedFromUi = MenuPanel.getItemPriceTextField().getText();
		Database.getItems();
	}
}
