import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Balok {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        double p, l, t, luasBalok, volBalok, keliling, luas;

        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan Nama\t\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas\t\t: ");
        kelas = sc.nextLine();
        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan panjang persegi panjang\t: ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar persegi panjang\t\t: ");
        l = sc.nextInt();
        System.out.print("Masukkan tinggi balok\t\t\t: ");
        t = sc.nextInt();

        keliling = 2 * (p + l);
        luas = p * l;
        luasBalok = 2 * (p * l + l * t + p * t);
        volBalok = p * l * t;

        System.out.println("");
        System.out.println("=================================================");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("NIM\t\t\t: " + nim);
        System.out.println("Kelas\t\t\t: " + kelas);
        System.out.println("=================================================");
        System.out.println(String.format("Keliling persegi panjang adalah %.2f", keliling));
        System.out.println(String.format("Luas persegi panjang adalah %.2f", luas));
        System.out.println(String.format("Luas permukaan balok adalah %.2f", luasBalok));
        System.out.println(String.format("volume balok adalah %.2f", volBalok));
        System.out.println("=================================================");
    }
}