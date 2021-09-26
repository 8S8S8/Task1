import java.util.Scanner;

public class Section2 {

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: a ");
        int a = sc.nextInt();
        System.out.println("Введите число: b ");
        int b = sc.nextInt();

        System.out.println("" + comparison(a, b));//Смотри тудушку в этом методе
    }

    public static void task2() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число:");
        int a2 = sc1.nextInt();
        categories(a2);
    }

    public static void task3() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите число: 1 ");
        int a = sc2.nextInt();
        System.out.println("Введите число: 2 ");
        int b = sc2.nextInt();
        System.out.println("Введите число: 3 ");
        int c = sc2.nextInt();

        int sum = a + b + c;
        int medium = sum / 3;//todo Ебац Вован, не средние арифметическое, а среднее из трёх введённых
        System.out.println("Среднее " + medium);
        max(a, b, c);
        min(a, b, c);
    }

    public static void task4() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc1.nextInt();
        chetnost(a);
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: a ");
        int a = sc.nextInt();
        String player;

        switch (a) {
            case 1:
                player = "Иванов";
                break;
            case 2:
                player = "Пупкин";
                break;
            case 3:
                player = "Домав";
                break;
            case 4:
                player = "Стулов";
                break;
            case 5:
                player = "Петров";
                break;
            case 6:
                player = "Иванов1";
                break;
            case 7:
                player = "Пупкин2";
                break;
            case 8:
                player = "Дом2ав";
                break;
            case 9:
                player = "Сту2лов";
                break;
            case 10:
                player = "Петр1ов";
                break;
            case 11:
                player = "Пе3тров";
                break;
            default:
                player = "Ошибка";
                break;
        }
        System.out.println("The player is " + player);
    }


    private static int comparison(int a, int b) {
        /*todo
            Получается всё как то не так
            Внутри метода делаешь вывод ещё и число возвращаешь.
            Потом это всё в sout выводишь
            Ты либо всё делаешь в методе.
            Либо возвращаешь наибольшее наверх, а потом делаешь вывод с его использованием.
            Определись с логикой
         */
        if (a > b) {
            System.out.println("a>b");
            return b;
        } else
            System.out.println("a<b");
        return b;
    }

    private static void categories(int a) {
        //todo Переделывать не обязательно, но просто чтобы ты знал
        //В целом пиздато. Но есть микронюанс
        //Метод с такой логикой было бы лучше назвать getCategory или что то в этом духе
        if (a < 5) {
            System.out.println("Товар первой категории");
        } else if (a < 10) {
            System.out.println("Товар второй категории");
        } else if (a < 100) {
            System.out.println("Tовар 3 категории");
        }
    }

    public static void chetnost(int a) {
        if (a % 2 == 0) {
            System.out.println("Четное ");
        } else
            System.out.println("Не четное");
    }

    public static void max(int a3, int b3, int c3) {
        //todo Эти два метода канешн работают но логика не камельфо
        if (a3 > b3 && a3 > c3) {
            System.out.println("Первое число больше всех");
        } else if (b3 > c3) {
            System.out.println("Второе больше всех");
        } else
            System.out.println("Третье больше всех");
    }

    public static void min(int a3, int b3, int c3) {
        if (a3 < b3 && a3 < c3) {
            System.out.println("Первое число меньше всех");
        } else if (b3 < c3) {
            System.out.println("Второе меньше всех");
        } else
            System.out.println("Третье меньше всех");
    }
}


