class Person {
    String name = "Rahul";
    int age = 20;
}
class Employee extends Person {
    int id = 101;
}
class Developer extends Employee {
    String language = "Java";
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + id);
        System.out.println("Language: " + language);
    }
    public static void main(String[] args) {
        new Developer().display();
    }
}
