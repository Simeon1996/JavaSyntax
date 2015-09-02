import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter the sides of the rectangle: ");

        String[] rectangleSides = inputReader.nextLine().split(" ");

        int a = Integer.parseInt(rectangleSides[0]);
        int b = Integer.parseInt(rectangleSides[1]);

        int rectangleArea = a * b;

        System.out.print("Area = " + rectangleArea);
    }
}