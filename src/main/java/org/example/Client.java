package org.example;

public class Client {
    private String name;
    private int cc;


    public Client(String name, int cc) {
        this.name = name;
        this.cc = cc;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

}