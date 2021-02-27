package com.restaurantdeliverycontrollers;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

import com.restaurantdeliverymodels.Admin;
import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Functions;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Manager;
import com.restaurantdeliverymodels.Menu;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliverymodels.User;
import com.restaurantdeliveryviews.MenuPanel;

public class MenuCore {
	MenuPanel menuPanel;
	Restaurant restaurantInContext;

	MenuCore(CRUDAction crudAction) {
		BindRestrauntsToComboBox();

		BindActionEvents(crudAction);

	}

	private void BindRestrauntsToComboBox() {
		loadRestrauntDataInComboBox();
	}

	private void loadRestrauntDataInComboBox() {

		User user = Main.user;
		// user object must exist and user must be a manager
		if (user != null && (user instanceof Manager || user instanceof Admin)) {

			ArrayList<Restaurant> restaurants = Database.getRestaurants();

			for (int i = 0; i < restaurants.size(); i++) {
				if (user instanceof Manager) {
					if (user.getId() == restaurants.get(i).getManager_id()) {
						MenuPanel.getSelectRestoDropDown().addItem(restaurants.get(i).getName());
					}
				} else if (user instanceof Admin) {
					MenuPanel.getSelectRestoDropDown().addItem(restaurants.get(i).getName());
				}
			}
			restaurantInContext = restaurants.get(0);
			loadMenuItemsBasedOnRestraunt();
		}

	}

	private void BindActionEvents(CRUDAction crudAction) {
		MenuPanel.getAddBtn().addActionListener(e -> {
			addItemtoTable();
		});
		MenuPanel.getSaveBtn().addActionListener(e -> {
			// save the menu
			getMenuObject().save();
		});
		MenuPanel.getBtnEdit().addActionListener(e -> {

		});
		MenuPanel.getBtnDelete().addActionListener(e -> {

		});
		MenuPanel.getSelectBtn().addActionListener(e -> {
			if (crudAction == CRUDAction.Edit || crudAction == CRUDAction.Delete) {
				fillItemToEditField(
						MenuPanel.getTable().getValueAt(MenuPanel.getTable().getSelectedRow(), 0).toString(),
						MenuPanel.getTable().getValueAt(MenuPanel.getTable().getSelectedRow(), 1).toString());

			}

		});
		MenuPanel.getSelectRestoDropDown().addActionListener(e -> {
			String restarauntName = ((JComboBox) e.getSource()).getSelectedItem().toString();
			restaurantInContext = Database.getRestaurantByName(restarauntName);
			loadMenuItemsBasedOnRestraunt();
		});

	}

	private Menu getMenuObject() {
		DefaultTableModel itemTableModel = (DefaultTableModel) MenuPanel.getTable().getModel();

		// create the menu object to be returned
		Menu menu = new Menu(restaurantInContext.getId());

		// create the menu items from the table to be added into the object
		ArrayList<Item> items = new ArrayList<Item>();

		// loop through the rows
		for (int i = 0; i < itemTableModel.getRowCount(); i++) {
			Double price = new Double(itemTableModel.getValueAt(i, 1).toString());
			items.add(new Item(String.valueOf(itemTableModel.getValueAt(i, 0)), price, restaurantInContext.getId()));
		}

		menu.setItems(items);
		return menu;
	}

	public void loadMenuItemsBasedOnRestraunt() {
		DefaultTableModel tableModel = new DefaultTableModel(new Object[][] {},
				new String[] { "Item Name", "Price", }) {
			@Override
			public boolean isCellEditable(int row, int column) {
				// all cells false
				return false;
			}
		};
		MenuPanel.getTable().setModel(tableModel);

		ArrayList<Item> item = Database.getItems();

		for (int j = 0; j < item.size(); j++) {

			if (restaurantInContext.getId() == item.get(j).getMenu_id()) {
				DefaultTableModel model = (DefaultTableModel) MenuPanel.getTable().getModel();
				model.addRow(new Object[] { item.get(j).getName(), item.get(j).getPrice() });

			}
		}
	}

	public void addItemtoTable() {
		String item = MenuPanel.getItemNameTextField().getText();
		String itemp = MenuPanel.getItemPriceTextField().getText();
		DefaultTableModel model = (DefaultTableModel) MenuPanel.getTable().getModel();
		model.addRow(new Object[] { item, itemp });
	}

	public void fillItemToEditField(String item, String price) {
		MenuPanel.getItemNameTextField().setText(item);
		MenuPanel.getItemPriceTextField().setText(price);
	}
}