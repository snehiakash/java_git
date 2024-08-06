import java.util.*;
class arraytoarraylist{
public static void main(String [] args){
String [] colors={"Red","Green","Blue"};
List list=Arrays.asList(colors);
System.out.println(list);
//2nd method.
List<String> l=new ArrayList<>();
Collections.addAll(l,colors);
System.out.println(l);
//3rd method
for(String string :colors){
l.add(string);
}
System.out.println(l);
}
}



