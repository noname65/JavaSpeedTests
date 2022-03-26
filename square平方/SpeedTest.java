package speedtest;
import java.util.Random;
/**
 * Calculate (n1+n2)^2
 * Defining a new variable to store n1+n2 and multiplying it is faster than multiplying by n1+n2 directly, but the difference is not big
 * 计算(n1+n2)^2
 * 定义新的变量储存n1+n2再相乘比直接用n1+n2相乘快一点,但是区别不大
 */
public class SpeedTest {
    public static void main(String[] args) {
        long t=System.currentTimeMillis();
        long maxT=1000000000;
        Random rand =new Random();
        int n1=rand.nextInt(),n2=rand.nextInt();
        for(long i=0;i<maxT;i++){
            int r=(n1+n2)*(n1+n2);
        }
        System.out.println(System.currentTimeMillis()-t);
        t=System.currentTimeMillis();
        for(long i=0;i<maxT;i++){
            int temp=n1+n2;
            int r=temp*temp;
        }
        System.out.println(System.currentTimeMillis()-t);
    }
}
