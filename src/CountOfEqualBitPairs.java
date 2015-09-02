import java.util.Scanner;

/**
 * Created by Mnz on 8/27/2015.
 */
public class CountOfEqualBitPairs {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        System.out.print("n = ");
        int n = inputReader.nextInt();

        String binaryRepresentation = Integer.toBinaryString(n);

        int counter = 0;

        for(int i = 0; i < binaryRepresentation.length() - 1;i++){
            if(binaryRepresentation.charAt(i) == binaryRepresentation.charAt(i + 1)){
                counter++;
            }
        }

        System.out.println("Binary representation of n: " + binaryRepresentation);
        System.out.println("count: " + counter);
    }
}
