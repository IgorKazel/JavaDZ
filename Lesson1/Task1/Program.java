import java.util.Scanner;
public class Program {
    static int triangleN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
    static int factorialN(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        int resultTr = triangleN(n);
        System.out.printf("n-ое треугольное число: %d \n", resultTr);
        int resultF = factorialN(n);
        System.out.printf("Факториал n: %d \n", resultF);
        iScanner.close();
    }
}
