
import java.util.Scanner;


public class P3act1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai N: ");
        int nilain = input.nextInt();

        System.out.println("Bilangan prima dari 2 sampai " + nilain + " adalah:");
        for (int i = 2; i <= nilain; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");

            }
        }
    }


    public static boolean isPrima(int nilain) {
        if (nilain < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nilain); i++) {
            if (nilain % i == 0) {
                return false;
            }
        }
        return true;

    }
}