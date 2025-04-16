package com.bams.app;

public class BankingAppMain {
    public static void main(String[] args) {
        BankingAccount accountholder1=new BankingAccount(133421,"NagaMandava",981768.0948);
        BankingAccount accountholder2=new BankingAccount(12344,"Nagalakshmi Mandava",12345.098);

        System.out.println("initial Account deatiles");
        accountholder1.printAccountDetailes();
        accountholder2.printAccountDetailes();


        accountholder1.deposit(13544);
        accountholder1.withdraw(453232134);
        accountholder1.transfer(accountholder2,876543);

        System.out.println("after performing operations the Account deatiles are : ");
        accountholder1.printAccountDetailes();
        accountholder2.printAccountDetailes();

    }
}
