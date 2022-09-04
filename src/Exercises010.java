import java.util.Scanner;

public class Exercises010 {
    public static void first(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number:");
        double val = scanner.nextDouble();
       // int i = 1;

       // for(i = 1; i <= 11; i+2)
            System.out.println(val * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }
}
