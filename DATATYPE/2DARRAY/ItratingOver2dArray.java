// package 2DARRAY;
import java.util.Scanner;
public class ItratingOver2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int row=sc.nextInt();
            int cols=sc.nextInt();
            int [][] arr=new int[row][cols];
            for(int i=0;i<arr.length;i++){
                    for(int j=0;j<arr[i].length;j++){
                        arr[i][j]=sc.nextInt();
                    }
                    System.out.println();
                }
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                            System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();

        /*int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();

        // }
        */
        // int []b={1,2,3,4,5};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }
    
}
