class Conversion {
    public static void main(String[] args) {
        int n = 10;
        String binary = Integer.toBinaryString(n);
        System.out.println("Binary: " + binary);
        System.out.println("Integer: " + Integer.parseInt(binary, 2));
    }
}
