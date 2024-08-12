
import java.util.*;
class PrintElementsInArray{
public static void main(String [] args){
String str[]={"Red","Blue","Green"};
int intArray[]={1,2,3};
int[][] twod=new int[][] {{1,2,3},{4,5,6}};
for(int i=0;i<str.length;i++){
System.out.println("Using Classic for loop " + str[i]);
}

for(String string : str){
System.out.println("Using Enhanced for loop " + string);
}
System.out.println("Using Arrays.asList() "+ Arrays.asList(str));
System.out.println("Using Arrays.toString() "+ Arrays.toString(str));
System.out.println("Using Arrays.toString() for int Array " + Arrays.toString(intArray));
System.out.println("Using deepToString() for int values " + Arrays.deepToString(twod));
Arrays.asList(str).stream().forEach(s->System.out.println("Using Stream " + s));
Arrays.stream(str).forEach(System.out::println);
}
}
