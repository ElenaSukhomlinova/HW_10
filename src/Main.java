import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        checkIsLeapYear(2020);
        checkIsLeapYear(2019);
        System.out.println();

        System.out.println("Задача 2");

        checkIsAppVersion(0, 2013);
        checkIsAppVersion(1, 2021);
        checkIsAppVersion(1, 2024);
        System.out.println();

        System.out.println("Задача 3");

        System.out.println(calculateDeliveryDays(50));
        System.out.println(calculateDeliveryDays(15));

    }

    public static void checkIsLeapYear (int year) {

        if (year > 1584 && year %400 == 0) {
            System.out.println(year + " является високосным");
        } else if (year > 1584 && year %100 == 0) {
            System.out.println(year + " не является високосным");
        } else if (year > 1584 && year %4 == 0) {
            System.out.println(year + " является високосным");
        }else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void checkIsAppVersion (int clientOs, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientOs == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs != 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDays (int deliveryDistance) {
        int deliveryDays;

        if  (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
            deliveryDays = 2;
        } else {
            deliveryDays = 3;
        }
        return deliveryDays;
    }



}