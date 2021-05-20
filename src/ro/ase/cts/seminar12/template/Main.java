package ro.ase.cts.seminar12.template;

public class Main {

	public static void main(String[] args) {
		
		AbstractFormatter decimalFormatter = new DecimalFormatter();
		AbstractFormatter hexFormatter = new HexFormatter();
		
		decimalFormatter.displayOutput(2);
		hexFormatter.displayOutput(99);

	}

}
