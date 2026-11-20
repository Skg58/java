import java.util.Scanner;
class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), a = sc.nextInt(), v = sc.nextInt();
        if (p >= 50 && a >= 75 && v >= 40) {
            double s = 0.6 * p + 0.4 * v;
            System.out.println("Approved");
            System.out.println("Final Score: " + s);
            if (s >= 80) System.out.println("Grade: A");
            else if (s >= 65) System.out.println("Grade: B");
            else if (s >= 50) System.out.println("Grade: C");
            else System.out.println("Grade: D");
        } else {
            if (p < 50) System.out.println("Project marks insufficient");
            if (a < 75) System.out.println("Attendance insufficient");
            if (v < 40) System.out.println("Viva marks insufficient");
        }
    }
}
