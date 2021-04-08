package ro.ase.cts.seminar6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import ro.ase.cts.seminar5.AbstractProductFactory;
import ro.ase.cts.seminar5.Product;

public class TechProductFactory extends AbstractProductFactory {

	@Override
	public Product makeProduct(int productId) {
		ArrayList<String> productRecrods = readRecordsFromCsvFile("tech_products.csv");
		for(String record : productRecrods) {
			String[] productAttributes = record.split(",");
			if(Integer.valueOf(productAttributes[0]) == productId) {
				TechProduct.TechProductBuilder productBuilder = new TechProduct.TechProductBuilder(productId);
				return productBuilder.setName(productAttributes[1])
						.setManufacturer(productAttributes[2])
						.setModel(productAttributes[3])
						.setDisplayType(productAttributes[4])
						.setPrice(Float.valueOf(productAttributes[5]))
						.getProduct();
			}
		}
		return new TechProduct.TechProductBuilder(productId).getProduct();
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
		
		File productsFile = new File("D:/Eclipse workspace/cts_labs/src/ro/ase/cts/seminar5/" + fileName);
		
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
