package Lecture2;
import java.util.Scanner;
public class CalculateTheRevenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double revenue = quantity * price;
        double discount;
        if (quantity>=100 || quantity<=120){
            discount=0.15;
        }else if(quantity>120){
            discount=0.20;
        }else{
            discount=0.00;
        }
        double discountAmount = revenue * discount;
        double finalRevenue = revenue - discountAmount;
        System.out.printf("Discount: %.1f$%n", finalRevenue);
        System.out.printf("The revenue from sale: %.1f$%n", discountAmount);
        scanner.close();
    }
}
