import java.util.*;
class WordReverse{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String str=sc.nextLine();
String splitArray[]=str.split(" ");
for(int i=splitArray.length-1;i>=0;i--){
System.out.print(splitArray[i]+" ");
}
}
}