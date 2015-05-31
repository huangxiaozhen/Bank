package me.huangzhen.bank.test;

import me.huangzhen.bank.Bank;
import me.huangzhen.bank.Customer;

public class TestBanking4
{

	public static void main(String[] args)
	{
		Bank bank = new Bank();

		bank.addCustomer("Jane", "Simmas");
		bank.addCustomer("Owen", "Bryant");
		bank.addCustomer("Tim", "Soley");
		bank.addCustomer("Maria", "Soley");
		
		for (int i = 0; i < bank.getNumberOfCustomer(); i++)
		{
			Customer customer = bank.getCustomer(i);

			System.out.println("Customer [" + (i + 1) + "] is "
					+ customer.getLastName() + ", " + customer.getFirstName());
		}
	}
}
