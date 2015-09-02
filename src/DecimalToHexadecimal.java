import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = inputReader.nextInt();

        String str = Integer.toHexString(num).toUpperCase();

        System.out.println("Hexadecimal value: " + str);
    }

}