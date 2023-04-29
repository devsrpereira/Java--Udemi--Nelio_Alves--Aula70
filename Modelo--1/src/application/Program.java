package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = s.nextDouble();

        double c = circunference(radius);

        double v = volume(radius);

        System.out.printf("Circunfence: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);
    }

    private static double volume(double radius) {
        return 4.00 * PI * Math.pow(radius,3) / 3.00;
    }

    private static double circunference(double radius) {
        return 2.00 * PI * radius;
    }
}
