import java.util.Scanner;

public class TheSmallestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("a = ");
        int a = inputReader.nextInt();
        System.out.print("b = ");
        int b = inputReader.nextInt();
        System.out.print("c = ");
        int c = inputReader.nextInt();

        if(a <= b && a <= c){
            System.out.println("Smallest: " + a);
        }else if(b <= a && b <= c) {
            System.out.println("Smallest: " + b);
        }else if(c <= a && c <= b){
            System.out.println("Smallest: " + c);
        }
    }

}
