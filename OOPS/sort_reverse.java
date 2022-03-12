package Assignment.OOPS;
import java.util.Arrays;
import java.util.Collections;
public class sort_reverse {
public static void main(String[] args) {
Integer a[] = {10 , 1, 2 , 10 , 23 , 2 , 1 , 50};
Arrays.sort( a, Collections.reverseOrder());
for (Integer integer : a) {
System.out.println(integer);
}
}
}