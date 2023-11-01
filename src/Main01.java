import java.util.Scanner;

public class Main01 {
    public static int askNumber(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int number;


        do {
            System.out.println(message);
            number = scanner.nextInt();
        } while (number < min || number > max);
        return number;
    }


    public static void main(String[] args) {
        int pin;
        do {
            pin = askNumber("Enter pin:", 1000,9999);
            if (pin != 8956) {
                System.out.println(" Incorrect pin");
            } else {
                break;
            }

        } while (true);
    }



}
