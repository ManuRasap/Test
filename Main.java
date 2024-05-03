import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Write a number: ");
        int num = scanner.nextInt();


        int doble = num * 2;

        System.out.println("Double of " + num + " is " + doble);
    }
}
