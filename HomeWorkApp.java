package com.company;

public class HomeWorkApp {
    public static void main(String[] args) {
	    printThreeWords();
        System.out.println();
        checkSumSign(2, -3);
        System.out.println();
        printColor(99);
        System.out.println();
        compareNumbers(10, 11);
        System.out.println();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}
