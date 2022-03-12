package Assignment.OOPS;
import java.util.HashMap;
import java.util.Scanner;

public class Problem3 {
	public static int count_spaces(String s) {
		int c=0;
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)==' ')
				c++;
		}
		System.out.println("Total Spaces are :");
		return c;
	}
	public static HashMap<Character, Integer> count_dup(String s) {
		
		HashMap<Character, Integer> map= new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if (map.containsKey(s.charAt(i))==false)
				map.put(s.charAt(i),1);
			else
			{	
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
		}
		HashMap <Character,Integer> map1=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if ((map.get(s.charAt(i))>1) && (map.get(s.charAt(i))!=' '))
				map1.put(s.charAt(i),map.get(s.charAt(i)));
		}
		System.out.println("Duplicates and their respective Counts are : ");
		return map1;
	}
	public static int count_uniques(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if (map.containsKey(s.charAt(i))==false)
				map.put(s.charAt(i),1);
			else
			{	
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
		}
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if (map.get(s.charAt(i))==1)
			{
				c++;
			}
		}
		System.out.println("Total number of Unique elements are : ");
		return c;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String s=new String();
		System.out.println("Give Input String below : ");
		s=in.nextLine();
		System.out.println(count_dup(s));
		System.out.println(count_spaces(s));
		System.out.println(count_uniques(s));
		}
}
