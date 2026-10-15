class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 4;
    double breadth = 6;

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

public class Q15ShapeArea {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}
