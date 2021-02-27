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
import com.restaurantdeliverymodels.Order;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliverymodels.User;
import com.restaurantdeliveryviews.MenuPanel;

public class MenuCore {
	MenuPanel menuPanel;
	Restaurant restaurantInContext;
	// in case the user selects a row
	// and picks an item to edit we need
	// we need to store the selected row id
	int selectedRow = -1;

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
			Functions.displayMessage("Item added successfuly");
			fillItemToEditField("", "");
		});

		MenuPanel.getSaveBtn().addActionListener(e -> {

			if (crudAction == CRUDAction.Delete) {
				// delete the Menu
				getMenuObject().delete();
				Functions.displayMessage("Items Deleted Successfully");
				fillItemToEditField("", "");
			} else {
				// save the menu
				getMenuObject().save();
				Functions.displayMessage("Item saved Successfully");
				fillItemToEditField("", "");
			}
			loadMenuItemsBasedOnRestraunt();
		});

		MenuPanel.getBtnEdit().addActionListener(e -> {
			AssignValueToTableAtRow();
			Functions.displayMessage("Item Edited  successfuly");
		});
		MenuPanel.getBtnDelete().addActionListener(e -> {
			deleteEntryFromTable();
			fillItemToEditField("", "");
		});
		MenuPanel.getSelectBtn().addActionListener(e -> {
			if (crudAction == CRUDAction.Edit || crudAction == CRUDAction.Delete) {
				// store the selectedRow to use it while returning the values back to the JTAble
				selectedRow = MenuPanel.getTable().getSelectedRow();
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

	private void AssignValueToTableAtRow() {
		DefaultTableModel model = (DefaultTableModel) MenuPanel.getTable().getModel();
		model.setValueAt(MenuPanel.getItemNameTextField().getText(), selectedRow, 0);
		model.setValueAt(MenuPanel.getItemPriceTextField().getText(), selectedRow, 1);

		// reset the selection of row
		selectedRow = -1;
		// clear the boxes
		fillItemToEditField("", "");
	}

	private void deleteEntryFromTable() {
		if (MenuPanel.getTable().getSelectedRow() != -1) {
			// remove selected row from the model
			((DefaultTableModel) MenuPanel.getTable().getModel()).removeRow(MenuPanel.getTable().getSelectedRow());
			Functions.displayMessage("Selected row deleted successfully");
		}
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
		if (itemIsNotPresentInTable()) {

			DefaultTableModel model = (DefaultTableModel) MenuPanel.getTable().getModel();
			model.addRow(new Object[] { item, itemp });
		} else {
			Functions.displayError(String
					.format("You cannot add '%s' as it already is a part of the menu you are trying to edit", item));
		}
	}

	private boolean itemIsNotPresentInTable() {
		DefaultTableModel itemTableModel = (DefaultTableModel) MenuPanel.getTable().getModel();

		for (int i = 0; i < itemTableModel.getRowCount(); i++) {
			// compare the current row's item value to the value in the edit item textbox.
			if (itemTableModel.getValueAt(i, 0).toString().equals(MenuPanel.getItemNameTextField().getText())) {
				// if found return the loop
				return false;
			}
		}
		return true;
	}

	public void fillItemToEditField(String item, String price) {
		MenuPanel.getItemNameTextField().setText(item);
		MenuPanel.getItemPriceTextField().setText(price);
	}

}