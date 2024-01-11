import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        System.out.println("Hello!!");
        System.out.println("Whats your Name??");

        Scanner name = new Scanner(System.in);

        String StringInput = name.nextLine();

        System.out.println("Hello, " + StringInput);
    }
}
