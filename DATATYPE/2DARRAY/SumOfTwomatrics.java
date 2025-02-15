
import java.util.Scanner;

public class SumOfTwomatrics {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int cols=sc.nextInt();
         int [][] arr1=new int[rows][cols];
            int [][] arr2=new int[rows][cols];
        printArray(arr1);
        printArray(arr2);
           /*  for(int i=0;i<rows;i++){
                    for(int j=0;j<cols;j++){
                        arr1[i][j]=sc.nextInt();
                    }
                    // System.out.println();
                }
                 
                            arr2[i][j]=sc.nextInt();
                        }
                        // System.out.println();
                   
                   
                    }
                        */
                        
                    int [][] sum=new int[rows][cols];
                    for(int i=0;i<rows;i++){
                        for(int j=0;j<cols;j++){
                            sum[i][j]=arr1[i][j]+arr2[i][j];
                        }
                    
                    }
    
}
static void printArray(int [][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            arr[i][j]=sc.nextInt();
            // System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
}