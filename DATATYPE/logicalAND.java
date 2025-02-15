
import java.util.Scanner;

public class logicalAND {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();
        String citizenship= "Indian";
        if(age>=18 & "Indian".equals(citizenship)){
            System.out.println("Perssion may vote");
        }else{
            System.out.println("Perssion cannot vote");

        }
    }
}
