package com.bridgelab.addressbook;


import javax.naming.InitialContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.bridgelab.addressbook.AddressBook.readContactFromFile;
import static com.bridgelab.addressbook.AddressBook.writeContactToFile;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");




        List<Contact> initialContacts = new ArrayList<>(Arrays.asList(
                new Contact("vaishnavi", "9021916350", "vaishnavic16502@gmail.com"),
                new Contact("Pooja",      "902416350", "poojaK2@gmail.com"),
                new Contact("Sneha", "9967675666", "sneha21@gmail.com"),
                new Contact("Sankruti", "772857945", "sanskrutic22@gmail.com"),
                new Contact("Satwik", "784356356", "satwik12@gmail.com"),
                new Contact("Namrata", "952491630", "namrata23@gmail.com"),
                new Contact("Shravan", "94646737", "shravan34@gmail.com"),
                new Contact("vedika", "8567354242", "vedika29@gmail.com"),
                new Contact("Yash", "778855342", "yash34@gmail.com"),
                new Contact("Vishwajeet", "89555556", "vishwjeet3@gmail.com")
        ));


        writeContactToFile(initialContacts);
        System.out.println("Initial Contacts in Address Book:");
        initialContacts.forEach(System.out::println);

        List<Contact> contactList = readContactFromFile();

        contactList.add(new Contact("Kiran", "8885552222", "kiran@example.com"));
        contactList.add(new Contact("Leela", "7778889999", "leela@example.com"));
        contactList.add(new Contact("Mohan", "6664441111", "mohan@example.com"));


        writeContactToFile(contactList);

        System.out.println("Updated Contacts List:");
        contactList.forEach(System.out::println);
    }

}

