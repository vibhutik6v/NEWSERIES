import java.math.BigInteger;
import java.lang.Math;

public class BigIntegerIntroduction {
    public static void main(String[] args) {
        // long x=(long) Math.pow(10,20);
        // System.out.println(x);
        BigInteger a= new BigInteger("10969690000000000000000000000000000000");
        BigInteger b= new BigInteger("200");
        BigInteger c=a.add(b);
        BigInteger d=a.multiply(b);
        BigInteger e=a.subtract(b);
        BigInteger f=a.divide(b);
        BigInteger g=b.pow(20);
        System.out.println(g);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
    
}
