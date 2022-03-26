package speedtest;
import java.util.Random;
/**
 * The result is about the same
 * 结果差不多
 */
public class SpeedTest {
    public static void main(String[] args) {
        long t=System.currentTimeMillis();
        long maxT=1000000000;
        Random rand =new Random();
        double n=rand.nextDouble();
        Double n2=rand.nextDouble();
        int r=0;
        for(long i=0;i<maxT;i++){
            r=(int)n;
        }
        System.out.println(System.currentTimeMillis()-t);
        t=System.currentTimeMillis();
        for(long i=0;i<maxT;i++){
            r=n2.intValue();
        }
        System.out.println(System.currentTimeMillis()-t);
    }
}
