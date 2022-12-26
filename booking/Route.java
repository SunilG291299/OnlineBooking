package booking;

import java.util.Scanner;

public class Route 
{
	static String B="Bagalkote";
	static String B1="Belagavi";
	static String H="Hubbali";
	static String B2="Bengaluru";
	
	public static void Route()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Route:");
		System.out.println("Bagalkote\nBelagavi\nHubbali\nBengaluru");
		
		System.out.println("Enter WHERE?");
		String s1=sc.next();
		
		System.out.println("Enter TO?");
		String s2=sc.next();
		System.out.println(s1+" "+"TO"+" "+s2);
		
		Route.Buskm(s1,s2);
		//Route.Trainkm(s1,s2);
	}
	
	public static void Buskm(String s1,String s2)
	{
	  
		if(s1.equals(B)&&(s2.equals(B1))||(s1.equals(B1))&&s2.equals(B))
		{
			System.out.println("142km");
		}
		else if(s1.equals(B)&&(s2.equals(H))||(s1.equals(H))&&s2.equals(B))
		{
			System.out.println("146km");
		}
		else if(s1.equals(B)&&(s2.equals(B2))||(s1.equals(B2))&&s2.equals(B))
		{
			System.out.println("475km");
		}
		else if(s1.equals(B1)&&(s2.equals(H))||(s1.equals(H))&&s2.equals(B1))
		{
			System.out.println("94km");
		}
		else if(s1.equals(B1)&&(s2.equals(B2))||(s1.equals(B2))&&s2.equals(B1))
		{
			System.out.println("511km");
		}
		else
		{
			System.out.println("412km");
		}
		
	}
	
	/*public static void Trainkm(String s3,String s4)
	{
	  
		if(s3.equals(B)&&(s4.equals(B1))||(s3.equals(B1))&&s4.equals(B))
		{
			System.out.println("Train is not there.\n Choose another Station ");
		}
		else if(s3.equals(B)&&(s4.equals(H))||(s3.equals(H))&&s4.equals(B))
		{
			System.out.println("152km");
		}
		else if(s3.equals(B)&&(s4.equals(B2))||(s3.equals(B2))&&s4.equals(B))
		{
			System.out.println("621km");
		}
		else if(s3.equals(B1)&&(s4.equals(H))||(s3.equals(H))&&s4.equals(B1))
		{
			System.out.println("142km");
		}
		else if(s3.equals(B1)&&(s4.equals(B2))||(s3.equals(B2))&&s4.equals(B1))
		{
			System.out.println("611km");
		}
		else
		{
			System.out.println("469km");
		}
	}*/
}
