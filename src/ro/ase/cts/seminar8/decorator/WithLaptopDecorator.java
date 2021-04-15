package ro.ase.cts.seminar8.decorator;

public class WithLaptopDecorator extends AbstractBackpackDecorator {
	
	boolean isCharged; 
	
	public WithLaptopDecorator(AbstractBackpack basicBackpack) {
		super(basicBackpack);
	}

	
	public WithLaptopDecorator(AbstractBackpack basicBackpack, boolean isCharged) {
		super(basicBackpack);
		this.isCharged = isCharged;
	}


	@Override
	public void pack() {
		this.basicBackpack.pack();
		String message = this.isCharged ? " + charged laptop" : " + uncharged laptop";
		System.out.println(message);
	}
	
}
