import java.util.stream.Stream;
import java.util.Arrays;
class PrintArray{
public static void main(String [] args){
String [] arr={"One","Two","Three"};
Arrays.asList(arr).forEach(element -> System.out.println(element));

//Method2
Arrays.stream(arr).forEach(System.out::println);

//Method3
Stream.of(arr).forEach(element->System.out.println("Method 3" + element));

//Method 4

for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);}

//Method 5
for(String element:arr){
System.out.println("Method5" + element);}

//Method 6
System.out.println(Arrays.toString(arr));


}
}