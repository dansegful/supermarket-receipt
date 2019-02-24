package toto.web.spring; 

import java.util.Objects;



public class Product {
	private Integer id;
	private final String item;
    private final double quantity;	
	private final String name;
	private final int ProductUnit;



	public Product(String name, String item, int ProductUnit, double quantity) { 

		this.name = name;
		this.ProductUnit = ProductUnit;
        this.item = item;
        this.quantity = quantity;		

	}
	

	public Integer getProductUnit() {
		return ProductUnit;
	}

	public Integer getId() {
		return id;
	}

	void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
        return name;
    }
	
	public String getItem(){
		return item;
	}

    public double getQuantity() {
        return quantity;
    }

	@Override
	public int hashCode() {
		return Objects.hash(item, name);
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Product && Integer.valueOf(obj.hashCode())
				.equals(hashCode());
	}

}