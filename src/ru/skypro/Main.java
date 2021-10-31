package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        // task3();
        // task4();
        //  task5();
        //  task6();
    }

    public static void task1() {

        isYearLeap(2020);

    }

    public static void isYearLeap(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("Год  является не високосным! ");
        } else {
            System.out.println("Год  является  високосным!");
        }

    }

    public static void task2() {

        int device = getDeviceClient("IOS");
        int year = getDeviceYear(2015);
        if (device == 0 && year == 0) {
            System.out.println("Установите версию приложения на IOS по ссылке :");
        } else if (device == 0 && year == 1) {
            System.out.println("Установите облегченную версию приложения на IOS по ссылке:");
        } else if (device != 0 && year == 0) {
            System.out.println("Установите версию приложения на Android по ссылке :");
        } else if (device != 0 && year == 1) {
            System.out.println("Установите облегченную версию приложения на Android по ссылке:");
        }


    }

    public static int getDeviceClient(String name) {

        if (name.equals("IOS")) {
            return 0;
        }
        return 1;


    }

    public static int getDeviceYear(int year) {
        if (year > 2015) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void task3() {

        int deliveryTime = getDeliveryTime(87);
        System.out.println("Срок доставки займет: " + deliveryTime + " дней");


    }

    public static int getDeliveryTime(int distance) {
        int deliveryTime = 1;
        if (distance <= 20) {

        } else if (distance > 20 && distance < 60) {
            deliveryTime = deliveryTime + 1;

        } else if (distance > 60 && distance < 90) {
            deliveryTime = deliveryTime + 2;
        }

        return deliveryTime;

    }

    public static void task4() {
        getMessageDouble("aabccddefgghiijjkk");

    }

    public static void getMessageDouble(String data) {
        char[] arraysChars = data.toCharArray();
        boolean isDouble = true;
        for (int i = 0; i < arraysChars.length - 1; i++) {


            if (arraysChars[i] == arraysChars[i + 1]) {
                isDouble = true;
                System.out.println(" в строке есть дубль, это символ  :" + arraysChars[i]);
                return;

            } else isDouble = false;


        }

        if (!isDouble) {
            System.out.println(" в строке нет дублей!");


        }


    }

    public static void task5() {
        int[] data = {3, 2, 1, 6, 5};
        getArraysReverse(data);

    }

    public static void getArraysReverse(int[] array) {
        int[] arrayRewerse = new int[array.length];
        int temp = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            arrayRewerse[i] = array[temp];
            temp--;

        }
        System.out.println(Arrays.toString(arrayRewerse));
    }

    public static void task6() {
        int[] expence = generateRandomArray();
        float result = getAvgExpence(expence);
        System.out.println(result);
    }

    public static float getAvgExpence(int[] expence) {
        int total = summExpence(expence);
        float avgExpence = (float) total / expence.length;
        return (float) avgExpence;


    }

    public static int summExpence(int[] expence) {
        int total = 0;
        for (int i = 0; i < expence.length; i++) {
            total = total + expence[i];


        }
        return total;
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}


