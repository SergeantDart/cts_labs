package ro.ase.cts.seminar5;

public class OfficeProduct implements Product {
	
	private String productName;

	private OfficeProduct() {
		
	}
	
	public OfficeProduct(String productName) {
		super();
		this.productName = productName;
	}
	
	@Override
	public String getDescription() {
		return "This is an office product !";
	}
	
}
