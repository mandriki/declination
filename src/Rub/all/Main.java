package Rub.all;
import java.lang.invoke.SwitchPoint;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа склонение \"Рубль\"");
        System.out.print("Введите целое число и нажмите enter: ");
        int i = sc.nextInt();
        switch(i % 100) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println(i + " Рублей");
                break;
            default:
        switch (i % 10) {
            case 0:
                System.out.println(i + " Рублей");
                break;
            case 1:
                System.out.println(i + " Рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(i + " Рубля");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(i + " Рублей");
             }
        }

    }
}
