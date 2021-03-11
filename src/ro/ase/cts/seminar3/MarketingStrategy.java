package ro.ase.cts.seminar3;

public class MarketingStrategy {
	
	public static final int CUSTOMER_EXPERIENCE_THRESHOLD = 10;
	public static final float MAXIMUM_DISCOUNT = 0.15f;
	
	public static final float EXTRA_DISCOUNT_10 = 0.1f;
	public static final float EXTRA_DISCOUNT_25 = 0.25f;
	public static final float EXTRA_DISCOUNT_35 = 0.35f;

	
	
	public static float getDiscount(int customerExperience) {
		return customerExperience > CUSTOMER_EXPERIENCE_THRESHOLD ? MAXIMUM_DISCOUNT : (float)customerExperience / 100;
	}
	
	public static float applyDiscount(float initialPrice, float discount, float discountExtra) {
		
		
		return (initialPrice - (discountExtra * initialPrice)) - discount * (initialPrice - (discountExtra * initialPrice));
		
	}
	
	public float finalPriceCalculation(ProductType productType, float initialPrice, int customerExperience) {
		float finalPrice = 0;
		float discount = getDiscount(customerExperience);
		
		switch(productType) {
		case NEW:
			finalPrice = initialPrice;
			return finalPrice;
		case DISCOUNT:
			finalPrice = applyDiscount(initialPrice, discount, EXTRA_DISCOUNT_25);
			return finalPrice;
		case LIMITED_STOCK:
			finalPrice = applyDiscount(initialPrice, discount, EXTRA_DISCOUNT_35);
			return finalPrice;
		case END_SALE:
			finalPrice = applyDiscount(initialPrice, discount, EXTRA_DISCOUNT_10);
			return finalPrice;
		default:
			throw new UnsupportedOperationException("Unavailable category ! Doesn't exist !");
		}
		
	}

}
