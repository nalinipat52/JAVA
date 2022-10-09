package Control_Stmt;

import java.util.*;

public class CheckAdd {
    public static void main(String[] args) {
        String add = "Delhi,India";
        if(add.endsWith("India"))
        {
            if(add.contains("merut"))
            {
                System.out.println("city is merut");
            }
            else if(add.contains("Delhi"))
            {
                System.out.println("city is Noida");
            }
            else
            {
                System.out.println(add.split(",")[0]);
            }
        }
        else
        {
            System.out.println("you are not living in india");
        }
    }
}
