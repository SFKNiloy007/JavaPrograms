//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

import java.util.Scanner;

public class Interest
{
    public static void main(String[] args)
    {
        System.out.println("Enter Principal : ");
        System.out.println("Enter Time : ");
        System.out.println("Enter Rate : ");

        Scanner input = new Scanner(System.in);
        float Principal = input.nextFloat();
        float Rate = input.nextFloat();
        float Time = input.nextFloat();

        float Interest = Principal * Rate * Time;

        System.out.println("Interest is " + Interest);

    }
}
