package me.huangzhen.bank;

public class Bank
{
	private Customer[] customers;
	private int numberOfCustomer;
	
	public Bank()
	{
		customers = new Customer[100];
	}
	
	public void addCustomer(String firstName, String lastName)
	{
		Customer customer = new Customer(firstName, lastName);
		customers[numberOfCustomer] = customer;
		numberOfCustomer++;
	}
	
	public int getNumberOfCustomer()
	{
		return numberOfCustomer;
	}
	
	public Customer getCustomer(int index)
	{
		return customers[index];
	}

}
