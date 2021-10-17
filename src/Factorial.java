import java.util.Scanner;

public class Factorial {
    public static long factFor(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static long factRec(int n){
        long result = 1;
        if(n==1){return result;}
        else{
            result = factRec(n-1) * n;
            return result;
        }

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число, факториал которого вы хотите рассчитать:");
        int n = input.nextInt();
        if(n>0){
            long start1 = System.nanoTime();
            long a = factFor(n);
            long finish1 = System.nanoTime();
            long elapsed1 = finish1-start1;
            long start2 = System.nanoTime();
            long b = factRec(n);
            long finish2 = System.nanoTime();
            long elapsed2 = finish2-start2;
            System.out.println("Факториал числа "+ n + " = ");
            System.out.println(a);
            System.out.println(b);
            System.out.println("Время выполнения вычислений с помощью цикла = " + elapsed1 + "ms");
            System.out.println("Время выполнения вычислений с помощью рекурсии = " + elapsed2 + "ms");


        }
        else{
            System.out.println("Ошибка, введите число > 0");
        }
    }
}
