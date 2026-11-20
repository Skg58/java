import java.util.Scanner;
class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String day = sc.next();
        int n = sc.nextInt();
        double amount = n * 200;
        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))
            amount *= 1.25;
        System.out.println("Base Amount: " + (n * 200));
        System.out.println("After Weekend Charge: " + amount);
        if (age < 25) amount *= 0.80;
        else if (age >= 60) amount *= 0.70;
        System.out.println("After Age Discount: " + amount);
        if (n >= 5) amount *= 0.90;
        System.out.println("Final Amount: " + amount);
    }
}
