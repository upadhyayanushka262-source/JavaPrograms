class Product {
    int id;
    String name;
    double price;
    static double discountRate = 10;

    void calculatePrice() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.id = 101;
        p.name = "Bag";
        p.price = 1000;
        p.calculatePrice();
    }
}