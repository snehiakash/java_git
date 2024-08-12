import java.util.*;
class Java8Palindrome{
public static void main(String [] args){

int r,sum=0,temp;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a Number");
int n=sc.nextInt();
temp=n;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;}

if(temp==sum)
System.out.println("Palindrome Number");
 else 
System.out.println("Not Palindrome Number");
}
}