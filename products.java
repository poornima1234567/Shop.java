import java.util.ArrayList;
public class products {
	ArrayList<product> productList = new ArrayList<product>();
	
	public void addEntry (String inputName, String inputproducer, double inputprice){
     product p = new product();
     p.CreateEntry(inputName, inputproducer, inputprice);
     productList.add(p);
   }
}
