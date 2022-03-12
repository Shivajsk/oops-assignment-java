package Assignment.OOPS;

import java.util.*;
public class Problem_3_Question18 {
public static int[] insertX(int arr[] , int index) {
if (arr == null || index < 0 || index >= arr.length) 
 return arr;
 int[] anotherArray = new int[arr.length - 1];
 for (int i = 0, k = 0; i < arr.length; i++) {
 if (i == (index-1)) 
 continue;
 anotherArray[k++] = arr[i];
 }
 return anotherArray;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
System.out.println("Before deleting:");
System.out.println(Arrays.toString(arr));
System.out.println("Enter a position to delete:");
int pos = sc.nextInt();
arr = Problem_3_Question18.insertX(arr , pos);
System.out.println("After deleting:");
System.out.println(Arrays.toString(arr));
}
}