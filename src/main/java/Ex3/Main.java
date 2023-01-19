package Ex3;

import java.util.Scanner;

public class Main {


    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    ClientList clienList = new ClientList();

    int menuOption = 0;

            System.out.println("1. Show Clients Menu");
            System.out.println("2. Show Products Menu");
            System.out.println("3. Exit");
            menuOption = Integer.parseInt(input.nextLine());


        if(menuOption == 1){
            int clientMenuOption = 0;

            while(clientMenuOption != 6){
                System.out.println("1. Add a new client");
                System.out.println("2. Delete a client by Index");
                System.out.println("3. Search for a client");
                System.out.println("4. Show all clients");
                System.out.println("5. Add Product to client");
                System.out.println("6. Exit");

                clientMenuOption = Integer.parseInt(input.nextLine());
                switch (clientMenuOption){
                    case 1:
                        System.out.println("Please enter your Name: ");
                        String nameInput = input.nextLine();
                        System.out.println("Please enter your CC number: ");
                        try{
                            int idInput = Integer.parseInt(input.nextLine());
                            clienList.addClient(nameInput, idInput);
                        } catch (NumberFormatException e){
                            System.out.println("Please enter a valid CC number");
                        }
                        break;
                    case 2:
                        System.out.println("Please enter CC to Delete a client with: ");
                        try{
                            int clientCC = Integer.parseInt(input.nextLine());
                            clienList.deleteClient(clientCC);
                        } catch (NumberFormatException e){
                            System.out.println("Please enter a valid CC");
                        }
                        break;
                    case 3:
                        System.out.println("Please enter CC to Search a client with: ");
                        try{
                            int clientCC = Integer.parseInt(input.nextLine());
                            clienList.searchClient(clientCC);
                        } catch (NumberFormatException e){
                            System.out.println("Please enter a valid CC");
                        }
                        break;
                    case 4:
                        clienList.getClients();
                        break;
                    case 5:
                        try{
                            System.out.println("Please enter CC for the client wish to add the product to: ");
                            int clientCC = Integer.parseInt(input.nextLine());
                            clienList.searchClient(clientCC);

                            System.out.println("Enter product name: ");
                            String productName = input.nextLine();

                            System.out.println("Enter product price: ");
                            int productPrice = Integer.parseInt(input.nextLine());

                            clienList.addProductToClientByCc(clientCC, new Product(productName, productPrice));
                        } catch (NumberFormatException e){
                            System.out.println("Please enter a valid CC");
                        }
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        clientMenuOption = 6;
                        break;
                    default:
                        System.out.println(ANSI_RED + "UNDEFINED OPTION" + ANSI_RESET);
                        break;
                }
            }
        } else if(menuOption == 2){
            int productMenuOption = 0;
            while(productMenuOption != 3){
                System.out.println("1. Add client product");
                System.out.println("2. Update client product");
                System.out.println("3. Exit");
                productMenuOption = Integer.parseInt(input.nextLine());
                switch (productMenuOption){
                    case 1:
                        System.out.println("Case 1 Product");
                        ;
                        break;
                    case 2:
                        System.out.println("Case 2 Product");
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        productMenuOption = 3;
                        break;
                    default:
                        System.out.println(ANSI_RED + "UNDEFINED OPTION" + ANSI_RESET);
                        break;
                }
            }
        }

    }



}
