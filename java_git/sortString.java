import java.util.*;
class sortString{
public static void main(String [] args){
String str="world";
char ch[]=str.toCharArray();
Arrays.sort(ch);
String sortedStr=new String(ch);
System.out.println(sortedStr);
}
}