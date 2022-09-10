import java.util.Scanner;

public class Exercise013 {
    public static void first(){
        Scanner rect =  new Scanner(System.in);
        System.out.print("Weight:");
        double valWeight = rect.nextDouble();
        System.out.print("Height:");
        double valHeight = rect.nextDouble();

        System.out.println("Perimeter:" + (2*(valWeight+valHeight)));
        System.out.println("Area:" + valWeight*valHeight);
    }
}
