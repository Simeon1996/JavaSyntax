import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

/**
 * Created by Mnz on 8/27/2015.
 */
public class CountOfBitsOne {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        System.out.print("n = ");

        int bit = inputReader.nextInt();

        String bitRepresentation = Integer.toBinaryString(0x10000 | bit).substring(1);

        int oneBitCounter = 0;

        for(int i = 0; i < bitRepresentation.length();i++){
            if(bitRepresentation.charAt(i) == '1'){
                oneBitCounter++;
            }
        }

        System.out.println("binary representation of n: " + bitRepresentation);
        System.out.println("count: " + oneBitCounter);

    }
}
