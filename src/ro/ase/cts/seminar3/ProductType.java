package ro.ase.cts.seminar3;

public enum ProductType {
	NEW(0.0f),
	DISCOUNT(0.1f),
	LIMITED_STOCK(0.25f),
	END_SALE(0.35f),
	NEW_CATEGORY(0.45f);
	
	private float discount;
	
	ProductType(float discount) {
		this.discount = discount;
	}
	
	public float getDiscount() {
		return this.discount;
	}
}
