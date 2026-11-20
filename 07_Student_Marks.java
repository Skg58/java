import java.util.Scanner;
class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 5; i++)
            total += sc.nextInt();
        double percentage = total / 500.0 * 100;
        double average = total / 5.0;
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Average: " + average);
        System.out.println("Integer Division: " + total / 5);
        System.out.println("Floating Division: " + total / 5.0);
        System.out.println("Integer Percentage: " + (int) percentage);
    }
}
