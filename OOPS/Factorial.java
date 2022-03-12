package Assignment.OOPS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Factorial {
public static int factorial(int n)
{
if(n == 0)
return 1;
else
return (n*factorial(n-1));
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int n = sc.nextInt();
System.out.println("Factorial of "+n+" = " + Problem_3_Question_7.factorial(n));
}
}