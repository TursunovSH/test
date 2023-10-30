import java.util.Scanner;

public class Main02_17 {


    public static boolean checkParity(double number) {
        return number % 2 == 0;

    }
    public static String checkSing(double number) {
        if (number == 0) {
            return "Zero";

        } else if (number < 0) {
            return "Negative";

        } else {

            return "Positive";
        }
    }

    public static String checkWhole(double number) {
        if (number % 1 == 0) {
            if (number > 0) {

                return "Natural";
            }
            return " Whole";
        } else {
            return "Rational";
        }
    }

    public static boolean  checkPrime(double number) {

        if (!checkWhole(number).equals("Natural")) {
            return false;
        }
        for (int i = 2; i < (number + 1) /2; i++) {
        if (number % i == 0) {
            return false;
        }
        }
       return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.println(checkParity(number) ? " Even" : "Odd");
        System.out.println(checkSing(number));
        System.out.println(checkPrime(number) ?"Preim" : "Composite");



    }
}