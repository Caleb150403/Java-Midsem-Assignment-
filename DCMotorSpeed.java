import java.util.Scanner;

public class DCMotorSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Voltage (V): ");
        double voltage = scanner.nextDouble();
        System.out.print("Enter Back EMF (V): ");
        double backEMF = scanner.nextDouble();
        System.out.print("Enter Motor Constant: ");
        double motorConstant = scanner.nextDouble();

        if (motorConstant <= 0) {
            System.out.println("Motor Constant must be greater than zero.");
        } else {
            double speed = (voltage - backEMF) / motorConstant;
            System.out.println("Speed of DC Motor = " + speed + " RPM");
        }

        scanner.close();
    }
}