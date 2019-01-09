import java.util.ArrayList;
public class customers {
	ArrayList<customer> customerList = new ArrayList<customer>();

public void addEntry (String inputFirstName, String inputLastName, String inputAddress, String inputNumber){
		     customer c = new customer();
		     c.CreateEntry(inputFirstName, inputLastName, inputAddress, inputNumber);
		     customerList.add(c);
		   }

		
}
