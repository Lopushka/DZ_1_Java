package EX_2;

/**
 * EX_2
 */
public class EX_2 {

    public static void main(String[] args) {
        int i, j;
        boolean check;
        System.out.print("Простые числа: ");
        for (i = 2; i < 1000; i++) {
            check = true;

            for (j = 2; j <= i / j; j++) {

                if ((i % j) == 0)
                    check = false;
            }

            if (check)
                System.out.print( i + " ");
        }
    }
}