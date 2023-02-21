import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    static void maxMinAvg(List<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        double avg = 0;
        for (int item : list) {
            avg += item;
            if (item > max){
                max = item;
            }
            if (item < min){
                min = item;
            }
        }
        avg = avg / list.size();
        System.out.printf("\nМинимальное число: %d\nМаксимальное число: %d\nСреднее арифметическое: %.1f\n", min, max, avg);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++){
            list.add(rnd.nextInt(0,20));
        }
        System.out.println("Заданный список:");
        System.out.println(list);
        maxMinAvg(list);
    }
}
