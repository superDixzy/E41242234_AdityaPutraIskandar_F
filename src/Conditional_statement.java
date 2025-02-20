import java.util.Scanner;
public class Conditional_statement {
}
public static void main(String[]args){
    int nilai;
    String grade;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Masukkan nilai: ");
    nilai = scan.nextInt();

    if(nilai >= 95){
    grade ="A";
}   else if(nilai >= 83){
    grade ="B+";
}   else if(nilai >= 77){
    grade ="B";
}   else if(nilai >= 63){
    grade ="C+";
}   else if(nilai > 53){
    grade ="C";
}   else if(nilai >= 43){
    grade ="D";
}   else if(nilai >= 33){
    grade ="E";
}   else{
    grade="F";
}
    System.out.println("Grade: " + grade);
    scan.close();
}