package Control_Stmt;

import java.util.Scanner;

public class SwithchP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a no : ");
        n = sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("invalid");

        }
    }
}
