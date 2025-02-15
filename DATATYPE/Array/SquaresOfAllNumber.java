package Array;

public class SquaresOfAllNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    
}
