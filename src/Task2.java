import java.util.Scanner;

public class Task2 {
    private int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: a ");
        int a = sc.nextInt();
        System.out.println("Введите число: b ");
        int b = sc.nextInt();

        System.out.println("" + comparison(a, b));


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число:");
        int a2 = sc1.nextInt();
        q2(a2);

        Scanner sc2 = new Scanner(System.in);
       System.out.println("Введите число: 1 ");
        int a3 = sc2.nextInt();
       System.out.println("Введите число: 2 ");
       int b3 = sc2.nextInt();
        System.out.println("Введите число: 3 ");
        int c3 = sc2.nextInt();

        int sum = a3+b3+c3;
        int medium =sum/3;
        System.out.println("Среднее "+ medium);


        q3(a);
        q4(a3,a3,c3);
        q5(a3,a3,c3);





    }

    public static int comparison(int a, int b) {
        if (a > b) {
            System.out.println("a>b");
            return b;
        } else
            System.out.println("a<b");
        return b;
    }

    public static void q2(int a) {
        if (a < 5) {
            System.out.println("Товар первой категории");

        } else if (a < 10) {
            System.out.println("Товар второй категории");
        } else if (a < 100) {
            System.out.println("Tовар 3 категории");
        }
    }
    public static void q3(int a) {
        if (a %2 == 0){
            System.out.println("Четное ");
        }else
            System.out.println("Не четное");
    }
    public static void q4(int a3,int b3,int c3) {
        if (a3 > b3 && a3 > c3) {
            System.out.println("Первое число больше всех");
        } else if (b3 > c3) {
            System.out.println("Второе больше всех");
        } else
            System.out.println("Третье больше всех");
    }
    public static void q5(int a3,int b3,int c3) {
        if (a3 < b3 && a3 < c3) {
            System.out.println("Первое число меньше всех");
        } else if (b3 < c3) {
            System.out.println("Второе меньше всех");
        } else
            System.out.println("Третье меньше всех");
    }
}


