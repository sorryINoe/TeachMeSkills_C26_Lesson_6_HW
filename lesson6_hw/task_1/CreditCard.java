package com.teachmeskills.lesson6_hw.task_1;
public class CreditCard {
    String accountNumber ;
    int accountAmount ;
    public CreditCard(String accountNumber,int accountAmount){
        this.accountNumber = accountNumber;
        this.accountAmount = accountAmount;
    }
    public void addMoney(int moreMoney){
        accountAmount= accountAmount + moreMoney;
        System.out.print("transferred amount: " + moreMoney +  ", card balance: " + accountAmount + "\n" );
    }
    public void withdrawalMoney(int lessMoney){
        if (accountAmount < lessMoney){
            System.out.print("The amount in the account is less than the value you are trying to withdraw (" + "\n");
        }
        else {
            accountAmount= accountAmount - lessMoney;
            System.out.print("transferred amount: " + lessMoney +  ", card balance: " + accountAmount + "\n");
        }
    }
    public void cardInformation(){
        System.out.print("card Number: " + accountNumber +  ", card balance: " + accountAmount + "\n");
    }



}
