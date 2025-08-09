package Lecture1;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The side A is: ");
        double A = scanner.nextDouble();
        System.out.println("The side B is: ");
        double B = scanner.nextDouble();
        System.out.println("The side C is: ");
        double C = scanner.nextDouble();
        double pTriangle = A + B + C;
        double aTriangle = (A + B + C) / 2;
        System.out.println("The perimeter is: " + pTriangle);
        System.out.println("The area is: " + aTriangle);
        scanner.close();
    }
}
