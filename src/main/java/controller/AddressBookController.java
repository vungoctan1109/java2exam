package controller;

import entity.AddressBook;
import model.AddressBookModel;

import java.util.Map;
import java.util.Scanner;

public class AddressBookController {
    private Scanner scanner = new Scanner(System.in);
    private AddressBookModel addressBookModel = new AddressBookModel();

    public void create() {
        AddressBook addressBook = new AddressBook();
        System.out.println("Please enter name: ");
        String name = scanner.nextLine();
        addressBook.setName(name);
        System.out.println("Please enter phone number: ");
        int phoneNumber = scanner.nextInt();
        addressBook.setPhoneNumber(phoneNumber);
        if (addressBookModel.save(name, addressBook)) {
            System.out.println("Success");
        } else {
            System.out.println("Failed.");
        }
    }

    public void findByName() {
        System.out.println("Please enter name to search: ");
        String name = scanner.nextLine();
        AddressBook addressBook = addressBookModel.findByName(name);
        if (addressBook == null){
            System.err.println("Contact is not found");
        } else {
            System.out.printf("Found a contact with information: %s\n", addressBook.toString());
        }
    }

    public void display() {
        Map<String, AddressBook> addressBookMap = addressBookModel.findAll();
        for (String key: addressBookMap.keySet()) {
            System.out.println("Address Book");
            System.out.println("Contact Name    |    Phone Number    ");
            System.out.printf("%s   |   %s",addressBookMap.get(key).getName(), addressBookMap.get(key).getPhoneNumber());
            System.out.println("\n");
        }
    }
}
