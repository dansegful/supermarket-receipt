package toto.model;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import java.util.*;


public class TestProduct{
    
	@Test
    public void testName(){
        Product produitA = new Product("produitA", ProductUnit.Kilo);
        Assertions.assertThat(produitA.getName()).isEqualTo("produitA");
    }
    @Test
    public void testHashCode(){
        Product produitA = new Product("produitA", ProductUnit.Kilo);
        Assertions.assertThat(produitA.hashCode()).isEqualTo(Objects.hash("produitA", ProductUnit.Kilo));
    }		
    @Test
    public void testgetQuantity(){
        Product produitA = new Product("produitA", ProductUnit.Kilo);
        ProductQuantity produitAQuantity = new ProductQuantity(produitA, 2.5);
        Assertions.assertThat(produitAQuantity.getQuantity()).isEqualTo(2.5);
    }
}

