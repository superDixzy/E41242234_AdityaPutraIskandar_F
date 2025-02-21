import java.util.Scanner;
public class Acara9_10_1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        // Input batas angka dan angka awal
        System.out.print("Masukkan angka awal: ");
        int awal = scan.nextInt();
        
        System.out.print("Masukkan batas angka: ");
        int p = scan.nextInt();
        
        System.out.print("Bilangan genap: ");
        
        // Mulai loop dari angka awal
        for (int i = awal; i <= p; i++) {
            if (i % 2 == 0) {  // Cek apakah angka genap
                System.out.print(i + " ");
            }
        }
    }           
}