package com.websitesinseattle.broadcastdemo;

public class IncomingNumber {

    private int id;
    private String number;

    public IncomingNumber(int id, String number){
        this.setId(id);
        this.setNumber(number);
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
