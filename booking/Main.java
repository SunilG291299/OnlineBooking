package booking;

import java.util.Scanner;

public class Main implements seat
{

	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Booking site:");
		System.out.println("Enter 1 for Bus booking:");
		System.out.println("Enter 2 for Train booking:");
		System.out.println("Enter 3 for Flight booking:");
		
		int n=sc.nextInt();
		
		switch(n)
		{
		
		case 1:Main1 a1=new Main1();
			   a1.m1();
			   break;
			   
		case 2:Main2 a2=new Main2();
			   a2.m1(); 
			   break;
			   
		/*case 3:Main1 a3=new Main1();
		       a3.m1();	
		       break;*/
		       
		default:System.out.println("Enter valid number");
		}
	}		
		
		public static void payment()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Choose the payment method:");
			System.out.println("Enter 1 for Debit card");
			System.out.println("Enter 2 for UPI");
			System.out.println("Enter 3 for Internet banking");
			int n1=sc.nextInt();
			
			switch(n1)
			{
			case 1:System.out.println("Debit card");
				   pay();
				   break;
				   
			case 2: System.out.println("UPI");
				    pay();
				    break;
				    
			case 3: System.out.println("Internet banking");
					pay();
					break;
					
			default:System.out.println("Enter valid number");		   
			}
	}
			
			public static void pay()
			{
				   Scanner sc=new Scanner(System.in);
				   System.out.println("pay 650");
				   System.out.println("Choose 1 for confirm");
				   System.out.println("choose 2 for decline");
				   int n2=sc.nextInt();
				   
				   switch(n2)
				   {
				   case 1: System.out.println("payment successfully");
				   		   System.out.println("Booking successfully");
				   		   break;
				   		   
				   case 2: System.out.println("payment unsuccessfuly");
				   		   System.out.println("Booking cancel");
				   		   break;
				   		   
				   default:System.out.println("Enter valid number");
				  }
			}

			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
			}		
	}