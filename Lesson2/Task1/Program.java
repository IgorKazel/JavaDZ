public class Program {
    static void formatString(String str) {
        String strResult = str.replaceAll(" +", " ").trim();
        StringBuilder sb = new StringBuilder(strResult);
        for (int i = sb.length() - 1; i >= 1; i--){
            if (strResult.charAt(i) >= 'А' && strResult.charAt(i) <= 'Я'){
                if (strResult.charAt(i - 1) == ' ') {
                    sb.insert(i - 1, '.');
                } else {
                    sb.insert(i, ". ");
                }
            }
        }
        sb.append('.');
        strResult = sb.toString();
        System.out.println("\nПреобразованная строка:");
        System.out.println(strResult);
    }    
    public static void main(String[] args) {
        String str = "   Добрый  деньКак   дела   Все     хорошо   ";
        System.out.println("Входная строка:");
        System.out.println(str);
        formatString(str);
    }
}
