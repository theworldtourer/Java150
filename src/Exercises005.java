import java.util.Scanner;

public class Exercises005 {
    public static void first () {
        Scanner scanner = new Scanner( System.in); //scanner metodu öğrenildi.

        System.out.print("Input First Number:");
        int valFirst = scanner.nextInt();

        System.out.print("Input Second Number:");
        int valSecond= scanner.nextInt();

        System.out.println("Expected Output:");
        System.out.println(valFirst + "x" + valSecond + "=" + valFirst * valSecond);
    }
}
