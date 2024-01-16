import java.util.Scanner;

public class CircleArea{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of radius : ");
        double rad = in.nextDouble();

        double circle = 3.1416 * rad;
        System.out.println("The Area of Circle is " + circle);
    }
}
