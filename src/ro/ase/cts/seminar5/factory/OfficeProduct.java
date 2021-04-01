package ro.ase.cts.seminar5.factory;

public class OfficeProduct implements Product {
	
	private int productId;
	private String productName;

	private OfficeProduct() {
		
	}
	
	public OfficeProduct(int productId) {
		super();
		this.productId = productId;
	}
	
	@Override
	public String getDescription() {
		return "This is an office product !";
	}
	
}
