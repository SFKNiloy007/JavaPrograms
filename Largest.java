// Take 2 numbers as input and print the largest number

import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int Input1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int Input2 = input.nextInt();

        if(Input1 > Input2)
        {
            System.out.println("Largest Number is " + Input1);
        }
        else
        {
            System.out.println("Largest number is " + Input2);
        }
    }
}
