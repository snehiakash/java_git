import java.util.*;
class PalindromeStringDemo{
public static void main(String [] args){
String reverse="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String str=sc.nextLine();

for(int i=str.length()-1;i>=0;i--){
reverse=reverse+str.charAt(i);}

if(str.equals(reverse)){
System.out.println("Palindrome String");
 }
else{
System.out.println("Not a Palindrome String");

}
}
}



