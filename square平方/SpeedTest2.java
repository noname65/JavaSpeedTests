package speedtest2;
import java.util.Random;
/**
 * The result of adding five numbers is still about the same
 * 五个数相加结果仍然差不多
 */
public class SpeedTest2 {
    public static void main(String[] args) {
        long t=System.currentTimeMillis();
        long maxT=1000000000;
        Random rand =new Random();
        int n1=rand.nextInt(),n2=rand.nextInt(),n3=rand.nextInt(),n4=rand.nextInt(),n5=rand.nextInt();
        int r=0;
        for(long i=0;i<maxT;i++){
            r=(n1+n2+n3+n4+n5)*(n1+n2+n3+n4+n5);
        }
        System.out.println(System.currentTimeMillis()-t);
        t=System.currentTimeMillis();
        for(long i=0;i<maxT;i++){
            int temp=n1+n2+n3+n4+n5;
            r=temp*temp;
        }
        System.out.println(System.currentTimeMillis()-t);
    }
}
