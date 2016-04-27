package com.neu.beans;

import java.util.ArrayList;
import java.util.List;

public class InitShoppingCart {
	public static List<ShoppingItem> getAvailableItems() {

		ArrayList<ShoppingItem> shoppingItemsList = new ArrayList<ShoppingItem>();
		// Books
		ShoppingItem shoppingItem = new ShoppingItem();
		shoppingItem.setProductId("1");
		shoppingItem.setName("Java Servlet");
		shoppingItem.setType("Book");
		shoppingItem.setPrice("29.95");

		ShoppingItem shoppingItem2 = new ShoppingItem();
		shoppingItem2.setProductId("2");
		shoppingItem2.setName("Oracle DB Book");
		shoppingItem2.setType("Book");
		shoppingItem2.setPrice("48.95");

		ShoppingItem shoppingItem3 = new ShoppingItem();
		shoppingItem3.setProductId("3");
		
		shoppingItem3.setName("System Analyst and Design");
		shoppingItem3.setType("Book");
		shoppingItem3.setPrice("14.95");

		// Music
		ShoppingItem shoppingItem4 = new ShoppingItem();
		shoppingItem4.setProductId("4");
		
		shoppingItem4.setName("Coldplay - Lost");
		shoppingItem4.setType("Music");
		shoppingItem4.setPrice("29.95");

		ShoppingItem shoppingItem5 = new ShoppingItem();
		shoppingItem5.setProductId("5");
		
		shoppingItem5.setName("Imagine Dragon - Radioactive");
		shoppingItem5.setType("Music");
		shoppingItem5.setPrice("48.95");

		ShoppingItem shoppingItem6 = new ShoppingItem();
		shoppingItem6.setProductId("6");
		
		shoppingItem6.setName("Beatles - Come together");
		shoppingItem6.setType("Music");
		shoppingItem6.setPrice("14.95");

		// Computer
		ShoppingItem shoppingItem7 = new ShoppingItem();
		shoppingItem7.setProductId("7");
		
		shoppingItem7.setName("Asus X555L");
		shoppingItem7.setType("Computer");
		shoppingItem7.setPrice("299.95");

		ShoppingItem shoppingItem8 = new ShoppingItem();
		shoppingItem8.setProductId("8");
		
		shoppingItem8.setName("Dell Inspiron 15 R");
		shoppingItem8.setType("Computer");
		shoppingItem8.setPrice("489.95");

		ShoppingItem shoppingItem9 = new ShoppingItem();
		shoppingItem9.setProductId("9");
		
		shoppingItem9.setName("HP Envy");
		shoppingItem9.setType("Computer");
		shoppingItem9.setPrice("1400.95");

		shoppingItemsList.add(shoppingItem);
		shoppingItemsList.add(shoppingItem2);
		shoppingItemsList.add(shoppingItem3);
		shoppingItemsList.add(shoppingItem4);
		shoppingItemsList.add(shoppingItem5);
		shoppingItemsList.add(shoppingItem6);
		shoppingItemsList.add(shoppingItem7);
		shoppingItemsList.add(shoppingItem8);
		shoppingItemsList.add(shoppingItem9);
		return shoppingItemsList;

	}
}
