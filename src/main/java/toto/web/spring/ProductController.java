package todo.web.spring; 

import java.util.Objects;

public enum ProductUnit {
    Kilo, Each
}

public class ProductController {

    private final Product product;
    private final double quantity;	
	private final String name;
	private final ProductUnit unit;
	

	public ProductController() {}

	public Product(String name, ProductUnit unit, Product product, double weight) {

		this.name = name;
		this.unit = unit;
        this.product = product;
        this.quantity = weight;		

	}
    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
	

    public String getName(String name) {
        return name;
    }

    public ProductUnit getUnit() {
        return unit;
    }	




    @Override
    public int hashCode() {

        return Objects.hash(name, unit);
    }



	@Override

	public boolean equals(Object obj) {

		return obj instanceof Product && Integer.valueOf(obj.hashCode())

				.equals(hashCode());

	}




}

