
public class product {
	private String Name;
	private String producer;
	private double price;
	private double inputprice;
	
	public product(String inputName,String inputproducer, double inputprice) {
		Name = inputName;
		producer = inputproducer;
		price = inputprice;
		
	}
	public product() {
		// TODO Auto-generated constructor stub
	}
	// GetMethods
	public String Name() {
		return this.Name;
	}
	public String producer() {
		return this.producer;
	}
	public double price() {
		return this.price;
	}
	public void setName(String inputName) {
		Name = inputName;

	}
	public void setproducer(String inputproducer) {
		producer = inputproducer;

	}
	public void setprice(double price) {
	
		price = inputprice;

	}
	public void CreateEntry (String inputName,String inputproducer, double inputprice){
		setName(inputName);
		 setproducer(inputproducer);
		setprice(inputprice);
		
		}
}

