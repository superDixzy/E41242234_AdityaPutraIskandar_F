import java.util.Scanner;
    public class for_each {
        public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris segitiga: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
        
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
    }