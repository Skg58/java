class Employee {
    String name;
    int id;
    double salary;
    Employee(String n, int i, double s) {
        name = n; id = i; salary = s;
    }
}
class Manager extends Employee {
    String department;
    Manager(String n, int i, double s, String d) {
        super(n, i, s);
        department = d;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
    public static void main(String[] args) {
        new Manager("Rahul", 101, 30000, "IT").display();
    }
}
