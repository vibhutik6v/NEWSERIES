package FUNCTION;

public class variableArumentsVarargs {
    static float getAverage(float...a){
        
        // System.out.println(a.getClass().getName());
        // return 0;
        float sum=0;
        for(float i:a){
            sum+=i;
        }
        return sum/a.length;
        
           
       
    }
    public static void main(String[] args) {
        float avg1=getAverage(1,2,3,4,5);
        float avg2=getAverage(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Average of 1,2,3,4,5 is "+avg1);
        System.out.println("Average of 1,2,3,4,5,6,7,8,9,10 is "+avg2); 

    }
    
}
