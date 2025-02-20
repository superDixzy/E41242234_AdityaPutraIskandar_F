import java.util.Scanner;
public class Lampu {
    
}
public static void main(String[]args){
    String lampu;
    Scanner scan = new Scanner(System.in);

    System.out.print("Inputkan nama warna: ");
    lampu=scan.nextLine();

    switch(lampu){
    case "oren":
    case "Oren":
    System.out.println("Lampu oren, berhenti");
    break;
    
    case "ungu":
    case "Ungu":
    System.out.println("lampu ungu, harap hati-hati");
    break;

    case "putih":
    case "Putih":
    System.out.println("lampu putih, silahkan jalan");
    break;

    default:
    System.out.println("Warna lampu salah");
}
}