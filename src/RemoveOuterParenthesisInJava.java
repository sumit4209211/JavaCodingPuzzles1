public class RemoveOuterParenthesisInJava {
    public static String removeOuterParentheses(String S) {
        int n = 0;
        char[] chars = S.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(char c : chars){
            switch(c){
                case '(':
                    if(n > 0) sb.append(c);
                    n++;
                    break;
                default:
                    n--;
                    if(n > 0) sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Ek Tha Tiger";
        String s = removeOuterParentheses(str);
        System.out.println("Final string is "+s);
    }
}
