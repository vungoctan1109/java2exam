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
            if (contactMap.containsKey(name)) {
                obj.setName(contactMap.get(key).getName());
                obj.setPhoneNumber(contactMap.get(key).getPhoneNumber());
            }
        }
        return obj;
    }

    public Map<String, AddressBook> findAll() {return contactMap;}
}
