import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Program {
    static void removeEven(List<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            if (iter.next() % 2 == 0){
                iter.remove();
            }
        }
        System.out.println("Список без четных чисел:");
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++){
            list.add(rnd.nextInt(1,20));
        }
        System.out.println("Заданный список:");
        System.out.println(list);
        removeEven(list);
    }
}
