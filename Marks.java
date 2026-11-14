
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int a = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int b = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int c = sc.nextInt();

        int total = a + b + c;
        double average = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}
