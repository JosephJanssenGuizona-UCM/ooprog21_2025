import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        int hours = scanner.nextInt();

        System.out.print("What is your regular pay rate? ");
        double rate = scanner.nextDouble();

        Employee e = new Employee(rate);

        System.out.println("Regular pay is " + e.getRegularPay(hours));
        System.out.println("Overtime pay is " + e.getOvertimePay(hours));
    }
}
