class Fibonacci{
public static void main(String [] args){
int n=10;
int firstnum=0;
int secnum=1;
System.out.println("Fibonacci series of first " + n +"Numbers is");
for(int i=1;i<=n;++i){
System.out.print(firstnum +" ");
int nextnum=firstnum+secnum;
firstnum=secnum;
secnum=nextnum;
}
}
}
