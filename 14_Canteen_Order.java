import java.util.Scanner;
class CanteenOrder {
    String name, item;
    int quantity;
    double price;
    double calculateTotal() { return quantity * price; }
    double discount() {
        double total = calculateTotal();
        if (total > 1000) return total * 0.10;
        if (total > 500) return total * 0.05;
        return 0;
    }
    void display() {
        double total = calculateTotal();
        System.out.println("Student: " + name);
        System.out.println("Item: " + item);
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount());
        System.out.println("Final Amount: " + (total - discount()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CanteenOrder o = new CanteenOrder();
        o.name = sc.nextLine();
        o.item = sc.nextLine();
        o.quantity = sc.nextInt();
        o.price = sc.nextDouble();
        o.display();
    }
}
