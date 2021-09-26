import java.util.Random;
import java.util.Scanner;

public class Section3 {

    public static void task1() {
        /*todo Я канешн сказал всё по методам, но надо же меру знать
            Добавив метод ты добавил 3 лишние строчки кода, которые нужны для его обёртки и вызова */
        printHello();
    }

    public static void task2() {
        int a = 1;
        for (int i = 0; i < 10; i++) {
            a = a * 2;//todo Это заменяется на a*=2;
            System.out.println(a);
        }
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println("Сумма всех цифр числа " + n + ": " + sum); //todo Вывод метода не работает корректно
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10;//todo эти две строчки надо бы подсократить
            reverse = reverse + n % 10;
            n = n / 10;
            System.out.println(n);//todo Проверяй вывод
        }
    }

    public static void task5() {
        //todo Метод не работает, что тут вообще написано?!
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int w = 0;

        while (n != 0) {
            w = w * 10 + n % 10;
            n /= 10;
        }
        System.out.println("" + w);
        System.out.println("Факториал этого числа:  " + getFactorial(n));
    }

    public static void task6() {
        Random ran = new Random();
        Random ran1 = new Random();
        for (int i = 0; i < 10; i++) {
            int buf = ran.nextInt(100) + 1;
            if (buf < 10) {
                System.out.println(ran1.nextInt(20) + 1);
            } else if (buf < 25) {
                System.out.println(ran1.nextInt(35) + 81);
            } else {
                System.out.println(ran1.nextInt(60) + 21);
            }
        }
    }

    private static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    private static void printHello() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Hello world");
        }
    }
}











