package Assignment.OOPS;
import java.util.Scanner;

public class listofstrings {
	public static String count_of_alpha_or_num(String[] list) 
	{
		int c = 0;
		int s = 0;
		for (int i=0 ; i < list.length ; i++)
		{	
			try 
			{
				Integer.parseInt(list[i]);
				c++;
			}
			catch (NumberFormatException e) 
			{
				s++;		
			}	
		}
		return "no. of non-numeric Strings are :"+s+
				"\n"
				+"no. of numeric Strings are : "+c;
	}
    public static void main(String[] args) {
	String[] list = new String[5];
	Scanner in = new Scanner(System.in);
	
	for(int i=0 ; i < list.length ; i++)
	{
		list[i]=in.nextLine();
		
	}
	System.out.println(count_of_alpha_or_num(list));
}
}
