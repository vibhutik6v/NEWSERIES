import java.math.BigInteger;

public class BigIntegerFactorial {
    public static void main(String[] args) {
        /*int x=12200;
        int ans=1;
        for(int i=1;i<=x;i++){
            ans*=i;
        }
        System.out.println(ans);
        */
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= 50; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
        
    }
}
