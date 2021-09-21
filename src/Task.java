import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String args[]) {
        int a = 4;
        int b = 5;
        System.out.println("Sum:"+ sum1(a,b));
        System.out.println("*:"+ composition(a,b));
        System.out.println("-:"+ dif(a,b));
        System.out.println("/"+ div(a,b));

        Scanner scanner = new Scanner(System.in);
       System.out.println("Введите целое число: ");
        int a1 = scanner.nextInt();
        System.out.println("Вывожу число  "+a1);


       String str = "Сальников Владимир Николаевич";
       String name = "";
        String[] words = str.split(" ");
        name += words[1];
        System.out.println(name + "+ Какой-то текст");

        Random ran = new Random();
        int df = ran.nextInt(10);
        System.out.println("Рандомное число  "+ df);

        System.out.println("Введите строку ");
        String str1 = scanner.nextLine();
        System.out.println("Введите  число: ");
        int a2 = scanner.nextInt();

        System.out.println("Число и "+ a2+" строка  "+str1);

    }
    public static int sum1(int value1, int value2) {
        return value1 + value2;
    }
    public static int composition(int value1, int value2) {
        return value1 * value2;
    }
    public static int dif(int value1, int value2) {
        return value1 - value2;
    }
        public static int div(int value1, int value2) {
            return value1 / value2;
        }
    }

