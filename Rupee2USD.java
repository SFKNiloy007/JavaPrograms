// Input currency in rupees and output in USD

import java.util.Scanner;
public class Rupee2USD {
    public static void main(String[] args) {
        System.out.print("Input amount of Rupee : ");
        Scanner input = new Scanner(System.in);

        double Rupee = input.nextDouble();
        double USD = Rupee * 0.012;

        System.out.println(USD);
    }
}
