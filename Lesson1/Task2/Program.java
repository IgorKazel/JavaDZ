public class Program {
    static void simpleNumbers() {
        int k = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = k + 1;
                }
            }
            if (k == 0) {
                System.out.printf("%d ", i);
            }
            else {
                k = 0;
            }
        }
    }    
    public static void main(String[] args) {
        System.out.println("Все простые числа от 1 до 1000:");
        simpleNumbers();
    }
}
