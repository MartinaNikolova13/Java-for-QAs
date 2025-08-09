package Lecture2;
import java.util.Scanner;

public class TriangleByGivenAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter second angle: ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter third angle: ");
        int angle3 = scanner.nextInt();

        int sumOfAngles = angle1 + angle2 + angle3;

        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0 || sumOfAngles != 180) {
            System.out.println("A triangle cannot be built based on the given angle values.");
        } else {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("A triangle can be built based on the given angle values and this triangle is right-angled");
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("A triangle can be built based on the given angle values and this triangle is obtuse");
            } else {
                System.out.println("A triangle can be built based on the given angle values and this triangle is acute");
            }
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("A triangle can be built based on the given angle values and this triangle is equilateral.");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("A triangle can be built based on the given angle values and this triangle is isosceles.");
            } else {
                System.out.println("A triangle can be built based on the given angle values and this triangle is multifaceted.");
            }
        }

        scanner.close();
    }
}
