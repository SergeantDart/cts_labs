package ro.ase.cts.seminar5;

public class TechProduct implements Product {
	
	private String productName;
	
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
