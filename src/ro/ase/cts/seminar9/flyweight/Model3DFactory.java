package ro.ase.cts.seminar9.flyweight;

import java.util.HashMap;

public class Model3DFactory {
	static HashMap<ModelType, Model3DFlyweight> models;
	
	static {
		models = new HashMap<>();
		models.put(ModelType.SOLDIER, new Model3DFlyweight("soldier"));
		models.put(ModelType.TREE, new Model3DFlyweight("tree"));
		models.put(ModelType.HOUSE, new Model3DFlyweight("house"));
	}
	
	public static Model3DFlyweight getModel(ModelType modelType) {
		return models.get(modelType);
	}
}
