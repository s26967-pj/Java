public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        Circle circle3 = new Circle(3.0, "blue");
        Circle circle4 = new Circle();

        circle4.setRadius(4.0);
        circle4.setColor("green");

        System.out.println(circle1.getArea());
        System.out.println(circle1.getRadius());
        System.out.println(circle1);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getRadius());
        System.out.println(circle2);
        System.out.println(circle3.getArea());
        System.out.println(circle3.getRadius());
        System.out.println(circle3);
        System.out.println(circle4.getArea());
        System.out.println(circle4.getRadius());
        System.out.println(circle4);
    }
}