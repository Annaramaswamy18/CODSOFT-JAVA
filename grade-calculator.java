package gradecalculator;

import java.util.*;

public class gradecalculator {

	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		int avg=0;
		System.out.print("Enter the No.of.Subjects You have :");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter The marks you've obtained in Subject "+ (i+1) +":");
			int val=in.nextInt();
			avg+=val;
		}
		double average = avg/n;
		System.out.println("Results Available!!!");
		int sum=avg;
		if(average>=90 && average<=100)
		{
			System.out.println("Total Marks:"+sum+"\n"+"Average marks:"+average+"\n"+"Your Grade is :O");
		}
		else if(average>80)
		{
			System.out.println("Total Marks:"+sum+"\n"+"Average marks:"+average+"\n"+"Your Grade is :A");
		}
		else if(average>70)
		{
			System.out.println("Total Marks:"+sum+"\n"+"Average marks:"+average+"\n"+"Your Grade is :B");
		}
		else if(average>60)
		{
			System.out.println("Total Marks:"+sum+"\n"+"Average marks:"+average+"\n"+"Your Grade is :C");
		}
		else if(average>50)
		{
			System.out.println("Total Marks:"+sum+"\n"+"Average marks:"+average+"\n"+"Your Grade is :D");
		}
		else
		{
			System.out.println("Total Marks:"+sum+"\n"+"Average marks:"+average+"\n"+"Your Grade is :E"+"\n"+"you've not cleared");
		}

	}

}
