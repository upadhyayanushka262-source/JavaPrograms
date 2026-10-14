class Rectangle {
    int length;
    int breadth;
    static String shapeName = "Rectangle";

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        int l = 10;
        int b = 5;

        Rectangle r = new Rectangle();
        r.length = l;
        r.breadth = b;
        r.calculateArea();
    }
}