import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //task3();
        int a = 1;
        for(int i= 0; i<10;i++){
            a=a*2;
            System.out.println(a);

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int sum=0;
//        while (n!=0){
//            sum +=(n % 10);
//            n/=10;
//        }
//        System.out.println(""+sum);

        int w=0;
        while (n!=0){
            w =w*10+n%10;
            n/=10;
        }
        System.out.println(""+w);
        System.out.println("Факториал этого часла:  "+getFactorial(n));



//        Random ran = new Random();
//        Random ran1 = new Random();
//        for(int i =0;i<10;i++) {
//            int buf = ran.nextInt(100)+1;
//            if (buf <10){
//                System.out.println(ran1.nextInt(20)+1);
//            }else if (buf<25){
//                System.out.println(ran1.nextInt(35)+81);
//            }
//            else {
//                System.out.println(ran1.nextInt(60)+21);
//            }
//        }

        }
    public static void task3(){
        for(int i = 0;i<7;i++){
            System.out.println("Hello world");
        }
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
