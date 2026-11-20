interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape {
    public double calculateArea() { return 3.14 * 5 * 5; }
    public double calculatePerimeter() { return 2 * 3.14 * 5; }
}
class Rectangle implements Shape {
    public double calculateArea() { return 10 * 5; }
    public double calculatePerimeter() { return 2 * (10 + 5); }
}
class Triangle implements Shape {
    public double calculateArea() { return 0.5 * 10 * 6; }
    public double calculatePerimeter() { return 10 + 6 + 8; }
}
class ShapeDemo {
    public static void main(String[] args) {
        Shape c = new Circle(), r = new Rectangle(), t = new Triangle();
        System.out.println("Circle: " + c.calculateArea() + ", " + c.calculatePerimeter());
        System.out.println("Rectangle: " + r.calculateArea() + ", " + r.calculatePerimeter());
        System.out.println("Triangle: " + t.calculateArea() + ", " + t.calculatePerimeter());
    }
}
