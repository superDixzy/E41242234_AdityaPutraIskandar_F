import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        int[] hargaBarang = new int[5];
        int totalHarga = 0;
        int minimumHadiah = 10000; 

        System.out.println("------------------------------------------------");
        System.out.println("         Kharisma Agung Plaza ( KAP )           ");
        System.out.println("           Promo Belanja Berhadiah           ");
        System.out.println("      Khusus Pembelian 5 Barang Pertama           ");
        System.out.println("        Dengan harga minimum Rp 10000,00         ");
        System.out.println("------------------------------------------------");

        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + " : ");
            hargaBarang[i] = scan.nextInt();
            totalHarga += hargaBarang[i];
        }

        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + totalHarga);

        if (totalHarga >= minimumHadiah) {
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }

        System.out.println("------------------------------------------------");
        System.out.println("              Terima Kasih                      ");
        System.out.println("    Anda sudah belanja di Kharisma Agung Plaza  ");
        System.out.println("------------------------------------------------");

        scan.close();
    }
}