import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            if(runCheck(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean runCheck(String s) {
        Stack<String> openBrackets = new Stack();
        for (int i = 0; i < s.length(); ++i) {
            String c = s.substring(i, i+1);
            if (c.equals("[") || c.equals("{") || c.equals("(")) {
                openBrackets.push(c);
            } else {
                if (openBrackets.empty()) {
                    return false; //Only close braces left over
                } else if (!isMatch(openBrackets.pop(), c)) {
                    return false; //Non-matching pairs
                }
            }
        }
        if (!openBrackets.empty()) {
            return false; //Only open braces left over
        } else {
            return true;
        }
    }
    
    public static boolean isMatch(String b1, String b2) {
        if ((b1.equals("[") && b2.equals("]")) ||
            (b1.equals("{") && b2.equals("}")) ||
            (b1.equals("(") && b2.equals(")")))
            return true;
        return false;
    }
}
