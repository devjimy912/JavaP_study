package edu.handong.csee.java.finance;

public class Wallet{
    private boolean isOpening;
    private int amount;

    // + insert()
    // + takeOut()
    // + open()
    // + close()

    public int getAmount(){
        //영상보자..
        return amount;
    }

    public void insert(int amountToInsert) {
        if(isOpening != true) {
            System.out.println("Your wallet is closed. Now we open!");
            open();
        }
        amount = amount + amountToInsert;
    }
    public void takeOut(int amountToTakeOut) {
        if(isOpening != true) {
            System.out.println("Your wallet is closed. Now we open!");
            open();
        }
        if(amountToTakeOut > amount) {
            System.out.println("Not enough money in the Wallet");
            return;
        }
        amount = amount - amountToTakeOut;
    }
    public void open() {
        isOpening = true;
    }
    public void close() {
        isOpening = false;
    }

}