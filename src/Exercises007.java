import java.util.Scanner;

public class Exercises007 {
    public static void first(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number:");
        int val = scanner.nextInt();
        int i = 1;

        for(i = 1; i <= 10; i++) {
            System.out.println(val + "x" + i +"="+ (val * i));
        }
    }
}
