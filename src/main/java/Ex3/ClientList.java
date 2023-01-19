package Ex3;

import java.util.ArrayList;

public class ClientList {
    ArrayList<Ex3.Client> clientList = new ArrayList<Ex3.Client>();


    public void addClient(String name, int cc){
        System.out.println("Here");
        if(!name.matches("[a-zA-Z]+")){
            System.out.println("Please add a valid Name");
            return;
        }
        clientList.add(new Client(name, cc));
        System.out.println(name + " " +  "With CC:" + cc + " Was added");
    }

    public void getClients(){
        clientList.forEach((item)->{
            System.out.println("Client Name: "+ item.getName() + "Identified with CC: "  + item.getCc() + "Products: " +  item.getProducts());
        });
    }


    public void deleteClient(int cc){
        System.out.println("CC " + cc);
        for(int i=0; i <clientList.size(); i++){
            if(clientList.get(i).getCc() == cc){
                clientList.remove(i);
                System.out.println(clientList.get(i).getName()  + " Was removed");
            }
        }
    }

    public void searchClient(int cc){
        for(int i=0; i <clientList.size(); i++){
            if(clientList.get(i).getCc() == cc){
                System.out.println("The client's Index you're searching for is " + i +
                        "Is named" + clientList.get(i).getName() + " Identified with CC: " +  clientList.get(i).getCc());
            }
        }
    }

    public void addProductToClientByCc(int cc, Product product){
        System.out.println(product.toString());
        for(int i=0; i <clientList.size(); i++){
            if(clientList.get(i).getCc() == cc){
                clientList.get(i).addProduct(product);
            }
        }
    }


}
