
import java.util.Scanner;

public class largrestofNnumberUSingForLoop {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxvalue=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            maxvalue=Math.max(maxvalue,temp);
        }
        System.out.println(maxvalue);
     }
}
