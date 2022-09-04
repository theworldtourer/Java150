import java.util.Scanner;

public class Exercises011 {
    public static void first(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Radius of Circle:");
        double radiusVal = scanner.nextDouble();

        System.out.println("Perimeter is:" + (radiusVal*2*Math.PI));
        System.out.println("Area is:" + (radiusVal*radiusVal*Math.PI));
    }
}
