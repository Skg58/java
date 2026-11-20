import java.util.Scanner;
class Movie {
    String title, genre;
    int count = 0;
    double total = 0;
    void addRating(int r) {
        if (r >= 1 && r <= 5) { total += r; count++; }
        else System.out.println("Invalid Rating");
    }
    void display() {
        double avg = total / count;
        System.out.println("Movie: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Valid Ratings: " + count);
        System.out.printf("Average Rating: %.2f%n", avg);
        if (avg >= 4.5) System.out.println("Excellent");
        else if (avg >= 3.5) System.out.println("Good");
        else if (avg >= 2.5) System.out.println("Average");
        else System.out.println("Poor");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie m = new Movie();
        m.title = sc.nextLine();
        m.genre = sc.nextLine();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) m.addRating(sc.nextInt());
        m.display();
    }
}
