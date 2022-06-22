package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	//using this JUnitTest to check for Contact.java issues
	//creating an object with all fields valid per requirements
	@Test
	void testContact() {
		Contact contact = new Contact("12345", "firstName", "lastName", "0123456789", "Main Street USA");
		assertTrue(contact.getContactID().equals("12345"));
		assertTrue(contact.getFirstName().equals("firstName"));
		assertTrue(contact.getLastName().equals("lastName"));
		assertTrue(contact.getNumber().equals("0123456789"));
		assertTrue(contact.getAddress().equals("Main Street USA"));
	}
}
