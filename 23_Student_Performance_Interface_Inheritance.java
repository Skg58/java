interface Academic { double academicPerformance(); }
interface Sports { double sportsPerformance(); }
interface StudentPerformance extends Academic, Sports { void display(); }
class Student implements StudentPerformance {
    public double academicPerformance() { return 85; }
    public double sportsPerformance() { return 90; }
    public void display() {
        System.out.println("Academic: " + academicPerformance());
        System.out.println("Sports: " + sportsPerformance());
        System.out.println("Overall: " +
            (academicPerformance() + sportsPerformance()) / 2);
    }
    public static void main(String[] args) {
        new Student().display();
    }
}
