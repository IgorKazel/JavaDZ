import java.util.Scanner;
public class Program {
    static void sum(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
    static void diff(int a, int b) {
        System.out.printf("%d - %d = %d", a, b, a - b);
    }
    static void prod(int a, int b) {
        System.out.printf("%d * %d = %d", a, b, a * b);
    }
    static void div(int a, int b) {
        System.out.printf("%d / %d = %.3f", a, b, (double)a / b);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        System.out.printf("Введите операцию (+, -, *, /): ");
        String operation = iScanner.next();
        switch (operation) {
            case "+":
                sum(a, b);
                break;
            case "-":
                diff(a, b);
                break;
            case "*":
                prod(a, b);
                break;
            case "/":
                div(a, b);
                break;
            default:
                System.out.println("Ошибка: неверная операция");
        }
        iScanner.close();
    }
}
