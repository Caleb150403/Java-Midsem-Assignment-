import java.util.Scanner;

public class OhmsLaw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the unknown parameter (Voltage, Current, Resistance): ");
        String unknown = scanner.next().toLowerCase();
        
        double voltage = 0, current = 0, resistance = 0;
        
        switch (unknown) {
            case "voltage":
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                voltage = current * resistance;
                System.out.println("Voltage = " + voltage + "V");
                break;
            case "current":
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                current = voltage / resistance;
                System.out.println("Current = " + current + "A");
                break;
            case "resistance":
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                resistance = voltage / current;
                System.out.println("Resistance = " + resistance + "Ω");
                break;
            default:
                System.out.println("Invalid input.");
        }
        
        scanner.close();
    }
}