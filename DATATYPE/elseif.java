
import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        if(x>0){
            System.out.println("positive number");
        }else if(x<0){
            System.out.println("nigative number");
        } else if(x==0){
            System.out.println();
        }
    }
}
