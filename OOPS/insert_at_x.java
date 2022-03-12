package Assignment.OOPS;

import java.util.*;
public class Problem_3_Question17 {
public static int[] insertX(int n, int arr[], int x, int pos) {
int i;
int newarr[] = new int[n + 1];
for (i = 0; i < n + 1; i++) {
if (i < pos - 1)
newarr[i] = arr[i];
else if (i == pos - 1)
newarr[i] = x;
else
newarr[i] = arr[i - 1];
}
return newarr;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
System.out.println("Before adding:");
System.out.println(Arrays.toString(arr));
System.out.println("Enter a number to add:");
int x = sc.nextInt();
System.out.println("Enter a position:");
int pos = sc.nextInt();
arr = Problem_3_Question17.insertX(arr.length, arr, x, pos);
System.out.println("After adding:");
System.out.println(Arrays.toString(arr));
}
}