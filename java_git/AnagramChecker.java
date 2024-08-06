import java.util.*;
class AnagramChecker{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
char c1[]=str1.toCharArray();
char c2[]=str2.toCharArray();
if (c1.length !=c2.length){
System.out.println("Not Anagram");
System.exit(0);}
Arrays.sort(c1);
Arrays.sort(c2);
for(int i=0;i<c1.length;i++){
 if(c1[i]!=c2[i]){
System.out.println("Not Anagram");
}
}
System.out.println("Anagram");
}
}



