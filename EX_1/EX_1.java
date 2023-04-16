package EX_1;

import java.util.Scanner;

/**
 * EX_1
 */
public class EX_1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = iScanner.nextInt();
        int t = (x*(x+1))/2;
        System.out.print("Произведение " + t);
        iScanner.close();
    }
}