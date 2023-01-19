package Ex2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClientList {

    ArrayList<Client> clientList = new ArrayList<Client>();


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
            System.out.println(item.getName());
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

}
