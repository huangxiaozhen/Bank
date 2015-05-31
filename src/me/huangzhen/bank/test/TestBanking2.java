package me.huangzhen.bank.test;

import me.huangzhen.bank.Account;
import me.huangzhen.bank.Customer;


public class TestBanking2 {

  public static void main(String[] args) {
    Customer customer;
    Account  account;

    account = new Account(500.00);
    
    System.out.println("Creating the customer Jane Smith.");
    customer =  new Customer("Jane", "Smith");
    
    System.out.println("Creating her account with a 500.00 balance.");
    customer.setAccount(account);
   
    System.out.println("Withdraw 150.00");
    customer.getAccount().withdraw(150.00);
   
    System.out.println("Deposit 22.50");
    customer.getAccount().deposit(22.50);
    
    
    System.out.println("Withdraw 47.62");
    customer.getAccount().withdraw(47.62);
    
    System.out.println("Customer [" + customer.getLastName()
		       + ", " + customer.getFirstName()
		       + "] has a balance of " + account.getBalance());
  }
}
