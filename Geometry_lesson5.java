interface Shape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();
}

class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}

class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}

public class Geometry_lesson5 {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "white","yellow");
        Shape rectangle = new Rectangle(3, 4, "blue", "green");
        Shape triangle = new Triangle(3, 4, 5, "yellow", "purple");

        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle fill color: " + circle.getFillColor());
        System.out.println("Circle border color: " + circle.getBorderColor());

        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle fill color: " + rectangle.getFillColor());
        System.out.println("Rectangle border color: " + rectangle.getBorderColor());

        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle fill color: " + triangle.getFillColor());
        System.out.println("Triangle border color: " + triangle.getBorderColor());
    }
}

