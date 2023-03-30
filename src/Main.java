import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(5);
        System.out.println(square);
        Rectangle rectangle = new Rectangle("Yellow",true,4,3);
        System.out.println(rectangle);
        Circle circle = new Circle(7,"Red",true);
        System.out.println(circle);
    }
}
