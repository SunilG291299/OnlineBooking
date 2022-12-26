package booking;

import java.util.Scanner;

public interface Train extends seat
{
	public default void m1()
	{
		 //=============================TRAIN BOOKING SITE=======================\\
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Train Booking site:");
		Route.Route();
		
		System.out.println("Choose below:");
		System.out.println("Enter 1 for Sitting seat");
		System.out.println("Enter 2 for sleeper seat");
		int n=sc.nextInt();
	
		switch(n)
		{
		case 1: System.out.println("Choose 1 for A/C or 2 for Non-A/C");
				int n1=sc.nextInt();
				switch(n1)
				{
				case 1:System.out.println("A/C seat");
					   System.out.println("Choose Sitting seat:");//enter 1 Sitting seat;
					   System.out.println("Enter 1 for right window seat:");
					   System.out.println("Enter 2 for Middle seat:");
					   System.out.println("Enter 3 for Left window seat:");
					   int n2=sc.nextInt();
				
				switch(n2)
				{
				case 1:System.out.println("Right window A/C seat");//Enter 1 for right window seat;
					   System.out.println("pay: 1150/seat");
					   Main.payment();
					   break;
					   
				case 2:System.out.println("Middle A/C seat");//Enter 2 for middle seat;
				   	   System.out.println("pay:850/seat");
				   	   Main.payment();
				   	   break;
				   
				case 3:System.out.println("Left window A/C seat");//Enter 3 for Left window seat;
				   	   System.out.println("pay:1150/seat");
				   	   Main.payment();
				   	   break;
				   
				default:System.out.println("Enter valid number");
				}
						break;
						
				case 2:System.out.println("Non-A/C seat");
				   	   System.out.println("Choose Sitting seat:");//enter 1 Sitting seat;
				   	   System.out.println("Enter 1 for right window seat:");
				   	   System.out.println("Enter 2 for Middle seat:");
				   	   System.out.println("Enter 3 for Left window seat:");
				   	   int n3=sc.nextInt();
			
			  switch(n3)
			  {
			  	case 1:System.out.println("Right window Non-A/C seat");//Enter 1 for right window seat;
				       System.out.println("pay:450/seat");
				       Main.payment();
				       break;
				   
			  	case 2:System.out.println("Middle Non-A/C seat");//Enter 2 for middle seat;
			  			System.out.println("pay:350/seat");
			  			Main.payment();
			  			break;
			   
			  	case 3:System.out.println("Left window Non-A/C seat");//Enter 3 for Left window seat;
			           System.out.println("pay:450/seat");
			           Main.payment();
			           break;
			   
			  	default:System.out.println("Enter valid number");
			  }
					break;
					
				default:System.out.println("Enter Valid number");
			}
				break;
						
		case 2:System.out.println("sleeper seat");
			   System.out.println("Choose A/C for 1 or Non-A/C for 2");
		 	   int n2=sc.nextInt();
		 	   
		 	  switch(n2)
				{
				case 1:System.out.println("A/C seat");
					   System.out.println("Choose sleeper seat:");//enter 2 for sleeper seat;
					   System.out.println("Enter 1 for right window seat:");
					   System.out.println("Enter 2 for Middle seat:");
					   System.out.println("Enter 3 for Left window seat:");
					   int n3=sc.nextInt();
				
				switch(n3)
				{
				case 1:System.out.println("Right window A/C seat");//Enter 1 for right window seat;
					   System.out.println("pay:2150/seat");
					   Main.payment();
					   break;
					   
				case 2:System.out.println("Middle A/C seat");//Enter 2 for middle seat;
				       System.out.println("pay:1850/seat");
				       Main.payment();
				       break;
				   
				case 3:System.out.println("Left window A/C seat");//Enter 3 for Left window seat;
				       System.out.println("pay:2150/seat");
				       Main.payment();
				       break;
				   
				default:System.out.println("Enter valid number");
				}
						break;
						
				case 2:System.out.println("Non-A/C seat");
			   	       System.out.println("Choose Sitting seat:");//enter 1 Sleeper seat;
			   	       System.out.println("Enter 1 for right window seat:");
			   	       System.out.println("Enter 2 for Middle seat:");
			   	       System.out.println("Enter 3 for Left window seat:");
			   	       int n4=sc.nextInt();
		
			   switch(n4)
			   	{
			   	case 1:System.out.println("Right window Non-A/C seat");//Enter 1 for right window seat;
			   		   System.out.println("pay:1350/seat");
			   		   Main.payment();
			   	       break;
			   
			   	case 2:System.out.println("Middle Non-A/C seat");//Enter 2 for middle seat;
			   		   System.out.println("pay:1150/seat");
			   		   Main.payment();
			   		   break;
		   
			   	case 3:System.out.println("Left window Non-A/C seat");//Enter 3 for Left window seat;
		               System.out.println("pay:1350/seat");
		               Main.payment();
		               break;
		   
			   	default:System.out.println("Enter valid number");
			   	}
					break;
				}		
				
		default:System.out.println("Enter Valid number");
		}
	}
}