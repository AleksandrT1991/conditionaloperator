package ru.skypro;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Задание 2
        int clientDiviceYear = 2015;
        int clientOs = 0;
        if (clientDiviceYear >= 2015 && clientOs >= 1) {
            System.out.println("Установите приложение для Android по сслыке");
        } else {
            System.out.println("становите облегченную версию приложения для Android по ссылке");
        }

        // Задание 3
        int year = 2022;
        if (year + 3 == 2024 || year - 1 == 2020) {
            System.out.println("Год явлеятся високосным");
        } else {
            System.out.println("Год не явлеятся високосным");
        }
        // Задание 4
        int deliveryDay = 1;
        int deliveryDistance = 101;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + deliveryDay + " день для доставки ");
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            System.out.println("Потребуется " + deliveryDay * 2 + " дня для доставки");
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            System.out.println("Потребуется " + deliveryDay * 3 + " дня для доставки");
        } else {
            System.out.println("Ты свою посылку не получишь ");
        }
        // Задание 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("На дворе зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("На дворе весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("На дворе лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("На дворе осень ");
                break;
            default:
                System.out.println("Такого времени года не существует ");
        }
    }
}