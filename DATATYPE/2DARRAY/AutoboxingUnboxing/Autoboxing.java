package AutoboxingUnboxing;

public class Autoboxing {
    public static void main(String[] args) {
        int x=5;
        float y=3.12f;
        long z=5000;
            ///Autoboxing
        Integer intobj=x;
            Float floatObj=y;
            Long longObj=z;
            System.out.println(intobj);
            System.out.println(floatObj);
            System.out.println(longObj);



            System.out.println(Integer.MAX_VALUE);
            System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.max(5 ,10));
            Integer n=10;
            int nn=10;
            System.out.println(n==nn);
    }
    
}
