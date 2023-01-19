package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ClientList clients = new ClientList();
        int option = 0;

        System.out.println("Welcome...");
        while(option != 5){
        System.out.println("1. Add a new client");
        System.out.println("2. Delete a client by Index");
        System.out.println("3. Search for a client");
        System.out.println("4. Show all clients");
        System.out.println("5. Exit");

        option = Integer.parseInt(input.nextLine());

        switch(option){
            case 1:
                System.out.println("Please enter your Name: ");
                String nameInput = input.nextLine();
                System.out.println("Please enter your Id number: ");
                int idInput = Integer.parseInt(input.nextLine());
                clients.addNewClient(nameInput, idInput);
                clients.addClient(nameInput, idInput);
                break;
            case 2:
                System.out.println("Please enter Client Index to Delete: ");
                int clientIndex = Integer.parseInt(input.nextLine());
                clients.deleteClient2(clientIndex);
               // clients.deleteClient(clientIndex);
                break;
            case 3:
                System.out.println("Please enter Client CC to search for: ");
                int clientCC = Integer.parseInt(input.nextLine());
                clients.getClient(clientCC);
                break;
            case 4:
                clients.getClients();
               // List<Client> myClients = clients.getClients();
               // myClients.forEach((person) -> {
                 //   System.out.println(person.getName());
                //});
                break;
            default:
                System.out.println("Option not defined ");
                break;
        }
        }









    }

    public void openMenu(){
        System.out.println("Welcome...");
        System.out.println("1. Add a new client");
        System.out.println("2. Delete a client by Index");
        System.out.println("3. Search for a client");
        System.out.println("4. Show all clients");
        System.out.println("5. Exit");
    }
}