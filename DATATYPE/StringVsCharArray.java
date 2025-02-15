

public class StringVsCharArray {
    public static void main(String[] args) {
        String str="Hello";
        char[] arr={'H','e','l','l','o'};
        System.out.println(str);
        System.out.println(arr); 
        char[] arr1=str.toCharArray();
        System.out.println(arr1);
        String str1=new String(arr);
        System.out.println(str1);
    }
    
}
