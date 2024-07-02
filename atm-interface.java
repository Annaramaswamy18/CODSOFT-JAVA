package atminterface;

import java.util.*;


class Atm
{
	int balanceamount=0;
	int withdrawl(int amount)
	{
		if(amount>balanceamount)
		{
			return -1;
		}
		int ty=this.balanceamount;
		this.balanceamount=this.balanceamount-amount;
		return ty-amount;
	}
	
	void deposit(int amount)
	{
		this.balanceamount+=amount;
	}
	
	int checkbalance()
	{
		return this.balanceamount;
	}
}

class User extends Atm
{
	User()
	{}
	int balanceamount;
}

public class atminterface {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Hello");
		User user1 = new User();
		int counter=1;
		while(counter!=0)
		{
		System.out.println("press [1] for the Withdrawl option"+"\n"+"press [2] for the Deposit option"+"\n"+"press [3] for the Checkbalance"+"\n"+"press [4] to exit");
		System.out.println("Enter your Choice:");
		int choice = in.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the amount to be withdrawl:");
			int value=in.nextInt();
			int h=user1.withdrawl(value);
			if(h==-1)
			{
				System.out.println("operation failed , Insufficient Balance");
			}
			else
			{
				System.out.println("operation sucessful!!!.  withdrawn amount is:"+user1.checkbalance());
				System.out.println("Remaining balance is :"+user1.checkbalance());
			}
		}
		else if(choice==2)
		{
			System.out.println("Enter the amount to be deposited:");
			int value=in.nextInt();
			user1.deposit(value);
			System.out.println("operation sucessful!!!.");
		}
		else if(choice==3)
		{
			System.out.println(user1.checkbalance());
		}
		else
		{
			System.out.println("Terminated");
		}
		System.out.println("If you want to continue the process press [1] else press [0]");
		int next=in.nextInt();
		if(next==0)
		{
			System.out.println("Thank you");
			System.exit(0);
		}
		
		
		}

	}

}
