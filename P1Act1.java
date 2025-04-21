import java.util.Scanner;

public class P1Act1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();

        int jumlah = bil1 + bil2;
        int kurang = bil1 - bil2;
        int kali = bil1 * bil2;
        int bagi = bil1 / bil2;

        System.out.println(bil1 + " + " + bil2 + " = " + jumlah);
        System.out.println(bil1 + " - " + bil2 + " = " + kurang);
        System.out.println(bil1 + " * " + bil2 + " = " + kali);
        System.out.println(bil1 + " / " + bil2 + " = " + bagi);

        input.close();
    }
}