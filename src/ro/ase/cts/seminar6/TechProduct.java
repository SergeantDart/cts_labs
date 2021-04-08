package ro.ase.cts.seminar6;
import ro.ase.cts.seminar5.Product;

public class TechProduct implements Product, Cloneable {
	
	int productId;
	private String productName;
	private String manufacturer;
	private String model;
	String displayType;
	float price;
	
	private TechProduct() {
	
	}
	
	public TechProduct(int productId) {
		super();
		this.productId = productId;
	}
	
	
	
	public TechProduct(int productId, String productName, String manufacturer, String model, String displayType,float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.manufacturer = manufacturer;
		this.model = model;
		this.displayType = displayType;
		this.price = price;
	}

	@Override
	public String getDescription() {
		return "This is a TECH product !";
	}

	public int getId() {
		return productId;
	}

	public void setId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getManufaturer() {
		return manufacturer;
	}

	public void setManufaturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public static class TechProductBuilder {
		private TechProduct product;
		
		public TechProductBuilder(int id) {
			product = new TechProduct(id);
		}
		
		public TechProductBuilder setName(String name) {
			product.productName = name;
			return this;
		}
		
		public TechProductBuilder setManufacturer(String manufacturer) {
			product.manufacturer = manufacturer;
			return this;
		}
		
		public TechProductBuilder setModel(String model) {
			product.model = model;
			return this;
		}
		
		public TechProductBuilder setDisplayType(String displayType) {
			product.displayType = displayType;
			return this;
		}
			
		public TechProductBuilder setPrice(float price) {
			product.price = price;
			return this;
		}
		
		public Product getProduct() {
			return this.product;
		}
		
		
	}
	
}
