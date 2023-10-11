package entities;

import java.time.LocalDate;

public class UsedProduct extends Product{

	private String manufactureDate;
	
	public UsedProduct() {
	}
	
	public UsedProduct(String name, double price, String manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}


	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return "(used) $ " + price + "" + manufactureDate + ")";
	}
	
}
