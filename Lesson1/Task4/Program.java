public class Program {
    static void findNumbers(String userExpression) {
        char[] exprArray = userExpression.toCharArray();
        for (int i = 0; i < exprArray.length; i++) {
            if (exprArray[i] == '?') {
                for (int j = 0; j < 10; j++) {
                    exprArray[i] = (char)(j+'0');
                    String exprRes = String.valueOf(exprArray);
                    if (exprRes.contains("?")) {
                        findNumbers(exprRes);
                    } else {
                        String[] exprResSplit = exprRes.split(" ");
                        if (Integer.parseInt(exprResSplit[0]) + Integer.parseInt(exprResSplit[2]) == Integer.parseInt(exprResSplit[4])) {
                            System.out.printf("%s + %s = %s\n", exprResSplit[0], exprResSplit[2], exprResSplit[4]);
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        String userExpression = "2? + ?5 = 69";
        System.out.printf("%s\n\n", userExpression);
        findNumbers(userExpression);
    }
}