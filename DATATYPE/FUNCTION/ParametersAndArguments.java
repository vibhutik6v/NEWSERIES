package FUNCTION;

public class ParametersAndArguments {
    static void vib(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    static void parameters(String name,int age,String[] hobbies){
        System.out.println("Name :- "+name);
        System.out.println("Age :- "+age);
        System.out.println("Hobbies :- ");
        for(String hobby:hobbies){
            System.out.println(hobby);
        }
    }

    public static void main(String[] args) {
        // vib(10,20);
        // parameters(name:"vibhuti", age:21 , args);
        String name ="Vibhuti";
        int age=23;
        String[] hobbies={"Coding","Playing","Reading"};
        parameters(name,age,hobbies);

    }
    
}
