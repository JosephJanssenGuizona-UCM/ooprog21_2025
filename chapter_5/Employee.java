public class Employee {
    double payRate;
    static final double OVERTIME_RATE = 1.5;

    public Employee(double payRate) {
        this.payRate = payRate;
   }

    public double getRegularPay(int hours) {
        int regHours = Math.min(hours, 40);
        return regHours * payRate;
    }

    public double getOvertimePay(int hours) {
        int otHours = Math.max(0, hours - 40);
        return otHours * payRate * OVERTIME_RATE;
    }
}
