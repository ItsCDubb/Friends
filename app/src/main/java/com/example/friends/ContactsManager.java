package com.example.friends;

import java.util.ArrayList;

public class ContactsManager {

    private ArrayList<Contact> friend = new ArrayList<Contact>();

    public void createContact (String name, String phoneNumber) {

        Contact contact = new Contact(name, phoneNumber);
        friend.add(contact);
    }
}
