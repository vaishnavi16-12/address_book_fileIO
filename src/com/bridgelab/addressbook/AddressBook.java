package com.bridgelab.addressbook;

import javax.imageio.IIOException;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private static final String fileName = "contacts.txt";

    public static void writeContactToFile(List<Contact> contacts) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(contacts);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static List<Contact> readContactFromFile() {
        List<Contact> contacts = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            contacts = (List<Contact>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return contacts;
    }
}



