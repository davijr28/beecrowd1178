
import java.util.Scanner;

public class Beecrowd1178 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        double X;
        double N[] = new double[100];
        X = scanner.nextDouble();
        N[0] = X;
        System.out.printf("N[0] = %.4f%n", X);
        for (int i = 1; i < 100; i++) {
            N[i] = N[i - 1] / 2;
            System.out.printf("N[%d] = %.4f%n", i, N[i]);
        }
    }
}
