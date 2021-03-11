package ro.ase.cts.seminar3;

public class Main {

	public static void main(String[] args) {
		MarketingStrategy ms = new MarketingStrategy();
		System.out.println("The price for the product after aplying the discount is: $" + ms.finalPriceCalculation(ProductType.DISCOUNT, 150, 5));

	}

}
