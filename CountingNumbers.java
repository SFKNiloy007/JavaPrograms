import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = in.nextInt();

        int count = 0;
        while(x > 0){
            int rem = x % 10;
            if(rem == a){
                count++;
            }
            x = x / 10;
        }
        System.out.println(count);
    }
}
