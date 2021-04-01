package ro.ase.cts.seminar5.factory;

public class TechProduct implements Product {
	
	int id;
	private String productName;
	private String manufaturer;
	private String model;
	String displayType;
	float price;
	
	private TechProduct() {
	
	}
	
	public TechProduct(String productName) {
		super();
		this.productName = productName;
	}
	
	@Override
	public String getDescription() {
		return "This is a TECH product !";
	}
	
}
