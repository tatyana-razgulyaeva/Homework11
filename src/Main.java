import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        int year = 2013;
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }


        int os = 0;
        int releaseYear = 2020;
        printVersion(os, releaseYear);

        int distance = 101;
        int deliveryDays = calculateDeliveryDays(distance);
        if (deliveryDays >= 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }
    static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    static void printVersion(int os, int releaseYear) {
        int currentYear = 2015;
        if (os == 0) {
            if (releaseYear > currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (os == 1) {
            if (releaseYear > currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Данная версия OS не поддерживается");
        }
    }
    static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;

        }
    }
}