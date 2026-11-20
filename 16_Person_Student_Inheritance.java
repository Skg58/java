class Person {
    String name = "Rahul";
    int age = 20;
}
class Student extends Person {
    int rollNumber = 101;
    double marks = 85.5;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        new Student().display();
    }
}
