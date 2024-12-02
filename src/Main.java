import java.time.LocalDate;
import java.util.Random;
import java.util.random.RandomGenerator;

import static java.lang.Math.random;

public class Main {
    //    Задача 1 МЕТОД

    public static void calculateLeapYear(int year) {
        year = year;

        if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0 && year >= 1584) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //    Задача 2 МЕТОД
    public static void checkOS(int mobailOS, int mobailYear) {
        String mobailOsName;
        switch (mobailOS) {
            case 0:
                mobailOsName = "ios";
                break;
            case 1:
                mobailOsName = "Android";
                break;
            default:
                mobailOsName = "Неизвестная ОС";
        }
        int currentYear = LocalDate.now().getYear();
        if (currentYear != mobailYear) {
            System.out.println("Для ОС " + mobailOsName + " установите облегчёнуую версию");
        } else {
            System.out.println("Для ОС " + mobailOsName + " установите обычную версию");
        }
    }

    //    Задача 3 МЕТОД
    public static int calculateDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней 3");
        } else {
            System.out.println("Доставки нет");
        }
        return deliveryDistance;
    }
//     public static void printissues(int issuesCount) {
//        System.out.println(issuesCount);
//    }
//
//
//    public static int sum(int[] nambers) {
//        int sam = 0;
//        for (int i = 0; i < nambers.length; i++) {
//            sam = sam +  nambers [i];
//        }
//        return sam;
//
//    }
//
//
//    public static void printSeparator() {
//        System.out.println("+++++++++++++++++++");
//        System.out.println("--------------------");
//
//
//    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        calculateLeapYear(2020);
        calculateLeapYear(2023);
        calculateLeapYear(2024);

        System.out.println("Задача 2");
        checkOS(1, 2020);
        checkOS(0, 2024);
        checkOS(1, 2024);
        checkOS(0, 2020);

        System.out.println("Задача 3");
        calculateDelivery(15);
        calculateDelivery(25);
        calculateDelivery(70);
        calculateDelivery(105);

//        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
//        printSeparator();
//        for (int i = 0; i < issuesByMonths.length; i++) {
//            printissues(issuesByMonths[i]);
//            if ((i + 1) % 3 == 0) {
//                printSeparator();
//            }
//        }
//        printSeparator();
//        int tonal = sum(issuesByMonths);
//        printissues(tonal);

    }
}
