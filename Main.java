import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Write a number: ");
        int num = scanner.nextInt();


        int triple = num * 3;

        System.out.println("Triple of " + num + " is " + triple);
    }
}
