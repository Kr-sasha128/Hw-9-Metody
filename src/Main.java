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
        } else if (year < 1584) {
            System.out.println("В " + year + " году посчёты не велись");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //    Задача 2 МЕТОД
    public static int Calculate_OS(int yearOfDevice, char oS) {
        yearOfDevice = yearOfDevice;
        oS = oS;
        if (oS == 0 && yearOfDevice < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (oS == 1 && yearOfDevice < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (oS == 0 && yearOfDevice >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (oS == 1 && yearOfDevice >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        return yearOfDevice;
    }
//    Задача 3 МЕТОД
public static int CalculateDelivery(int deliveryDistance) {
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

//    }


    //    public static void printissues(int issuesCount) {
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
        calculateLeapYear (2020);
        calculateLeapYear (2023);
        calculateLeapYear (2024);

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


//        Задача 2
        int clientDeviceYear = LocalDate.now().getYear();
        char clientOS = 1;
        Calculate_OS(clientDeviceYear, clientOS);

//            Задача 3
        int deliveryDistance = 37;
        CalculateDelivery(deliveryDistance);

    }
}
