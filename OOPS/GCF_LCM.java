package Assignment.OOPS;

import java.util.Scanner;
public class GCF_LCM {
public static void main(String[] args) {
int n1, n2, t, temp1, temp2, lcm, gcd;
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter Two Number");
 n1 = scanner.nextInt();
 n2 = scanner.nextInt();
 temp1 = n1;
 temp2 = n2;
 while (temp2 != 0) {
 t = temp2;
 temp2 = temp1 % temp2;
 temp1 = t;
 }
 gcd = temp1;
 lcm = (n1 * n2) / gcd;
 System.out.println("LCM = " + lcm);
 System.out.println("GCD = " + gcd);
}
}