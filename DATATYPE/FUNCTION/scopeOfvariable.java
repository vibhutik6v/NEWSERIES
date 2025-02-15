package FUNCTION;

public class scopeOfvariable {
    static void hello(){
        String s="hello vibhuti singh";
        System.out.println(s);
    }
    public static void main(String[] args) {
        int a=5;
        if(true){
            a=10;
            System.out.println("Inside if block a="+a);
        }
        System.out.println("Outside if block a="+a);
        hello();
        // System.out.println(s);
    }
    
}
