package ro.ase.cts.seminar3;

public class MarketingStrategy {
	
	public static final int CUSTOMER_EXPERIENCE_THRESHOLD = 10;
	public static final float MAXIMUM_DISCOUNT = 0.15f;
	
	public static float getDiscount(int customerExperience) {
		return customerExperience > CUSTOMER_EXPERIENCE_THRESHOLD ? MAXIMUM_DISCOUNT : (float)customerExperience / 100;
	}
	
	public static float applyDiscount(float initialPrice, float discount, float discountExtra) {
		return (initialPrice - (discountExtra * initialPrice)) - discount * (initialPrice - (discountExtra * initialPrice));
		
	}
	
	public float finalPriceCalculation(ProductType productType, float initialPrice, int customerExperience) {
		float discount = getDiscount(customerExperience);
		return (productType != ProductType.NEW) ? applyDiscount(initialPrice, discount, productType.getDiscount()) : initialPrice;
	}

}
