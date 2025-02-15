package Array;

import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int key=sc.nextInt();
            boolean found=false;
            for(int i:arr){
                if(i==key){
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.println("Element found");
            }
            else{
                System.out.println("Element not found");
            } 
        }
    }
    

