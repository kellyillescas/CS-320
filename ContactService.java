package Contact;
import java.util.ArrayList;

public class ContactService {
	//array
	private ArrayList<Contact> contacts;
	
	//default constructor
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	//Add contacts with a unique ID
	public boolean add(Contact contact) {
		//determine if contact already exists
		boolean existingContact = false;
		for (Contact c : contacts) {
			if(c.equals(contact)) {
				existingContact = true;
			}
		}
		
		//adding contact
		if (!existingContact) {
			contacts.add(contact);
			System.out.println("New contact added successfully.");
			return true;
		}
		else {
			System.out.println("Contact already exists.");
			return false;
		}
	}
	
	//Delete contacts by ID
	public boolean remove(String contactID) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				contacts.remove(c);
				System.out.println("Contact deleted successfully.");
				return true;
			}
		}
		System.out.println("Cannot delete. Contact does not exist in system.");
		return false;
	}
	
	//Update contact by contactID
	public boolean update(String contactID, String firstName, String lastName, String Number, String Address) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				if (!firstName.equals(""))
					c.setFirstName(firstName);
				if (!lastName.equals(""))
					c.setLastName(lastName);
				if (!Number.equals(""))
					c.setNumber(Number);
				if (!Address.equals(""))
					c.setAddress(Address);
				System.out.println("Contact updated successfully.");
				return true;
			}
		}
		System.out.println("Could not update contact.");
		return false;
	}
	
}
