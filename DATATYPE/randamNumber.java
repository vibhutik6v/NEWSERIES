public class randamNumber {
    public static void main(String[] args) {
        while(true){
            int num=(int)(Math.random()*10+1);
            if(num==5)
                //  System.out.println("50 is found");
                break;
            if(num%4==0){
                System.out.println("hello");
                continue;
            }
            System.out.print(num+" ");
        }
    }

}
