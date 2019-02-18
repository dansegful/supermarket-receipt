package toto.model;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class TestDiscount {
	
	@Test	
    public void testDescription(){
        Product produitA = new Product("produitA", ProductUnit.Kilo);
        Discount testDiscount = new Discount(produitA, "produitA Discount", 1.99);
        Assertions.assertThat(testDiscount.getDescription()).isEqualTo("produitA Discount");
    }
    @Test
    public void testSale(){
        Product produitA = new Product("produitA",ProductUnit.Kilo);
        Discount testDiscount = new Discount(produitA, "produitA Discount", 1.99);
        Assertions.assertThat(testDiscount.getDiscountAmount()).isEqualTo(1.99);
    }
}