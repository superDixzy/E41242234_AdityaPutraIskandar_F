import java.util.Scanner;

public class ManagingPeople {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first person
        System.out.print("Enter the name of the first person: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter the age of the first person: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()

        // Input for second person
        System.out.print("Enter the name of the second person: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the age of the second person: ");
        int age2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()

        // Create Person_2A objects
        Person p1 = new Person(name1, age1);
        Person p2 = new Person(name2, age2);

        // Compare ages and print the result
        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }

        scanner.close(); // Close the scanner
    }
}