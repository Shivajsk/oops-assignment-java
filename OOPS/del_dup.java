package Assignment.OOPS;
import java.util.HashSet;
import java.util.Set;
public class del_dup {
public static void main(String[] args) {
int a[] = {10 , 1, 2 , 10 , 23 , 2 , 1 , 50};
Set<Integer> set = new HashSet<>();
for (int i : a) {
set.add(i);
}
for (Integer integer : set) {
System.out.println(integer);
}
}
}