package classwork;

import java.util.Locale;
import java.util.Scanner



public class Main02 {
            public static int getDaysAmount(String month) {
                switch (month) {
                    case "February":
                        return 28;
                    case "April":
                    case "June":
                    case "September":
                    case "November":
                        return 30;
                    case "October":
                    case "December":
                    case "January":
                    case "March":
                    case "May":
                    case "July":
                    case "August":
                        return 31;

            }
            return -1;


        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
    }

}
