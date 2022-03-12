package Assignment.OOPS;
import java.util.Scanner;
public class Thirdlargest {
	public static int third_largest_number(int arr[]) 
	{	int max1=arr[0],max2=0,max3=0;
		for(int i=0;i < arr.length;i++) 
		{
			if (arr[i]>max1)
			{
				max1=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]<max1)
				max2=arr[i];
			
		}
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==max1)
				continue;
			else if(arr[i]>max2)
				max2=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			if (arr[i]<max1 && arr[i]<max2)
				max3=arr[i];
			
		}
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==max1 || arr[i]==max2)
				continue;
			else if(arr[i]>max3)
				max2=arr[i];
		}
		return max3;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Third largest number in the array is : "+third_largest_number(arr));
	}

}
