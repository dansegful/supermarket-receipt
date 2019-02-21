package todo.web.spring; 

import java.util.*;

public enum SpecialOfferType {
    ThreeForTwo, TenPercentDiscount, TwoForAmount, FiveForAmount;
}

public class OfferController {
    SpecialOfferType offerType;
    private final Product product;
    double argument;
    private final String description;
    private final double discountAmount;
    private final Product product;	

    public Offer(SpecialOfferType offerType, Product product, double argument, Product product, String description, double discountAmount) {
        this.offerType = offerType;
        this.argument = argument;
        this.product = product;
        this.product = product;
        this.description = description;
        this.discountAmount = discountAmount;		
	}
    public String getDescription() {
        return description;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public Product getProduct() {
        return product;
    }	
    Product getProduct() {
        return this.product;
    }	