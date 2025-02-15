package FUNCTION;

public class methodOberloading {
    static int add(int a,int b){
        System.out.println("int add(int a,int b)");
        return a+b;

    }
    static String add(String a,String b){
        System.out.println("String add(String a,String b)");
        return a+b;
    }
    static String add(int a,String b){
        System.out.println("Inside third add");
        return a+b;
    }
        public static void main(String[] args) {
            System.out.println(add(5,6));
            System.out.println(add("Vibhuti","Kumar"));
            System.out.println(add(5,":- Apple"));
        }
    }
    

