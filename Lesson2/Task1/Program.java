public class Program {
    static void formatString(String str) {
        String str2 = str.replaceAll(" +", " ").trim();
        StringBuilder sb = new StringBuilder(str2);
        for (int i = sb.length() - 1; i >= 1; i--){
            if (str2.charAt(i) >= 'А' && str2.charAt(i) <= 'Я'){
                sb.setCharAt(i-1,'.');
                sb.insert(i, ' ');
            }
        }
        sb.append('.');
        System.out.println("\nВыходная строка:");
        System.out.println(sb);
    }    
    public static void main(String[] args) {
        String str = "   Добрый  день     Как   дела   Все     хорошо   ";
        System.out.println("Входная строка:");
        System.out.println(str);
        formatString(str);
    }
}
