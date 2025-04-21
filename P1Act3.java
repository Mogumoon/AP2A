import java.util.Scanner;

public class P1Act3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nama\t\t : ");
        String nama = input.nextLine();
        System.out.print("Masukan Kelas\t\t : ");
        String kelas = input.nextLine();
        System.out.print("Masukan NPM\t\t : ");
        String npm = input.nextLine();
        System.out.print("Masukan Jurusan\t\t : ");
        String jurusan = input.nextLine();
        System.out.print("Masukan Fakultas\t : ");
        String fakultas = input.nextLine();
        System.out.print("Masukan Nilai UTS\t : ");
        String uts = input.nextLine();
        System.out.print("Masukan Nilai UAS\t : ");
        String uas = input.nextLine();
        System.out.print("Masukan Nilai Akhir\t : ");
        String na = input.nextLine();
        System.out.println("========== Data Mashasiswa ==========");
        float nA = 90.0f;
        float uTs = 90.0f;
        float uAs = 90.0f;
        System.out.println("Nama\t\t : " + nama);
        System.out.println("NPM\t\t : " + npm);
        System.out.println("Kelas\t\t : " + kelas);
        System.out.println("Jurusan\t\t : " + jurusan);
        System.out.println("Fakultas\t : " + fakultas);
        System.out.println("UTS\t\t : " + uTs);
        System.out.println("UAS\t\t : " + uAs);
        System.out.println("Nilai Akhir\t : " + nA );

    }
}
