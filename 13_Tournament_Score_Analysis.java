import java.util.Scanner;
class Tournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int total = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int streak = 0, longest = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
            if (a[i] >= 50) {
                streak++;
                longest = Math.max(longest, streak);
            } else streak = 0;
        }
        double avg = (double) total / n;
        int count = 0;
        for (int x : a)
            if (x > avg) count++;
        System.out.println("Total Score: " + total);
        System.out.printf("Average Score: %.2f%n", avg);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
        System.out.println("Rounds Above Average: " + count);
        System.out.println("Longest Winning Streak: " + longest);
    }
}
