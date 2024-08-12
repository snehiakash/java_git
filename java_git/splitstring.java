public class splitstring{
public static void main(String [] args){
String s="091-1234567890";
String str[]=s.split("-");
printString(str,"String Split Method");
}
public static void printString(String str[],String approach){
System.out.println("splitting string by using "+ approach);
for(String string:str){
System.out.println(string);
}
}
}