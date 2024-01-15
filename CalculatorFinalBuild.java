import java.util.Scanner;

public class CalculatorFinalBuild
{
    public static void main(String[] args)
    {
        System.out.println("   Calculator      ");
        System.out.print("Enter a Operator : ");
        Scanner input = new Scanner(System.in);
        int ans = 0;
        char operator;
        while (true)
        {
            operator = input.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%')
            {
                System.out.println("Enter the 1st Number : ");
                int number1 = input.nextInt();

                System.out.println("Enter the 2nd Number : ");
                int number2 = input.nextInt();

                if (operator == '+')
                {
                    ans = number1 + number2;
                }
                if (operator == '-')
                {
                    ans = number1 - number2;
                }
                if (operator == '*')
                {
                    ans = number1 * number2;
                }
                if (operator == '/')
                {
                    ans = number1 / number2;
                }
                if (operator == '%' && number2 != 0)
                {
                    ans = number1 % number2;
                }

            }
            else if (operator == 'X' || operator == 'x')
            {
                break;
            }
            else
            {
                System.out.println("!!!!!INVALID!!!!!");
            }
            System.out.println(ans);
        }
    }
}
