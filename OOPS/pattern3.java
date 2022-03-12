package Assignment.OOPS;

public class Problem_3_Question21 {
public static int upperPrint()
{
int a[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
int i,j,sum=0;
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
if(i > j)
System.out.print(" " + " ");
else {
sum = sum + a[i][j];
System.out.print(a[i][j] + " ");
}
}
System.out.println();
}
return sum;
}
public static int lowerPrint()
{
int a[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
int i,j,sum=0;
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
if(i >= j) {
sum = sum + a[i][j];
System.out.print(a[i][j] + " ");
}
else
System.out.print(" " + " ");
}
System.out.println();
}
return sum;
}
public static void main(String[] args) {
System.out.println("Upper Triangle of matrix:");
int sum = Problem_3_Question21.upperPrint();
System.out.println("Sum of Upper Triangle of matrix = " + sum);
System.out.println();
System.out.println("Lower Triangle of matrix:");
sum = Problem_3_Question21.lowerPrint();
System.out.println("Sum of Lower Triangle of matrix = " + sum);
}
}