package ro.ase.cts.seminar9.flyweight;

public class Main {

	public static void main(String[] args) {
		ScreenData dataSet_01 = new ScreenData("green", 99, 30, 100);
		ScreenData dataSet_02 = new ScreenData("white", 213, 32, 0);
		ScreenData dataSet_03 = new ScreenData("green", 21, 5, 99);
		
		Model3DFlyweightInterface soldier = Model3DFactory.getModel(ModelType.SOLDIER);
		soldier.display(dataSet_01);
		soldier.display(dataSet_03);
	}

}
