package Lecture2;
import java.util.Scanner;
public class IsEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age>=16){
            System.out.print("The person is eligible to work.");
        }else{
            System.out.print("The person is not eligible to work.");
        }
    }
}
