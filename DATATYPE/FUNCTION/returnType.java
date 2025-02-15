package FUNCTION;

public class returnType {
    static int square(int n){
        return n*n;
    }
    static String[] vibhuti(){
        String[] arr={"Vibhuti","Kumar","Singh"};
        return arr;
    }

    public static void main(String[] args) {
      
        
        /*// System.out.println("Square of "+n+" is "+square(n));
            // System.out.println(square(5));
            */
            // vibhuti();
            String[] arr=vibhuti();
            for(String vibhu : arr){
                System.out.println(vibhu);
            }
    }
    
}
