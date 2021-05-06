package ro.ase.cts.seminar10.strategy;

public class Main {

	public static void main(String[] args) {
		MarketingModule marketingModule = new MarketingModule();
		marketingModule.setCurrentStrategy(new RandomMarketingStrategy());
		double puncteBonus = marketingModule.getBonus(100);
		System.out.println("Numar puncte bonus: "+puncteBonus);
		
		marketingModule.setCurrentStrategy(new MarketingStrategyInterface() {
			
			@Override
			public double calculateBonus(double base) {
				
				return 30*base;
			}
		});
		
		puncteBonus = marketingModule.getBonus(100);
		System.out.println("Numar puncte bonus: "+puncteBonus);
		
		
		marketingModule.setCurrentStrategy((base)->{ return 20 * base; });
		//doar pt ca interfata are o singura functie abstracta si nu mai multe
	}

}
