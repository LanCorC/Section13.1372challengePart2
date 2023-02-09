import static lance.series.Series.*;

public class Main {
        public static void main(String[] args) {
        for (int i = 0; i <= 10; i ++) {
            System.out.print(nSum(i) + " ");
        }
        System.out.println();

        for (int i = 0; i <= 10; i ++) {
            System.out.print(factorial(i)+ " ");
        }
        System.out.println();

        for (int i = 0; i <= 10; i ++) {
            System.out.print(fibonacci(i)+ " ");
        }
    }
}
