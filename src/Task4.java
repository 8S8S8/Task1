import javax.print.attribute.standard.Finishings;
import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
//        int[] mas = new int[10];
//        for (int i = 0; i < mas.length; i++) {
//            Random rm = new Random();
//            int n = rm.nextInt(10);
//            mas[i] = n;
//            System.out.println(mas[i]);
//        }
//        System.out.println("В обратном порядке: ");
//        for (int i = mas.length - 1; i >= 0; i--) {
//            System.out.println(mas[i] + " ");
//        }
//        int sum = 0;
//        for (int i = 0; i < mas.length; i++) {
//            sum += mas[i];
//        }
//        System.out.println("Сумма:  " + sum);
///4
//        int [] mas1=new int[4];
//        for(int i =0;i<4;i++){
//            Scanner sr = new Scanner(System.in);
//            System.out.println("Ввидите число: ");
//            int a = sr.nextInt();
//
//            mas1[i] = a;
//        }
//        for (int i = 0; i < mas1.length; i++) {
//            System.out.println(mas1[i]);
//        }
////////5
//        int max = mas[0];
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] > max) {
//                max = mas[i];
//
//            }
//
//        }
//        System.out.println("Максимум " + max);
///////////6
//        int min = mas[0];
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] < min) {
//                min = mas[i];
//
//            }
//
//        }
//        System.out.println("Минимум " + min);

//
//        int[] sort = Sorter(mas);
//        String intmas = Arrays.toString(sort);
//
//        System.out.println("Возрастание : " + intmas);
//
//
//        int[] sort2 = Sorter2(mas);
//        String intmas2 = Arrays.toString(sort2);
//
//        System.out.println("Убывание : " + intmas2);
//
//        int[] ab = new int[100];
//        for (int i = 0; i < ab.length; i++) {
//            ab[i] = i + 1;
//
//        }
//                System.out.println(Arrays.toString(ab));



//        int [][] ab1 = new int[10][10];
//        int k = 0;
//        for(int i =0; i<ab1.length;i++){
//            for (int j=0;j<ab1.length;j++){
//                ab1[i][j] = ab[k];
//                k++;
//            }
//        }
//        System.out.println(Arrays.toString(ab1));
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (i % 2 == 1) {
//                    ab1[i][j] = (i - 1) * 10 + j;
//                } else {
//                    ab1[i][ j]=i * 10 - j + 1;
//
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(ab));


int [][] masiv = new int[10][10];
for (int i = 0;i<10;i++){
    System.out.println();
    for (int j = 0; j < 10; j++) {
        Random rm = new Random();
        int a = rm.nextInt(10);
        masiv[i][j] =a;
        System.out.print(masiv[i][j]+"  ");

    }
}
for (int i =0; i<masiv.length;i++){
    for (int j =1; j<masiv.length;j++){

            int sumPrevColumn = 0; // сумма предыдущего столбца
            for (int i1 = 0; i1 < 10; i1++) {
                sumPrevColumn +=masiv[i1][ j - 1];
            }

            int sumCurrentColumn = 0;       // сумма текущего столбца
            for (int i1 = 0; i1 < 10; i1++) {
                sumCurrentColumn += masiv[i1][ j];
            }

            if (sumPrevColumn > sumCurrentColumn) //если сумма предыдущего столбца больше чем текущего, то меняем местами столбцы
            {
                for (int k = 0; k < 10; k++) {
                    int temp = masiv[k][j];
                    masiv[k][ j] =masiv[k][j - 1];
                    masiv[k][j - 1] =temp;
                }
            }


        }
    }
        for (int i = 0; i < 10; i++)
        {
            System.out.println();
            for (int j = 0; j < 10; j++)
            {
                System.out.print(masiv[i][ j]+ " ");
            }

        }
}









        public static void toSwap ( int first, int second, int[] mas){
            int dummy = mas[first];
            mas[first] = mas[second];
            mas[second] = dummy;
        }
        public static int[] Sorter ( int[] mas){

            for (int out = mas.length - 1; out >= 1; out--) {
                for (int in = 0; in < out; in++) {
                    if (mas[in] > mas[in + 1])
                        toSwap(in, in + 1, mas);
                }
            }
            return mas;
        }
        public static int[] Sorter2 ( int[] mas){

            for (int out = mas.length - 1; out >= 1; out--) {
                for (int in = 0; in < out; in++) {
                    if (mas[in] < mas[in + 1])
                        toSwap(in, in + 1, mas);
                }
            }
            return mas;
        }


}
