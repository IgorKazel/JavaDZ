import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Map<String, HashSet<String>> phoneBook = new HashMap<>();
        menu(phoneBook);
    }
    static void menu(Map<String, HashSet<String>> phoneBook){
        while (true) {
            System.out.println("\nВведите номер действия:\n1 - Добавить телефон\n2 - Удалить телефон\n3 - Найти номер(а) контакта\n4 - Выход\n");
            System.out.print("> ");
            Scanner scn = new Scanner(System.in);
            String numberAction = scn.next();
            switch (numberAction) {
                case "1" -> addNumber(phoneBook);
                case "2" -> deleteNumber(phoneBook);
                case "3" -> searchNumbers(phoneBook);
                case "4" -> {
                    scn.close();
                    System.out.println("\nСпасибо за использование телефонной книги, до встречи)");
                    System.exit(0);
                }
                default -> System.out.println("\nНеверный ввод");
            }
        }
    }
    static void addNumber(Map<String, HashSet<String>> phoneBook){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите имя контакта:");
        String name = scn.next();
        System.out.println("Введите номер контакта:");
        String number = scn.next();
        HashSet<String> numbers;
        if (phoneBook.containsKey(name)) {
            numbers = phoneBook.get(name);
        } else{
            numbers = new HashSet<>();
        }
        numbers.add(number);
        phoneBook.put(name, numbers);
    }
    static void deleteNumber(Map<String, HashSet<String>> phoneBook){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите имя контакта:");
        String name = scn.next();
        if (phoneBook.containsKey(name)){
            System.out.println("Введите номер контакта:");
            String number = scn.next();
            HashSet<String> numbers = phoneBook.get(name);
            if (numbers.contains(number)){
                numbers.remove(number);
                phoneBook.put(name, numbers);
            } else {
                System.out.println("У контакта нет такого номера");
            }
        } else {
            System.out.println("Нет такого контакта");
        }
    }
    static void searchNumbers(Map<String, HashSet<String>> phoneBook){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите имя контакта:");
        String name = scn.next();
        System.out.println("Номер(а) контакта:");
        System.out.println(phoneBook.get(name));
    }
}