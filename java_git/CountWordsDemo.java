import java.util.*;
public class CountWordsDemo{

public static void main(String [] args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter a String");
String s=sc.nextLine();
int count=countNumberOfWords(s);
System.out.println("Count of words are= " + count);
}
private static int countNumberOfWords(String s){
 int count=0;
if(s.charAt(0)!=' '){
count++;
}
for(int i=0;i<s.length();i++){
if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
 count++;
}
}
return count;
}
}





