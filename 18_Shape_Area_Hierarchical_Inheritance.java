class Shape {
    void area(double a) { System.out.println("Area: " + a); }
}
class Circle extends Shape {
    void calculate() { area(3.14 * 5 * 5); }
}
class Rectangle extends Shape {
    void calculate() { area(10 * 5); }
}
class Triangle extends Shape {
    void calculate() { area(0.5 * 10 * 5); }
}
class ShapeMain {
    public static void main(String[] args) {
        new Circle().calculate();
        new Rectangle().calculate();
        new Triangle().calculate();
    }
}
