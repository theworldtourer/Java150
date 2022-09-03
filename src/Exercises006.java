import java.util.Scanner;

public class Exercises006 {
    public static void first(){

        Scanner scanner = new  Scanner(System.in);

        System.out.print("Input First Number:");
        int valFirst = scanner.nextInt();

        System.out.print("Input Second Number:");
        int valSecond = scanner.nextInt();

        System.out.println(valFirst + "+" + valSecond +"="+ (valFirst + valSecond));
        System.out.println(valFirst + "-" + valSecond +"="+ (valFirst - valSecond));
        System.out.println(valFirst + "x" + valSecond +"="+ (valFirst * valSecond));
        System.out.println(valFirst + "/" + valSecond +"="+ (valFirst / valSecond));
    }
}
