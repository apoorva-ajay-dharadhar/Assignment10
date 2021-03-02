package com.psl.contacts;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.psl.contacts.Contact;
import com.psl.db.connection.AddContactToDB;

public class ContactService {
//	static //1.	Add contacts :- void addContact(Contact contact,List<Contact> contacts)
//	List<Contact> contacts=new ArrayList<Contact>();
	
	public List<Contact> addContact(Contact contact, List<Contact> contacts)
	{
	//:- void addContact(Contact contact,List<Contact> contacts)	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the contactId");
		int id=sc.nextInt();contact.setContactID(id);
		sc.nextLine();
		System.out.println("Enter Contact Name");
		String contactName=sc.nextLine();
		contact.setContactName(contactName);
		System.out.println("Enter Contact Email address");
		String contactEmail=sc.nextLine();
		contact.setEmailAddress(contactEmail);
		System.out.println("How many contact numbers do you want to add?");
		int n=sc.nextInt();
		sc.nextLine();
		List<String> contactNumbers=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Contact phonenumber:"+i);
			String contactNum=sc.nextLine();
			contactNumbers.add(contactNum);
		}
		contact.setContactNumber(contactNumbers);
		contacts.add(contact);//Added the contact to the list
		//printAddedContact(contacts);
		AddContactToDB cdb=new AddContactToDB();
		//cdb.insertContact(contacts);
		return contacts;
	}
	
	public static void printAddedContact(List<Contact> l)
	{
		
		for(Contact c: l)
		{
			System.out.println(c);
			System.out.println("Above contact is added successfully");
		}
	}

	public List<Contact> addContact1(Contact c, List<Contact> contactList) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the contactId");
		int id=sc.nextInt();
		c.setContactID(id);
		sc.nextLine();
		System.out.println("Enter Contact Name");
		String contactName=sc.nextLine();
		c.setContactName(contactName);
		System.out.println("Enter Contact Email address");
		String contactEmail=sc.nextLine();
		c.setEmailAddress(contactEmail);
		System.out.println("How many contact numbers do you want to add?");
		int n=sc.nextInt();
		sc.nextLine();
		List<String> contactNumbers=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Contact phonenumber:"+i);
			String contactNum=sc.nextLine();
			contactNumbers.add(contactNum);
		}
		c.setContactNumber(contactNumbers);
		contactList.add(c);//Added the contact to the list
		//printAddedContact(contacts);
		AddContactToDB cdb=new AddContactToDB();
		//cdb.insertContact(contacts);
		return contactList;
		
	}
	
	
}
