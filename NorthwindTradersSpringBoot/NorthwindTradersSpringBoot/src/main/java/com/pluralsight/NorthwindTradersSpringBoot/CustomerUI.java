package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.dao.CustomerDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Customer;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CustomerUI {
    private final Scanner scanner = new Scanner(System.in);
    private final CustomerDAO customerDAO;

    public CustomerUI(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void run() {
        int choice;
        do {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    listCustomers();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);
    }

    private void printMenu() {
        System.out.println("\n--- Customer Admin Menu ---");
        System.out.println("1. List Customers");
        System.out.println("2. Add Customer");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    private void listCustomers() {
        customerDAO.getAll().forEach(System.out::println);
    }

    private void addCustomer() {
        System.out.print("Customer ID: ");
        String id = scanner.nextLine();

        System.out.print("Company Name: ");
        String companyName = scanner.nextLine();

        System.out.print("Contact Name: ");
        String contactName = scanner.nextLine();

        System.out.print("Contact Title: ");
        String contactTitle = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Region: ");
        String region = scanner.nextLine();

        System.out.print("Postal Code: ");
        String postalCode = scanner.nextLine();

        System.out.print("Country: ");
        String country = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Fax: ");
        String fax = scanner.nextLine();

        Customer customer = new Customer(id, companyName, contactName, contactTitle,
                address, city, region, postalCode, country, phone, fax);

        customerDAO.add(customer);
        System.out.println("✅ Customer added successfully!");
    }
}
