
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        //to genarate to reverse of the string
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        //to compare the original string with the reverse string
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
