package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClientList {
    private Client[] clients  = new Client[4];
    private int clientsQuantity  = 0;


    private ValidationService validationService;


    public void addNewClient(String name, Integer cc){
        System.out.println(!name.matches("[aA-zZ]+"));
        if(!name.matches("[aA-zZ]+")){
            System.out.println("Please enter A valid Name and try again..");
            return;
        }
        System.out.println(!cc.toString().matches("[0-9]+"));
        if(!cc.toString().matches("[0-9]+")){
            System.out.println("Please enter A valid CC and try again..");
            return;
        }
        return;
        //if(clients.size() >= 4){
          //  System.out.println("Client list full please delete someone.");
        //    return;
        //}
        //clients.add(new Client(name, cc));
    }

    public void deleteClient(int index){
       // clients.remove(index);

        System.out.println("Client with id :" + index + " Was deleted");
    }

    public void addCLient(String name, Integer cc){
        clients[getClientsQuantity()] = new Client(name, cc);
        increaseFlag();
        if(getClientsQuantity() == 4){
            System.out.println("Max");
        }

    }





    public Client[] getClients(){
       // return this.clients;
        System.out.println(clients.length);
        for(int i = 0; i <= clients.length - 1; i++){
            //System.out.println(clients[i]);
            if(clients[i] != null){
                System.out.println(clients[i].getName());
            }
        }
        return this.clients;
    }

    public Client getClient(int cc){
        Client foundClient = new Client();
        //clients.forEach((client) -> {
          //  if(client.getCc() == cc){
            //    foundClient.setName(client.getName());
            //    foundClient.setCc(client.getCc());
           // }
        //});
       // System.out.println(foundClient.getName()) ;
        return foundClient;
    }

    public void deleteClient2(int index){
        for(int i = 0; i <= clients.length - 1; i++){
            //System.out.println(clients[i]);
            if(clients[i] != null && i == index){
                clients[i] = null;
            }
        }
    }

    public Client searchClient(int cc){
        Client foundClient = new Client();
        for(int i = 0; i <= clients.length - 1; i++){
            //System.out.println(clients[i]);
            if(clients[i] != null && clients[i].getCc() == cc){
                foundClient.setName(clients[i].getName());
                foundClient.setCc(clients[i].getCc());
            }
        }
        return foundClient;
    }

    public void increaseFlag(){
        this.clientsQuantity++;
    }
    public int getClientsQuantity(){
        return this.clientsQuantity;
    }
}
