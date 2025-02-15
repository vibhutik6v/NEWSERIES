
import javax.xml.transform.Source;

public class logicalOR {
    public static void main(String[] args) {
        String organi="gfg";
        if("gfg".equals(organi) |  "javatpoint".equals(organi)){
            System.out.println("User is permitted");
        }else{
            System.out.println("USer blocked");
        }
    }
}
