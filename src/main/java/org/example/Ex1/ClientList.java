package org.example.Ex1;

public class ClientList {
    private Client[] clients  = new Client[4];
    private Client[] clientsLong  = new Client[10];
    private int clientsQuantity  = 0;
    private boolean runOnceFlag = true;


    public void addClient(String name, int cc){
        if(!name.matches("[a-zA-Z]+")){
            System.out.println("Please add a valid Name");
            return;
        }
        if(getClientsQuantity() >= 10){
            System.out.println("Client list full, please delete a client ");
            return;
        }
        if(getClientsQuantity() == 4  && runOnceFlag){
            for(int  i  = 0; i < clients.length; i++){
                clientsLong[i] = new Client();
                clientsLong[i].setName(clients[i].getName());
                clientsLong[i].setCc(clients[i].getCc());
                disableFlag();
            }
        }
        if(runOnceFlag){
            clients[getClientsQuantity()] = new Client(name, cc);
             increaseFlag();
        } else{
            clientsLong[getClientsQuantity()] = new Client(name, cc);
            increaseFlag();
        }
    }

    public Client[] getClients(){
        int currentArrayLength = getClientsQuantity() > 4  ? clientsLong.length  : clients.length;
        for(int i  = 0; i < currentArrayLength; i++){
            if(runOnceFlag){
                if(clients[i] != null){
                System.out.println(clients[i].getName());
                }
            } else{
                if(clientsLong[i] != null){
                System.out.println(clientsLong[i].getName());
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



    public void deleteClient(int index){
        int currentArrayLength = getClientsQuantity() > 4  ? clientsLong.length  : clients.length;
        for(int i  = 0; i < currentArrayLength; i++){
            if(runOnceFlag){
                if(clients[i] != null && i == index){
                    clients[i] = null;
                }
            } else{
                if(clientsLong[i] != null && i == index){
                    clientsLong[i] = null;
                    }
                }
            }

    }

    public Client searchClient(int cc){
        int currentArrayLength = getClientsQuantity() > 4  ? clientsLong.length  : clients.length;
        Client foundClient = new Client();
        for(int i  = 0; i < currentArrayLength; i++){
            if(runOnceFlag){
                if(clients[i] != null && clients[i].getCc() == cc){
                    foundClient.setName(clients[i].getName());
                    foundClient.setCc(clients[i].getCc());
                }
            } else{
                if(clientsLong[i] != null && clientsLong[i].getCc() == cc){
                    foundClient.setName(clientsLong[i].getName());
                    foundClient.setCc(clientsLong[i].getCc());
                }
            }
        }
        System.out.println("Found Client " + foundClient);
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
