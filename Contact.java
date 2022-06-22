package Contact;

public class Contact {
	
	//variables
	String contactID;
	String firstName;
	String lastName;
	String Number;
	String Address;

	//constructor
	public Contact(String contactID, String firstName, String lastName, String Number, String Address) {
		
		//check for length requirements
		//contactID cannot be null and cannot be longer than 10 characters
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		//firstName cannot be null and cannot be longer than 10 characters
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		
		//lastName cannot be null and cannot be longer than 10 characters
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		
		//phone number cannot be null and must have exactly 10 characters
		if(Number == null || Number.length()>10 || Number.length()<10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		//address cannot be null and cannot be longer than 30 characters
		if(Address == null || Address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Number = Number;
		this.Address = Address;
	}
	
	//getters and setters
	public String getContactID() {
		return contactID;
	}
	
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNumber() {
		return Number;
	}
	
	public void setNumber(String Number) {
		this.Number = Number;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	//toString
	public String toString() {
		return "Contact Info [Contact ID =" + contactID + ", First Name =" +firstName + ", Last Name =" + lastName + ", Phone =" + Number + ", Address =" + Address + "]";
	}
	
}
