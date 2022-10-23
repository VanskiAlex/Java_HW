package lesson7;

import java.util.Scanner;

public class hw22 {

    public static void main(String[] args) {

        clock();
    }

    public static void clock() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите время");
        int timeToSleep = 22;
        int time = input.nextInt();

        if (time < (timeToSleep - 16)) {
            System.out.println("Сейчас самое время спать");
        } else if (time >= (timeToSleep - 16) && time < (timeToSleep - 10)) {
            System.out.println("Не переживайте, до сна больше 10 часов");
        } else if ((timeToSleep - 3) > time && time > (timeToSleep - 7)) {
            System.out.println("До сна осталось меньше 7 часов");
        } else if ((timeToSleep - 10) > time && time < (timeToSleep - 7)) {
            System.out.println("Время до сна = " + (timeToSleep - time));
        }

        else if (time == (timeToSleep - 3)) {
            System.out.println("До сна 3 часа, если вы голодные, то надо успеть перекусить");
        } else if (time == (timeToSleep - 2)) {
            System.out.println("До сна 2 часа, завершайте выполнение текущей работы");
        } else if (time == (timeToSleep - 1)) {
            System.out.println("До сна 1 час, посмотрите перед сном что-то интересное, или почитайте");
        } else if (time >= (timeToSleep - 1)) {
            System.out.println("Время ложиться спать. Конец дня!");
        } else {
            System.out.println("Время до сна = " + time);
        }
    }
}
