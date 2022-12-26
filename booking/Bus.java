package booking;

import java.util.Scanner;

public interface Bus extends seat
{
    public default void m1()
	{
    	//=========================BUS BOOOKING SITE===============================\\
    	
    	Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Bus booking site:");
		Route.Route();
		
		System.out.println("Choose below:");
		System.out.println("enter 1 for Sitting seat");
		System.out.println("enter 2 for sleeper seat");
		int n=sc.nextInt();
	
		switch(n)
		{
		case 1: System.out.println("Choose Sitting seat:");//enter 1 Sitting seat;
				System.out.println("Enter 1 for right window seat:");
				System.out.println("Enter 2 for Middle seat:");
				System.out.println("Enter 3 for Left window seat:");
				int n1=sc.nextInt();
				
				switch(n1)
				{
				case 1:System.out.println("Right window seat");//Enter 1 for right window seat;
					   System.out.println("Amount:650/seat");
					   Main.payment();
					   break;
					   
				case 2:System.out.println("Middle seat");//Enter 2 for middle seat;
				       System.out.println("Amount:450/seat");
				       Main.payment();
				       break;
				   
				case 3:System.out.println("Left window seat");//Enter 3 for Left window seat;
				   	   System.out.println("Amount:650/seat");
				   	   Main.payment();
				   	   break;
				   
				default:System.out.println("Enter valid number");
				}
						break;
						
		case 2: System.out.println("Choose sleeper seat:");//sleeper:enter 2 for sleeper seat;
				System.out.println("Enter 1 for right window seat:");
				System.out.println("Enter 2 for Middle seat:");
		   	    System.out.println("Enter 3 for Left window seat:");
				int n2=sc.nextInt();
		
				switch(n2)
				{
				case 1:	System.out.println("Right window seat");//Enter 1 for right window seat;
						System.out.println("Amount:850/seat");
						Main.payment();
						break;
						
				case 2: System.out.println("Middle seat");//Enter 2 for middle seat;
		   	   			System.out.println("Amount:650/seat");
		   	   			Main.payment();
		   	   			break;
		   	   			
				case 3: System.out.println("Left window seat");//Enter 3 for Left window seat;
		   	   			System.out.println("Amount:850/seat");
		   	   			Main.payment();
		   	   			break;
		   	   			
				default:System.out.println("Enter valid number");
				}
					break;			
		
		default:System.out.println("Enter valid number");
		}		
	}
}
