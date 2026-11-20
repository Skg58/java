import java.util.Scanner;
class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        double basic = sc.nextDouble();
        int days = sc.nextInt();
        int hours = sc.nextInt();
        double rate = sc.nextDouble();
        double hra = basic * 0.20;
        double da = basic * 0.15;
        double overtime = hours * rate;
        double gross = basic + hra + da + overtime;
        double tax = gross * 0.10;
        System.out.println("Employee: " + name);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + (gross - tax));
    }
}
