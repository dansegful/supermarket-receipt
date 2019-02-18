package toto.model;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import java.util.*;

public class TestReceipt {
	
	@Test
    public void testPrice() {
        Product produitA = new Product("produitA", ProductUnit.Kilo);
        ReceiptItem receiptItem = new ReceiptItem(produitA,2.0,1.99, 3.98);
        Assertions.assertThat(receiptItem.getPrice()).isEqualTo(1.99);
    }
    @Test
    public void verifyProduct(){
        Product produitA = new Product("produitA", ProductUnit.Kilo);
        ReceiptItem receiptItem = new ReceiptItem(produitA,2.0,1.99, 3.98);
        Assertions.assertThat(receiptItem.getProduct()).isEqualTo(produitA);
    }
    @Test
    public void testQuantity(){
        Product produitA = new Product("produitA", ProductUnit.Kilo);
        ReceiptItem receiptItem = new ReceiptItem(produitA,2.0,1.99, 3.98);
        Assertions.assertThat(receiptItem.getQuantity()).isEqualTo(2.0);
    }
    @Test
    public void testTotalPrice(){
        Product produitA = new Product("produitA", ProductUnit.Kilo);
        ReceiptItem receiptItem = new ReceiptItem(produitA,2.0,1.99, 3.98);
        Assertions.assertThat(receiptItem.getTotalPrice()).isEqualTo(3.98);
    }
	 @Test
    public void testHashCode(){
        Product produitA = new Product("produitA",ProductUnit.Kilo);
        ReceiptItem receiptItem = new ReceiptItem(produitA, 2.0, 1.99, 3.98);
        Assertions.assertThat(receiptItem.hashCode()).isEqualTo(Objects.hash(produitA, 1.99, 3.98, 2.0));
    }
}