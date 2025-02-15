package 2DARRAY;

public class basic2D {
    public static void main(String[] args) {
        // int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(arr[0]);
        int rows=3;
        int cols=4;
        int [][] arr=new int[rows][cols];
        arr[1][2]=5;
        System.out.println(arr[1][2]);
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         arr[i][j]=i+j;
        //     }
        // }
    }
    
}
