package Assignment.OOPS;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class File {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sangam_PC\\Desktop\\1.txt"));
Map<String , Integer> map = new HashMap<>();
String line="";
int count=0;
while((line = br.readLine()) != null)
{
String s[] = line.split(",");
count = map.getOrDefault(s[2], 0);
count++;
map.put(s[2], count);
}
for (String string : map.keySet()) {
System.out.println(string + ":" + map.get(string));
}
}
}