import java.util.Scanner;
class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd = sc.nextDouble();
        double rate = sc.nextDouble();
        double inr = usd * rate;
        int rounded = (int) inr;
        System.out.println("INR: " + inr);
        System.out.println("Rounded: " + rounded);
        System.out.println("Decimal Lost: " + (inr - rounded));
        System.out.println("After Fee: " + (inr * 0.98));
    }
}
