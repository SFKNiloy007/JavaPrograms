import java.util.Scanner;

public class CountingFinalBuild {
    public static void main(String[] args) {
        int remainder;
        int count = 0;

        System.out.println("    Number Counter    ");
        System.out.print("Enter the number : ");

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        System.out.print("Enter the number you want to count : ");
        int number2 = input.nextInt();

        while(number1 > 0)
        {
         remainder = number1 % 10;
         number1 = number1 / 10;
         if(remainder == number2)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
