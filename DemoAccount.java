import java.util.Scanner;

class BankAccount
{
	String actNo;
	String actHolderName;
	private double balance;

	BankAccount(String actNo, String actHolderName, double balance)
	{
		this.actNo = actNo;
		this.actHolderName = actHolderName;
		this.balance = balance;
	}
	double getbalance()
	{
		return balance;
	}

	void display()
	{
		System.out.println("Account no : " + actNo);
		System.out.println("Account Holder Name : " + actHolderName);
		System.out.println("Balance : " + balance);
	}
	void deposite(double amount)
	{
		if(amount>0)
		{
			balance += amount;
			System.out.println("After deposite "+amount);
			System.out.println("Balance is ="+balance);
		}
		else
		{
			System.out.println("Invalide amount you enter");
		}
	}	
	void withdraw(double amount)
	{
		if(amount<balance)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Insufficient Amount");
		}
	}
}
class DemoAccount
{
	public static void main(String[] args)
	{
		BankAccount b1 = new BankAccount("10101010","Poonam Chudasama",25000);
		b1.display();
		b1.withdraw(5000);

		
		System.out.println();
		BankAccount b2 = new BankAccount("11223344","Priyanshi Parasana",25000);
		b2.display();
		b2.withdraw(10000);

		if(b1.getbalance()>b2.getbalance())
		{
			System.out.println("After withdraw balance is ="+b1.getbalance());
		}
		else
		{
			System.out.println("After withdraw balance is ="+b2.getbalance());
		}

	}
}