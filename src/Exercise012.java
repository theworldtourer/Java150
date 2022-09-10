import java.util.Scanner;

public class Exercise012 {
    public static void first(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        double valFirst = scanner.nextDouble();
        System.out.print("Input second number:");
        double valSecond = scanner.nextDouble();
        System.out.print("Input third number:");
        double valThird = scanner.nextDouble();

        System.out.println("Average:"+ (valFirst+valSecond+valThird)/3.0);
    }
}
