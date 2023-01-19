package Ex2;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("YEs");


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
                    System.out.println("Please enter your CC number: ");
                    try{
                    int idInput = Integer.parseInt(input.nextLine());
                    clients.addClient(nameInput, idInput);
                    } catch (NumberFormatException e){
                        System.out.println("Please enter a valid CC number");
                    }
                    break;
                case 2:
                    System.out.println("Please enter CC to Delete a client with: ");
                    try{
                    int clientCC = Integer.parseInt(input.nextLine());
                    clients.deleteClient(clientCC);
                    } catch (NumberFormatException e){
                        System.out.println("Please enter a valid CC");
                    }
                    break;
                case 3:
                    System.out.println("Please enter CC to Search a client with: ");
                    try{
                        int clientCC = Integer.parseInt(input.nextLine());
                        clients.searchClient(clientCC);
                    } catch (NumberFormatException e){
                        System.out.println("Please enter a valid CC");
                    }
                    break;
                case 4:
                        clients.getClients();
                    break;
                default:
                    System.out.println("Option not defined ");
                    break;
            }
        }

    }
}
