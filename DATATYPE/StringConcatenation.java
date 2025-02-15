public class StringConcatenation {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "World";
        String str3 = str + " " + str2;

        System.out.println(str3);
        int x=5;
        String str4 = str + x;
        System.out.println(str4);
        int[] arr={1,2,3};
        System.out.println(arr+"");
    }
}
