package Task7;


public class Classs7 {
    //Описать класс, представляющий треугольник.
    // Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
    public static void main(String[] args) {
        Point a = new Point(5, 22);
        Point b = new Point(10, 32);
        Point c = new Point(20, 42);

        Triangle triangle = new Triangle(a, b, c);

        System.out.println("Периметр данного треугольника:" + triangle.perimeter());
        System.out.println("Площадь теугольника:" + triangle.square());
        System.out.println(triangle.medianIntersectionPoint());
    }
}

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public double distanceTo(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "Точка пересечения мередиан:" + " " + "(" + x + ";" + y + ")";
    }
}

class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        double ab = a.distanceTo(b);   // длины сторон
        double bc = b.distanceTo(c);
        double ac = a.distanceTo(c);

        return ab + bc + ac;
    }

    public double square() {
        double ab = a.distanceTo(b);   // длины сторон
        double bc = b.distanceTo(c);
        double ac = a.distanceTo(c);
        // полупериметр
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public Point medianIntersectionPoint() {
        return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
    }
}