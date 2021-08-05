package view;

import controller.AddressBookController;

import java.util.Scanner;

public class AddressBookMenu {
    private AddressBookController addressBookController = new AddressBookController();
    private Scanner scanner = new Scanner(System.in);
    public void generateMenu() {
        while (true) {
            System.out.println("Address Book Application");
            System.out.println("1.Add new contact.");
            System.out.println("2.Find a contact by name.");
            System.out.println("3.Display contacts.");
            System.out.println("4.Exit.");
            System.out.println("Please enter your choice (0-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    addressBookController.create();
                    break;
                case 2:
                    addressBookController.findByName();
                    break;
                case 3:
                    addressBookController.display();
                    break;
                case 4:
                    System.out.println("Bye.");
                    break;
                default:
                    break;
            }
            if (choice == 0) {
                break;
            }
            scanner.nextLine();
        }
    }

}
