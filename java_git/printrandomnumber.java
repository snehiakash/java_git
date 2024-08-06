
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
class printrandomnumber{
public static void main(String [] args){
System.out.println(Math.random());
System.out.println(ThreadLocalRandom.current().nextInt());
System.out.println(ThreadLocalRandom.current().nextDouble());
System.out.println(ThreadLocalRandom.current().nextBoolean());
Random random=new Random();
System.out.println(random.nextInt(10000));
System.out.println(random.nextDouble());
System.out.println(random.nextLong());
 }
}
