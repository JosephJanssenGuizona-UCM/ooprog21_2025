import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double balance;
        double rate = 0.03; 
        int year = 1;
        int choice;

        System.out.print("Enter initial bank balance > ");
        balance = sc.nextDouble();

        do {
            balance = balance + (balance * rate);
            
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n", year, rate, balance);
            year++;

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes\nor any other number for no >> ");
            choice = sc.nextInt();

        } while (choice == 1);
    }
}
