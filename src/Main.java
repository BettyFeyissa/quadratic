import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a \n");
        int a = scan.nextInt();
        System.out.println("Enter b \n");
        int b = scan.nextInt();
        System.out.println("Enter c \n");
        int c = scan.nextInt();
        quadratic(a, b, c);
    }
    static void quadratic(int a, int b, int c)
    {
        double root1 = (-b + (Math.sqrt((Math.pow(b,2)-(4*a*c)))))/(2*a);

        double root2 = (-b - (Math.sqrt((Math.pow(b,2)-(4*a*c)))))/(2*a);

        System.out.println("Root 1 = " + root1);

        System.out.println("Root 2 = " + root2);
    }
}