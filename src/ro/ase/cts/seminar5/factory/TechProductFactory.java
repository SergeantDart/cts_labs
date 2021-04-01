package ro.ase.cts.seminar5.factory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class TechProductFactory extends AbstractProductFactory {

	@Override
	public Product makeProduct(String productName) {
		return new TechProduct(productName);
	}

	@Override
	public String getCatalog() {
		ArrayList<String> productRecords = readRecordsFromCsvFile("tech_products.csv");
		StringBuilder stringBuilder = new StringBuilder();
		for(String productRecord : productRecords) {
			String[] productAttributes = productRecord.split(",");
			stringBuilder.append(productAttributes[0] + " ");
			stringBuilder.append(productAttributes[1] + " ")
			.append(productAttributes[1].toString() + " ")
			.append(productAttributes[2].toString() + " ")
			.append(productAttributes[3].toString() + " ")
			.append(productAttributes[3].toString() + " ")
			.append(productAttributes[3].toString() + "\n");			
		}
		return stringBuilder.toString();
	}
	
	private ArrayList<String> readRecordsFromCsvFile(String fileName) {
		ArrayList<String> records = new ArrayList<>();
		
		URL fileUrl = getClass().getResource(fileName);
		
		File productsFile = new File(fileUrl.getPath());
		
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader(productsFile));
			String fileLine;
			while((fileLine = fileReader.readLine()) != null) {
				
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return records;
	}

}
