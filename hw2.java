package lesson7;

import java.util.Scanner;

public class hw2 {
    public static void main(String args[]) {

        // hw2();
        cheNechetSwitch();
    }
//        public static void hw2() {
//
//            int valueOne = -11;
//            int valueTwo = 11;
//            int c = Math.abs(a-10);
//            int d = Math.abs(b-10);
//            if (c < d) {
//                System.out.println("Число А ближе к числу 10");
//            } else if (c > d) {
//                System.out.println("Число В ближе к числу 10");
//            } else {
//                System.out.println("Числа А и В равноудалены от числа 10");
//            }
//        }

    public static void chetNechet() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int number = input.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " это четное число");
        else
            System.out.println(number + " это нечетное число");

    }



        public static void cheNechetSwitch() {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите число для проверки: ");
            int n = input.nextInt();
            switch (n % 2) {
                case 0:
                    System.out.println("Число четное");
                    break;
                default:
                    System.out.println("Число нечетное");
            }

        }

    }




