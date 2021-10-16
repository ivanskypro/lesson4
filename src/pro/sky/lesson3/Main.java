package pro.sky.lesson3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        int clientIos = 0;
        if (clientIos == 1) {
            System.out.println("Установите версию для iOS по ссылке");
        }
        if (clientIos < 1) {
            System.out.println("Установите версию для Android по ссылке");
        }

        System.out.println();

        System.out.println("Задание №2");
        int clientDeviceYear = 2015;
        boolean isIosModern = clientDeviceYear >= 2015;
        if (clientDeviceYear < 2015 && clientIos < 1) {
            System.out.println("Установите облегченную версию приложения Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientIos < 1) {
            System.out.println("Установите версию для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && clientIos == 1) {
            System.out.println("Установите облегченную версию для IOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientIos == 1) {
            System.out.println("Установите версию для IOS по ссылке");
        }
        System.out.println();

        System.out.println("Задание №3");
        int year = 2021;
        if ((year % 400 == 0 && year != 100) || (year % 4 == 0)) {
            System.out.println("Висосокосный год");
        } else {
            System.out.println("Невисокосный год");
        }
        System.out.println();

        System.out.println("Задание №4");
        int deliveryDistance = 95;
        int daysForDelivery = ((20 + deliveryDistance) / 40);
        int gap = daysForDelivery + 1;
        if (deliveryDistance <= 19) {
            System.out.println("Потребуется дней 1");
        } if (deliveryDistance >=20 && deliveryDistance <=59){
            System.out.println("Потребуется дней 2");
        } if (deliveryDistance >=60 && deliveryDistance<= 99){
            System.out.println("Потребуется дней 3");
        } if (deliveryDistance >=100){
            System.out.println("Потребуется дней " + gap);
        }
        System.out.println();

        System.out.println("задание 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зимний сезон");
                break;
            case 3, 4, 5 :
                System.out.println("Весенний сезон");
                break;
            case 6, 7, 8:
                System.out.println("Летний сезон");
                break;
            case 9, 10, 11:
                System.out.println ("Осенний сезон");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
