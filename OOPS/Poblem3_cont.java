import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Problem_3_Question_4 {
public static void main(String[] args) throws ParseException {
Scanner sc = new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
Date date = new Date();
System.out.print("Enter sample log:");
String str1 = sc.nextLine();
System.out.println(sdf.format(date) +":"+str1);
sc.close();
}
}