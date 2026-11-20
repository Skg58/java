class Employee {
    double calculateSalary() { return 0; }
}
class PermanentEmployee extends Employee {
    double calculateSalary() { return 30000; }
}
class ContractEmployee extends Employee {
    double calculateSalary() { return 20000; }
}
class PartTimeEmployee extends Employee {
    double calculateSalary() { return 10000; }
}
class SalaryDemo {
    public static void main(String[] args) {
        Employee e;
        e = new PermanentEmployee();
        System.out.println("Permanent: " + e.calculateSalary());
        e = new ContractEmployee();
        System.out.println("Contract: " + e.calculateSalary());
        e = new PartTimeEmployee();
        System.out.println("Part Time: " + e.calculateSalary());
    }
}
