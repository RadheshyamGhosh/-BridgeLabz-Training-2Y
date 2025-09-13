package javaconstructor;
class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        System.out.println("Default Circle Radius: " + c1.radius + ", Area: " + c1.getArea());
        System.out.println("Custom Circle Radius: " + c2.radius + ", Area: " + c2.getArea());
    }
}
