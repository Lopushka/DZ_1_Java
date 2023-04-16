package EX_4;

import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первыю цифру числа: ");
        int x = iScanner.nextInt();
        System.out.print("Введите вторую числа числа: ");
        int y = iScanner.nextInt();
        System.out.print("Введите результат: ");
        int res = iScanner.nextInt();
        int res_1 = 0, i = 0, j = 0;
        System.out.println("Вид уравнения: " + x + "?" + " + " + "?" + y + " = " + res);
        iScanner.close();
        for (i = x * 10; i < 100; i++) {
            for (j = y + 10; j < 100; j += 10) {
                res_1 = i + j;
                if (res_1 == res) {
                    System.out.print("ответ: " + i + " + " + j + " = " + res);
                    System.exit(0);;
                }

            }
        }
        if (res_1 != res) {
        System.out.println("Решений нет!");
        }
    }

}
