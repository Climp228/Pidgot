package com.pidgot;


import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.println("Вкажіть завдання: ");
        int num1 = menu.nextInt();
        switch (num1) {
            case 1:
                Task1();
                break;
            case 2:
                Task2();
                break;
            case 3:
                Task3();
                break;
            default:
                System.out.println("Вибачай такого завдання не існує :(");
        }
    }

    public static void Task1() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i + " ");
    }

    public static void Task2() {
        for (int i = 5; i > 0; i--)
            System.out.println(i + " ");
    }

    public static void Task3() {
        for (int i = 1; i <= 10; i++)
            System.out.println("3 * " + i + " = " + 3 * i);
    }
}
