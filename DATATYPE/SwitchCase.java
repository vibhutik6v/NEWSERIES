
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        switch (month) {
            case 1 -> {
                System.out.println("january");
                System.out.println("21 days");
            }
                case 2 -> {
                    System.out.println("febuary");
                    System.out.println("28 days");
            }
                case 3 -> {
                    System.out.println("March");
                    System.out.println("31 days");
            }
                case 4 -> {
                    System.out.println("April");
                    System.out.println("30 days");
            }
                case 5 -> {
                    System.out.println("May");
                    System.out.println("30 days");
            }
                case 6 -> {
                    System.out.println("June");
                    System.out.println("30 days");
            }
                case 7 -> {
                    System.out.println("Julay");
                    System.out.println("31 days");
            }
                case 8 -> {
                    System.out.println("August");
                    System.out.println("31 days");
            }
                case 9 -> {
                    System.out.println("September");
                    System.out.println("30 days");
            }
                case 10 -> {
                    System.out.println("October");
                    System.out.println("31 days");
            }
                case 11 -> {
                    System.out.println("Nuvember");
                    System.out.println("30 days");
            }
                case 12 -> {
                    System.out.println("Decmber");
                    System.out.println("31 days");
            }
            default -> System.out.println("Invalid month number");

        }
    }
}
