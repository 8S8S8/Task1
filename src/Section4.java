import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Section4 {
    public static void task1() {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            Random rm = new Random();
            int n = rm.nextInt(10);
            mas[i] = n;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("В обратном порядке: ");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
    }

    public static void task2() {
        //todo Не работает, ищи проблему
        int[] mas = new int[10];
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        System.out.println();
        System.out.println("Сумма:  " + sum);
    }

    public static void task3() {
        /*todo
            Ну во первых у тебя опять нихуя не работает
            Во вторых, тут тебе нужно изменить массив именно внутри переменной а не только в выводе
            Есть несколько стратегий:
                Можно создать новый в него переписывать старый с конца, потом переприсвоить
                Можно менять местами крайние элементы и сдвигаться в центр, но надо ещё проверять количество элементов на чётность/нечетность
         */
        int[] mas = new int[10];
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println(mas[i]);
        }
    }

    public static void task4() {
        String[] mas1 = new String[10];
        for (int i = 0; i < 10; i++) {
            Scanner sr = new Scanner(System.in);
            System.out.println("Ввидите строку: ");
            String a = sr.nextLine();

            mas1[i] = a;
            /*todo Можно преобразовать к виду:
                maa1[i] = sr.nextLine();
             */
        }
        for (int i = 0; i < mas1.length; i++) {
            System.out.println(mas1[i]);
        }
    }

    public static void task5() {
        int[] mas = new int[10];
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {//todo Нулевой элемент ты считай уже проверил в предыдущей строке. Нет смысла с него начинать
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        //todo И да, нихуя не работает
        System.out.println("Максимум " + max);
    }

    public static void task6() {
        //todo Аналогичная ситуация
        int[] mas = new int[10];
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("Минимум " + min);
    }

    public static void task7() {
        int[] mas = new int[10];
        int[] sort = Sorter(mas);
        String intmas = Arrays.toString(sort);

        System.out.println("Возрастание : " + intmas);
    }

    public static void task8() {
        int[] mas = new int[10];
        int[] sort2 = Sorter2(mas);
        String intmas2 = Arrays.toString(sort2);

        System.out.println("Убывание : " + intmas2);
    }

    public static void task9() {
        //todo Перечитай задание
        int[] mas = new int[10];
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println(mas[i]);
        }
    }

    public static void task10() {
        int[][] masiv = new int[10][10];
        for (int i = 0; i < 10; i++) {
            System.out.println();//todo немного не в том месте стоит
            for (int j = 0; j < 10; j++) {
                Random rm = new Random();
                int a = rm.nextInt(10);
                masiv[i][j] = a;//todo Эти две строки можно сократить
                System.out.print(masiv[i][j] + "  ");

            }
        }
    }

    public static void task11() {
        //todo Ой, даже разбираться впадлу, во первых опять не заполнен
        //todo Во вторых
        int[][] masiv = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int sumPrevColumn = 0;//todo Это не сумма предыдущего а сумма текущего, когда исправлять будешь смотри за границы не вылези
                for (int i1 = 0; i1 < 10; i1++) {
                    sumPrevColumn += masiv[i1][j];
                }

                int sumCurrentColumn = 0;
                for (int i1 = 0; i1 < 10; i1++) {
                    sumCurrentColumn += masiv[i1][j];
                }

                if (sumPrevColumn > sumCurrentColumn) {
                    for (int k1 = 0; k1 < 10; k1++) {
                        int temp = masiv[k1][j];
                        masiv[k1][j] = masiv[k1][j - 1];
                        masiv[k1][j - 1] = temp;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Отсортировано: ");
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(masiv[i][j] + " ");
            }

        }

    }

    public static void task12() {
        //todo Пронумеруй как нить по другому методы с двумерными массивами 1_1 например, и доделай то что не доделал
    }

    public static void task13() {//это по твоей нумерации 12 таска
        xyi();//todo Это канешн круто что хуй в выводе. Но он должен храниться в матрице-_-
    }

    private static void toSwap(int first, int second, int[] mas) {
        int dummy = mas[first];
        mas[first] = mas[second];
        mas[second] = dummy;
    }

    private static int[] Sorter(int[] mas) {
        //todo Всегда используй в цикле i и j, иногда можно ещё и z

        //todo и ещё в каждом сортировщике есть косяк, он не отсортирует полностью массив, ищи ошибку
        for (int out = mas.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (mas[in] > mas[in + 1])
                    toSwap(in, in + 1, mas);
            }
        }
        return mas;
    }

    private static int[] Sorter2(int[] mas) {

        for (int out = mas.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (mas[in] < mas[in + 1])
                    toSwap(in, in + 1, mas);
            }
        }
        return mas;
    }

    private static void xyi() {
        System.out.println();
        System.out.println(". . . . . . . . . .");
        System.out.println(". . . . . . . . . .");
        System.out.println(". . . . . . . . . .");
        System.out.println(". . . . + + . . . .");
        System.out.println(". . . + . . + . . .");
        System.out.println(". . . + . . + . . .");
        System.out.println(". . . + . . + . . .");
        System.out.println(". . . + . . + . . .");
        System.out.println(". + + . . . . + + .");
        System.out.println("+ . . . . . . . . +");


    }
}
