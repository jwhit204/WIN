package com.tts;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        String firstName;
        String lastName;
        String phoneNumber;
        String emailAddress;

        // Declared Array list & passed the AddressBook class as an object
        //this will act as a database for this project
        ArrayList<AddressBook> addressList = new ArrayList<AddressBook>();


        // Scanner object is initiated with system.in to read the user input
        Scanner input = new Scanner(System.in);
        int option = 0;


        /// This block of code is displaying all the menu to choose
        //if the option is 6, the programme will quit
        while (option != 6) {
            System.out.println("1) Add an Entry\n");
            System.out.println("2) Remove an Entry\n");
            System.out.println("3) Search for a Specific Entry\n");
            System.out.println("4) Print Address Book\n");
            System.out.println("5) Delete Book\n");
            System.out.println("6) Quit\n");
            System.out.println("Please choose what you'd like to do with the database:");

            option = input.nextInt();

            ////// This block of code(line 35 - line 54) is taking the input from the user & adding it to the Array list
            if (option == 1) {
                Scanner inputAdd = new Scanner(System.in);
                System.out.println("First Name: ");
                firstName = inputAdd.nextLine();

                System.out.println("Last Name: ");
                lastName = inputAdd.nextLine();

                System.out.println("Phone Number: ");
                phoneNumber = inputAdd.nextLine();

                System.out.println("Email Address:");
                emailAddress = inputAdd.nextLine();
                System.out.println(firstName);
                System.out.println(lastName);
                System.out.println(phoneNumber);
                System.out.println(emailAddress);
                addressList.add(new AddressBook(firstName, lastName, phoneNumber, emailAddress));

            }

            /// This whole block of codes are for removing the entry against specific search( line 59 -line 80)
            if (option == 2) {

                String email;
                Scanner inputRemove = new Scanner(System.in);
                System.out.println("Enter an entry's email to remove: ");
                email = inputRemove.next();

                AddressBook addressToBeRemoved = null;

                for (AddressBook address : addressList) {
                    if (address.getEMAIL_ADDRESS().equalsIgnoreCase(email))
                        addressToBeRemoved = address;
                    System.out.println(addressList.toString());
                }
                if (addressToBeRemoved != null) {
                    addressList.remove(addressToBeRemoved);
                    System.out.println("Address deleted successfully\n");
                }
                else
                    System.out.println("ERROR! Address not found!\n");

            }

            //printing the options of the lists of entries
            if (option == 3) {

                System.out.println("1) First Name:");
                System.out.println("2) Last Name:");
                System.out.println("3) Phone Number:");
                System.out.println("4) Email Address\n");


                //Below taking the input for type & search from the console/ standard output
                System.out.println("Chose a search type: ");
                int type = input.nextInt();


                System.out.println("Enter your search: ");
                String search = input.next();


                //// With the specific type & search type , all the specific elements are displayed
                for (AddressBook address : addressList) {

                    if (type == 1) {
                        if (address.getFIRST_NAME().equalsIgnoreCase(search))

                            System.out.println(addressList.toString());

                    } else if (type == 2) {
                        if (address.getLAST_NAME().equalsIgnoreCase(search))

                            System.out.println(addressList.toString());
                    } else if (type == 3) {
                        if (address.getPHONE_NUMBER().equalsIgnoreCase(search))

                            System.out.println(addressList.toString());
                    } else if (type == 4) {
                        if (address.getEMAIL_ADDRESS().equalsIgnoreCase(search))

                            System.out.println(addressList.toString());
                    } else
                        System.out.println("ERROR! Address not found!\n");
                }
            }

            /// Printing all the elements from the Array list
            if (option == 4) {
                System.out.println("Address list:");
                for (AddressBook address : addressList) {
                    System.out.println(address.toString());

                }
            }



            ///Delete All elements from Array list
            if (option == 5) {
                addressList.clear();
                System.out.println("Address deleted successfully\n");

            }

        }

    }
}