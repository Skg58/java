import java.util.Scanner;
import java.util.InputMismatchException;
class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Program terminated");
            sc.close();
        }
    }
}
