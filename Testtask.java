import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.*;
import java.util.Scanner;

public class Testtask {
    public static void main(String[] argv){

    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println("Четные числа в массиве");
    for(int i = 0; i<numbers.length;i++){
        if (numbers[i]% 2 == 0){
            System.out.println(numbers[i]);
        }

    }
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 2 строки");
        String c = in.nextLine();
        String d = in.nextLine();
        if(c.equals(d)){
            System.out.println("Строки идентичны");
        }
        else {
            System.out.println("Строки неидентичны");
        }

        System.out.println("Введите 2 целых числа");
        int a = in.nextInt();
        int b = in.nextInt();
        if(a > b) {
            System.out.println("a > b");
        }
        else if(a < b){
            System.out.println("a < b");
        }
        else{
            System.out.println("a = b");
        }
        System.out.println("Сложение");
        System.out.println("a+b = " + (a+b));
        System.out.println("Вычитание");
        System.out.println("a-b = " + (a-b));
        System.out.println("Умножение");
        System.out.println("a*b = " + a*b);
        System.out.println("Деление");
        try {
            System.out.println("a/b = " + a/b);
        }
        catch (ArithmeticException e) {
            System.out.println(
                    "Divided by zero operation cannot possible");
        }
    }
}

