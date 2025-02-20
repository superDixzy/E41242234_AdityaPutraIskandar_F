import java.util.Scanner;
import java.util.Random;
public class Acara11_12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Masukkan banyaknya jumlah elemen dalam array: ");
        int jumlahElemen = scanner.nextInt();

        int[] angkaAcak = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            angkaAcak[i] = random.nextInt(100) + 1;}

        System.out.println("Array hasil acakan:");
        for (int angka : angkaAcak) {
            System.out.print(angka + " ");}
        
        scanner.close();
    }
}