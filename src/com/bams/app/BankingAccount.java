package com.bams.app;

public class BankingAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankingAccount() {
    }

    /***
     * created Constructor
     * @param accountNumber
     * @param accountHolderName
     * @param balance
     */
    public BankingAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if (balance<0){
            System.out.println("intialBalance can not be less than zero means no negative balance in the account, so I am setting intialBalance as 0");
            this.balance=0;
        }else {
            this.balance=balance;
        }
    }

    /***
     * method to deposit money
     * @param amount
     */
    public void deposit(double amount){
        if(amount<0){
            System.out.println("amount should be positive,it can not be negative");
        }else {
           this.balance=this.balance+amount;
            System.out.println("deposited $" +amount+ "to account" +this.accountNumber);
        }

    }

    /***
     * method to withdraw money
     */

    public void withdraw(double amount){
        if(amount<0){
            System.out.println("amount should be positive,it can not be negative");
        } else if (amount>this.balance) {
            System.out.println("you have in sufficient funds in your account : " + this.accountNumber);

        }else {
           this.balance=this.balance-amount;
            System.out.println("withdraw $" +amount+ "from account" +this.accountNumber);
        }
    }

    /***
     * method to transfer money to another account
     */
    public void transfer(BankingAccount targetAccount,double amount){
        if (targetAccount==null){
            System.out.println("given account detailes are not valid");
        } else if (amount<0) {
            System.out.println("amount should be positive");
        } else if (amount>this.balance) {
            System.out.println("you have in sufficient funds in your your account");
        } else if (this.accountNumber==targetAccount.accountNumber) {
            System.out.println("can not transfer the money to self account");
        }else{
            this.balance=this.balance-amount;
            targetAccount.balance= targetAccount.balance+amount;
            System.out.println("Transferred $" + amount + " from account " + this.accountNumber +
                    " to account " + targetAccount.accountNumber);
        }
    }

    public void printAccountDetailes(){

        System.out.println("account name" +this.accountHolderName+ "to account" +this.accountNumber+ "account holder balance" +balance);

    }
}
