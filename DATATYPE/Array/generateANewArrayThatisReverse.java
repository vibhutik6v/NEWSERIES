package Array;

public class generateANewArrayThatisReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[arr.length - 1 - i];
        }
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i] + " ");
        }
    }
    
}
