package task;
import java.util.*;
public class TaskConverter 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Currency Converter");
		System.out.println("Menu : \n Press 1 for Converting from INR to USD \n Press 2 for Converting from INR to AUD \n Press 3 for Converting from USD to INR \n Press 4 for Converting from AUD to INR");
		System.out.println("Enter your Choice: ");
		int n=in.nextInt();
		System.out.println("Enter your Amount: ");
		double x=in.nextDouble();
		if(n==1)
		{
			System.out.println("USD is :"+" "+x*0.012);
		}
		else if(n==2)
		{
			System.out.println("AUD is :"+" "+x*0.018);
		}
		else if(n==3)
		{
			System.out.println("INR is :"+" "+x*55.49);
		}
		else if(n==4)
		{
			System.out.println("INR is :"+" "+x*83.36);
		}
		
	}
}
