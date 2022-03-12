package Assignment.OOPS;

public class Problem_3_Question22 {
public static void print()
{
int n=5 , i , j , x=1;
for(i=1;i<=n;i++)
{
for(j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(x + " ");
}
x += 2;
System.out.println();
}
x -= 2;
for(i=n;i>=1;i--)
{
for(j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(x + " ");
}
x -= 2;
System.out.println();
}
}
public static void main(String[] args) {
Problem_3_Question22.print();
}
}