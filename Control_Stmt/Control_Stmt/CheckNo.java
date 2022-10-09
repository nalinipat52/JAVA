package Control_Stmt;

import java.util.Scanner;

public class CheckNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a no : ");
        n = sc.nextInt();
        if(n>100)
        {
            System.out.println("no is greater than 100");
        }
        else if(n<100)
        {
            System.out.println("no is less than 100");
        }
        else
        {
            System.out.println("no is equal");
        }
    }
}
