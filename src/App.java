import Triangle.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Triangle triangle = new Triangle(5, 5, 6);
        System.out.println(triangle.getType());
        System.out.println("Area del tríangulo: " + triangle.getArea());
    }
}
