import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int units = sc.nextInt();
        double rate = sc.nextDouble();
        double charge = sc.nextDouble();
        double energy = units * rate;
        double subtotal = energy + charge;
        double tax = subtotal * 0.05;
        System.out.println("Customer: " + name);
        System.out.println("Energy Charge: " + energy);
        System.out.println("Final Bill: " + (subtotal + tax));
    }
}
