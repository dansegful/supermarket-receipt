package toto.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestOffer {
	
	@Test
	public void testSale() {
		Product produitA = new Product("produitA", ProductUnit.Kilo);
		Offer offeRForTest = new Offer(SpecialOfferType.TenPercentDiscount, produitA, 10);
		assertThat(offeRForTest.getProduct().getName()).isEqualTo("produitA");
		assertThat(offeRForTest.getProduct().getName()).isNotEmpty();
		assertThat(offeRForTest.getProduct().getName()).isNotEqualTo("produitB");
	}
}