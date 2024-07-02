package studentmanagementsystem;

import java.util.*;

import java.sql.*;


class Student
{
	int rno,age;
	String name,grade;
	Student(int rno,String name,String grade,int age)
	{
		this.rno=rno;
		this.name=name;
		this.grade=grade;
		this.age=age;
	}
	Student()
	{}
}

class StudentManagementSystem  extends Student
{
	
	void search(int rno,ArrayList<Student> Array)
	{
		for(Student s:Array)
		{
			if(s.rno==rno)
			{
				System.out.println("Sucesssfully founded the student");
				System.out.println(s.rno+" "+s.name+" "+s.grade+" "+s.age);
				return ;
			}
			
		}
		System.out.println("No records Found");
		
		
	}
	void add(int rno,String name, String grade,int age,ArrayList<Student> Array)
	{
		Array.add(new Student(rno,name,grade,age));
		System.out.println("Added Sucessfully");
		
	}
	void remove(int rno,ArrayList<Student> Array)
	{
		int index=0;
		int fl=0;
		for(Student s:Array)
		{
			if(s.rno==rno)
			{
				fl=1;
				break;
			}
			else
			{
				index++;
			}
		}
		if(fl==1)
		{
			Array.remove(index);
			System.out.println("Sucessfully Removed  the Student");
		}
		else
		{
			System.out.println("No records found to delete");
		}
	}
	void display(ArrayList<Student> Array)
	{
		for(Student s:Array)
		{
			System.out.println(s.rno+" "+s.name+" "+s.grade+" "+s.age);
		}
	}
	
}

public class Main {

	public static void main(String[] args) 
	{
		//jdbc part starts
		
		
		/*try 
		   {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","20071973");
			
			Statement statement ;
			statement = connection.createStatement();
			ResultSet resultSet;
			resultSet = statement.executeQuery("select * from records");
			int ROLLNO , AGE;
			String NAME,GRADE;
			while(resultSet.next())
			{
				ROLLNO = resultSet.getInt("rno");
				NAME = resultSet.getString("name");
				GRADE = resultSet.getString("grade");
				AGE = resultSet.getInt("age");
				System.out.println(ROLLNO+" "+NAME+" "+GRADE+" "+AGE);
				
			}
			//System.out.println("It works fine");
			//resultSet.close();
			//statement.close();
			//connection.close();
		}
		catch(Exception e)
		{}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//jdbc part ends
		
		
		ArrayList<Student> Array = new ArrayList<>();
		int p=1;
		StudentManagementSystem sms = new StudentManagementSystem();
		while(p!=0)
		{
			System.out.println("press [1] for adding the student \n press[2] for removing the student \n press [3] for searching the student \n press [4] for displaying all the records of the all the students \n press [0] for exit");
			int n;
			Scanner in =new Scanner(System.in);
			System.out.println("Enter your choice:");
			n=in.nextInt();
			if(n==1)
			{
				//add;
				System.out.println("Enter your rollno: ");
				int rno=in.nextInt();
				System.out.println("Enter your name: ");
				String name=in.next();
				System.out.println("Enter yout grade: ");
				String grade = in.next();
				System.out.println("Enter your age: ");
				int age = in.nextInt();
				sms.add(rno,name,grade,age,Array);
				try 
				   {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","20071973");
					
					Statement statement ;
					statement = connection.createStatement();
					statement.executeUpdate("insert into records values (15,?,?,?)");
					statement.close();
					connection.close();
				}
				catch(Exception e)
				{}
				
				
				
				
				
				
			}
			else if(n==2)
			{
				//remove;
				System.out.println("Enter the roll no to  delete the student : ");
				int rolltodel=in.nextInt();
				sms.remove(rolltodel, Array);
			}
			else if(n==3)
			{
				System.out.println("Enter the roll no to search the student: ");
				int rolltosearch = in.nextInt();
				sms.search(rolltosearch, Array);
			}
			else if(n==4)
			{
				sms.display(Array);
			}
			else if(n==0)
			{
				System.out.println("Thank you!!!!!!!");
				p=0;
				System.exit(1);
			}
			else
			{
				System.out.println("Invalid Choice");
			}
		}
		
		
		
	}

}
