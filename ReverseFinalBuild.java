import java.util.Scanner;

public class ReverseFinalBuild {
    public static void main(String[] args) {

        int answer = 0;
        int remainder;
        System.out.println("          Number Reverser      ");
        System.out.print("Enter a number you want to reverse : ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while(number>0)
        {
            remainder = number % 10;
            number = number / 10;
            answer = answer * 10 + remainder;
        }
        System.out.println(answer);
    }
}
