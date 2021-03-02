package com.psl.contact.contactlist;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.psl.contacts.Contact;


public class SortsContactByName {
	

	public void sortContactsByName(List<Contact> contactList) {
		// TODO Auto-generated method stub
		Collections.sort(contactList, Contact.comparator1);
		for(Contact c: contactList)
		{
			System.out.println(c);
		}
		
	}
}