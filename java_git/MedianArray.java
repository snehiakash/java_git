import java.util.Arrays;
class MedianArray{
public static void main(String [] args){
int []array={12,4,15,5,19};
int median=findMedian(array);
System.out.println("Median="+median);
}


public static int findMedian(int[] array){
Arrays.sort(array);
int n=array.length;

if(n%2==1){
return array[n/2];}
else{
return (array[n-1]/2 + array[n/2])/2;
}
}
}