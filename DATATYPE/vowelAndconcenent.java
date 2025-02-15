
import java.util.Scanner;

public class vowelAndconcenent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
    switch (ch){
/*case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':*/
        case 'a','e','i','o','u' -> System.out.println("vowel");
            default -> System.out.println("Concenent");
    }
        
            }
}
