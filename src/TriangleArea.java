import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        double[] triangleCoordinates = new double[6];

        int firstCoordinatePosition = 0;
        int secondCoordinatePosition = 1;

        for(int i = 0; i < 3; i++){
            String[] input = inputReader.nextLine().split(" ");

            double firstCoordinate = Double.parseDouble(input[0]);
            double secondCoordinate = Double.parseDouble(input[1]);

            triangleCoordinates[firstCoordinatePosition] = firstCoordinate;
            triangleCoordinates[secondCoordinatePosition] = secondCoordinate;

            firstCoordinatePosition++;
            secondCoordinatePosition++;
        }

        double Ax = triangleCoordinates[0];
        double Ay = triangleCoordinates[1];
        double Bx = triangleCoordinates[2];
        double By = triangleCoordinates[3];
        double Cx = triangleCoordinates[4];
        double Cy = triangleCoordinates[5];

        double triangleArea = Math.abs((Ax * (By - Cy)) + (Bx * (Cy - Ay)) + (Cx * (Ay - By)) / 2);


        System.out.println(Math.floor(triangleArea));
    }

}