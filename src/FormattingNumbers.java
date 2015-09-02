import java.util.Scanner;

public class FormattingNumbers {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("a = ");
        int a = inputReader.nextInt();
        System.out.print("b = ");
        float b = inputReader.nextFloat();
        System.out.print("c = ");
        float c = inputReader.nextFloat();

        String hexadecimal = Integer.toHexString(a).toUpperCase();
        String binaryForm = String.format("%"+Integer.toString(10)+"s",Integer.toBinaryString(a)).replace(" ","0");


        System.out.printf("|%s           |%s|           %s|%s           |",
                hexadecimal,
                binaryForm,
                String.format("%.2f",b),
                String.format("%.3f",c));
    }

}
