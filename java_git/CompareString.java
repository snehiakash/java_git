import java.util.*;
class CompareString{
public static void main(String [] args){
Scanner sc=new Scanner (System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
boolean isCompare=false;
for (int i=0;i<str1.length();i++){
if(str1.charAt(i)!=str2.charAt(i)){
isCompare=false;
break;
}
isCompare=true;
}

System.out.println("Both Strings are Equal" + isCompare);
}
}

