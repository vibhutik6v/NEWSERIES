import java.math.BigInteger;

public class BigIntegerDataConversion {
    public static void main(String[] args) {
        int x=50;
        BigInteger a= new BigInteger(x+"");
        System.out.println(a);
        BigInteger b=new BigInteger ("3445536");
        

    
    int y=b.intValue();
    System.out.println(y);
    long z=b.longValue();
    System.out.println(z);
    }
}
