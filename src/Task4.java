import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Первое задание
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

        //2
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        System.out.println();
        System.out.println("Сумма:  " + sum);

        //3

        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println(mas[i]);
        }
//4
        String[] mas1 = new String[10];
        for (int i = 0; i < 10; i++) {
            Scanner sr = new Scanner(System.in);
            System.out.println("Ввидите строку: ");
            String a = sr.nextLine();

            mas1[i] = a;
        }
        for (int i = 0; i < mas1.length; i++) {
            System.out.println(mas1[i]);
        }
//////5
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        System.out.println("Максимум " + max);
/////////6
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("Минимум " + min);

/////////7
        int[] sort = Sorter(mas);
        String intmas = Arrays.toString(sort);

        System.out.println("Возрастание : " + intmas);

/////////8
        int[] sort2 = Sorter2(mas);
        String intmas2 = Arrays.toString(sort2);

        System.out.println("Убывание : " + intmas2);

///////9


        int[][] ab1 = new int[10][10];
        int n = 1;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                for (int j = 9; j >= 0; j--) {

                        ab1[i][j] = n;
                        n++;

                }
            } else {
                for (int j = 0; j < 10; j++) {
                    ab1[i][j] = n;
                    n++;
                }
            }
        }


        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(ab1[i][j] + " ");
            }

        }


//двумерные 1)
        int[][] masiv = new int[10][10];
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                Random rm = new Random();
                int a = rm.nextInt(10);
                masiv[i][j] = a;
                System.out.print(masiv[i][j] + "  ");

            }
        }
        /////2
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int sumPrevColumn = 0;
                for (int i1 = 0; i1 < 10; i1++) {
                    sumPrevColumn += masiv[i1][j];
                }

                int sumCurrentColumn = 0;
                for (int i1 = 0; i1 < 10; i1++) {
                    sumCurrentColumn += masiv[i1][j];
                }

                if (sumPrevColumn > sumCurrentColumn)
                {
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
        xyi();
    }


    public static void toSwap(int first, int second, int[] mas) {
        int dummy = mas[first];
        mas[first] = mas[second];
        mas[second] = dummy;
    }

    public static int[] Sorter(int[] mas) {

        for (int out = mas.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (mas[in] > mas[in + 1])
                    toSwap(in, in + 1, mas);
            }
        }
        return mas;
    }

    public static int[] Sorter2(int[] mas) {

        for (int out = mas.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (mas[in] < mas[in + 1])
                    toSwap(in, in + 1, mas);
            }
        }
        return mas;
    }
    public static void xyi(){
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
