import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: a ");
        int a =sc.nextInt();
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
}


