import java.util.Scanner;
public class Execute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the number of events: ");
        int n = scanner.nextInt();

        int[] events = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Write the event number " + (i + 1) + ": ");
            events[i] = scanner.nextInt();
        }

        int finalCharge = GetBattery.getBattery(events);
        System.out.println("The final battery charge is : " + finalCharge);

        scanner.close();
    }
}