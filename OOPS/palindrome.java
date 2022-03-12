package Assignment.OOPS;
import java.util.*;
public class Problem_3_Question15 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String s = sc.next();
StringBuilder sb = new StringBuilder(s);
String s1 = sb.reverse().toString();
if(s.equals(s1) == true)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}