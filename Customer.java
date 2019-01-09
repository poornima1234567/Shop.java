
public class customer {
private String FirstName;
private String LastName;
private String Address;
private String Number;
// constructor
public customer() {
	
}
public customer(String inputFirstName,String inputLastName,
		String inputAddress, String inputNumber) {
	FirstName = inputFirstName;
	LastName = inputLastName;
	Address = inputAddress;
	Number = inputNumber;
	
}
// GetMethods
public String FirstName() {
	return this.FirstName;
}
public String LastName() {
	return this.LastName;
}
public String Address() {
	return this.Address;
}
public String Number() {
	return this.Number;
}
public void setFirstName(String inputFirstName) {
	FirstName = inputFirstName;

}
public void setLastName(String inputLastName) {
	LastName = inputLastName;

}
public void setAddress(String inputAddress) {
	Address = inputAddress;

}
public void setNumber(String inputNumber) {
	Number = inputNumber;

}
public void CreateEntry (String inputFirstName,String inputLastName,
		String inputAddress, String inputNumber){
	setFirstName(inputFirstName);
	 setLastName(inputLastName);
	setAddress(inputAddress);
	setNumber (inputNumber);
	
	}
}
