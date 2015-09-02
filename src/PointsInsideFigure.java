import java.util.Scanner;

public class PointsInsideFigure {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter the points: ");
        String[] input = inputReader.nextLine().split(" ");

        Float firstPoint = Float.parseFloat(input[0]);
        Float secondPoint = Float.parseFloat(input[1]);

        boolean isInsideUpperRectangle = firstPoint >= 12.5 && firstPoint <= 22.5 && secondPoint >= 6 && secondPoint <= 8.5;
        boolean isInsideSmallestRectangle = firstPoint >= 20 && firstPoint <= 22.5 && secondPoint >= 8.5 && secondPoint <= 13.5;
        boolean isInsideTheSquare = firstPoint >= 12.5 && firstPoint <= 17.5 && secondPoint >= 8.5 && secondPoint <= 13.5;

        if(isInsideUpperRectangle || isInsideSmallestRectangle || isInsideTheSquare){
            System.out.println("Inside");
        }else{
            System.out.println("Outside");
        }
    }

}
