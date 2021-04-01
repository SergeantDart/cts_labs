package ro.ase.cts.seminar5.factory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TechProductFactory extends AbstractProductFactory {

	@Override
	public Product makeProduct(int productId) {
		return new TechProduct(productId);
	}

	@Override
	public String getCatalog() {
		ArrayList<String> productRecords = readRecordsFromCsvFile("tech_products.csv");
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Tech products catalog: " + "\n");
		for(String productRecord : productRecords) {
			String[] productAttributes = productRecord.split(",");
			stringBuilder.append(productAttributes[0] + " ");
			stringBuilder.append(productAttributes[1] + " ")
			.append(productAttributes[2].toString() + " ")
			.append(productAttributes[3].toString() + " ")
			.append(productAttributes[4].toString() + " ")
			.append(productAttributes[5].toString() + "\n");
		}
		return stringBuilder.toString();
	}
	
	private ArrayList<String> readRecordsFromCsvFile(String fileName) {
		ArrayList<String> productRecords = new ArrayList<>();
		
		File productsFile = new File("D:/Eclipse workspace/cts_labs/src/ro/ase/cts/seminar5/factory/" + fileName);
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(productsFile));
			String fileLine;
			while((fileLine = bufferedReader.readLine()) != null) {
				productRecords.add(fileLine);
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return productRecords;
	}

}
