package model;

import entity.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddressBookModel {
    private Map <String, AddressBook> contactMap = new HashMap <>();
    public boolean save(String name, AddressBook addressBook){
        contactMap.put(name, addressBook);
        return true;
    }

    public AddressBook findByName(String name){
        AddressBook obj = new AddressBook();
        for (String key : contactMap.keySet()) {
            obj.setName(contactMap.get(name).getName());
            obj.setPhoneNumber(contactMap.get(name).getPhoneNumber());
        }
        return obj;
    }

    public Map<String, AddressBook> findAll() {return contactMap;}
}
