

package guessrandomnumber;

import java.util.*;

import java.lang.*;

public class Guessgame {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello, Try you Luck");
		
		
		int play = 1;
		
		while(play==1)
		{
			int ran=(int)((Math.random()*(100-1)));
			
			int fl=0;
			
			int val=5;
			
			for(int i=1;i<=5;i++)
			{
				System.out.print("Enter your Guess :");
				int guessedvalue = in.nextInt();
				if(guessedvalue == ran)
				{
					fl=1;
					System.out.println("You've Guessed it !!!!");
					break;
				}
				if(guessedvalue > ran)
				{
					System.out.println("Try with Small number than " + guessedvalue  + ";" + "Attempts Remaining :" + (5-i));
					val=-1;
				}
				if(guessedvalue < ran)
				{
					System.out.println("Try with Big number than " + guessedvalue  + ";" + "Attempts Remaining :" + (5-i));
					val-=1;
				}
				
					
			}
			
			if(fl==1)
			{
				System.out.println("You've won the game!!!");
				System.out.println("Your Score :" + (val*20));
			}
			else
			{
				System.out.println("You've Lost!!!");
			}
			
			System.out.println("Press [1] to Try Again !!! and [0] to exit");
			
			System.out.println("Do you want to try again: ");
			int tryagain = in.nextInt();
			if(tryagain==0)
			{
				break;
			}
			
			
		}
		System.out.println("Thank you");
		
		
	}

}
