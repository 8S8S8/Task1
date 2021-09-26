import java.util.Random;
import java.util.Scanner;

public class Section1 {

    public static void task1() {
        int a = 4;
        int b = 5;
        /*todo
            Методы для арифметических операций тут лишние
            Короче написать =a-b а не composition(a, b)
            Вывод на русском тебе тоже никто писать не запрещал)) Переписывать на русском канешн не надо
            Но убрать методы для операций стоит
         */
        System.out.println("Sum:" + sum(a, b));
        System.out.println("*:" + composition(a, b));
        System.out.println("-:" + dif(a, b));
        System.out.println("/" + div(a, b));

        //Не понял зачем эти 4 строки, в задании такого нету
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a1 = scanner.nextInt();
        System.out.println("Вывожу число  " + a1);
    }

    public static void task2() {
        String str = "Сальников Владимир Николаевич";
    }

    public static void task3() {
        /*todo
           Лишние махинации.
           Почему просто не объявить String name = "Владимир" ?
           Было бы норм если б ты брал переменную из прошлого метода и делил её на части
           Но тут ты объявляешь заново, так что не стоит усложнять себе жизнь
           Вот
           К тому же переменная тоже не обязательна
           Можно было просто вывести Имя + текст, но за переменную - плюсик
         */
        String str = "Сальников Владимир Николаевич";
        String name = "";
        String[] words = str.split(" ");
        name += words[1];
        System.out.println(name + "+ Какой-то текст");
    }

    public static void task4() {
        Random ran = new Random();
        int df = ran.nextInt(10);
        System.out.println("Рандомное число  " + df);
    }

    public static void task5() {
        /*todo
            Тут тоже суть в том чтобы числа рандомились каждый раз
         */
        int a = 4;
        int b = 9;
        System.out.println("Sum:" + sum(a, b));
        System.out.println("*:" + composition(a, b));
        System.out.println("-:" + dif(a, b));
        System.out.println("/" + div(a, b));
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        System.out.println("a");
    }

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str1 = scanner.nextLine();
        System.out.println("Введите  число: ");
        int a2 = scanner.nextInt();

        System.out.println("Число и " + a2 + " строка  " + str1);//todo Тебе не кажется что тут что то не так?)))
    }

    public static void task8() {
        /*todo
            Хуя ты блин умник))
            Су ть в том чтобы ты значения ПЕРЕМЕННЫХ поменял, а не вывод...
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1:  ");
        int a = sc.nextInt();
        System.out.println("Введите  число 2:  ");
        int b = sc.nextInt();
        System.out.println("Число 1" + b + "Число 2 " + a);
    }

    //Приватные методы которые я указывал в примере опциональны
    //Сам понимаешь что с ними надо сделать
    private static int sum(int value1, int value2) {
        return value1 + value2;
    }

    private static int composition(int value1, int value2) {
        return value1 * value2;
    }

    private static int dif(int value1, int value2) {
        return value1 - value2;
    }

    private static int div(int value1, int value2) {
        return value1 / value2;
    }
}

