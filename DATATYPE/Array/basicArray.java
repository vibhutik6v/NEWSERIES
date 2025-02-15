package Array;

public class basicArray {
    
    public static void main(String[] args) {
        /*int[] arr = new int[10];
        arr[0]=10;
        arr[1]=20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        */

        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);


            float[] arr2 = new float[5];
            System.out.println(arr2[0]);
            String[] name ={
                "Rahul",
                "Rohit",
                "Raj",
                "Ravi",
                "Rahul"
            };
            System.out.println(name[0]);
            System.out.println(name[1]);
            System.out.println(name.length);
        }

    }
}
