import java.util.Scanner;
class Expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday",
                         "Friday", "Saturday", "Sunday"};
        double[] e = new double[7];
        double total = 0, max = 0;
        int index = 0;
        for (int i = 0; i < 7; i++) {
            e[i] = sc.nextDouble();
            total += e[i];
            if (e[i] > max) { max = e[i]; index = i; }
        }
        double avg = total / 7;
        int count = 0;
        for (double x : e)
            if (x > avg) count++;
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", avg);
        System.out.printf("Highest: %.2f%n", max);
        System.out.println("Highest Day: " + days[index]);
        System.out.println("Days Above Average: " + count);
    }
}
