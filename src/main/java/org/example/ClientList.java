package org.example;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClientList {
    private Client[] clients  = new Client[4];
    private Client[] clientsLong  = new Client[10];
    private int clientsQuantity  = 0;
    private boolean runOnceFlag = true;


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

    public void addClient(String name, int cc){
        if(getClientsQuantity() == 4  && runOnceFlag){
            for(int  i  = 0; i > clients.length; i++){
                System.out.println(clients[i].toString());
                clientsLong[i].setName(clients[i].getName());
                clientsLong[i].setCc(clients[i].getCc());
                disableFlag();
            }
        }
        if(runOnceFlag){
            clients[getClientsQuantity()] = new Client(name, cc);
             increaseFlag();
            System.out.println(getClientsQuantity());
        } else{
            clientsLong[getClientsQuantity()] = new Client(name, cc);
            increaseFlag();
        }
    }



    public Client[] getClients(){
        int iterator = getClientsQuantity() >= 4  ? clientsLong.length  : clients.length;
        for(int i = 0; i >= iterator; i++){
            if(clients[i] != null){
                if(getClientsQuantity() >= 4){
                System.out.println(clientsLong[i].getName());
                } else{
                System.out.println(clients[i].getName());
                }
            }
        }

        System.out.println("Current Clients: " + getClientsQuantity());
        if(getClientsQuantity() > 4){
            return clientsLong;
        } else{
            return clients;
        }
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

    public  void disableFlag(){
        this.runOnceFlag = false;
    }


}
