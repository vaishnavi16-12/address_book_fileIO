package com.bridgelab.addressbook;

import javax.imageio.IIOException;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private  static final String fileName = "contacts.txt";

    public static void writeContactToFile(List<Contact> contacts){

        try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(fileName))){
          oos.writeObject(contacts);

            }catch(IOException e){
            e.printStackTrace();

        }
    }


}
