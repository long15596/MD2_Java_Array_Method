import java.util.Scanner;

public class MD2_ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;
        double f;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    f = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fToC(f));
                }
                case 2: {
                    System.out.println("Enter celsius: ");
                    c = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + cToF(c));
                }
                case 3:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double cToF(double c) {
        double f = ( 9.0 / 5) * c + 32;
        return f;
    }

    public static double fToC(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}
