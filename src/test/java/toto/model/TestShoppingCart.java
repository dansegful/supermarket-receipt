package toto.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;



public class TestShoppingCart {
	private ShoppingCart cart = new ShoppingCart();
	private Product produitT = new Product("produitT", ProductUnit.Each);	
	
	@Test
	public void testNoNullCart () {
		cart.addItem(produitT);
		List <ProductQuantity> listItems = cart.getItems();
		Assertions.assertNotNull(listItems);
	}
}