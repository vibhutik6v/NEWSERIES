package FUNCTION;

public class callStack {
    public static void main(String[] args) {
        int x=0;
        System.out.println("main() x="+x);
        first();

    }
    static void first(){
        int x=10;
        System.out.println("first() x="+x);
        second();
    }
    static void second(){
        int x=20;
        System.out.println("second() x="+x);
        third();

    }
    static void third(){
        int x=30;
        System.out.println("third() x="+x);
    }

    
}
