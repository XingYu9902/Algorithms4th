package chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class Example_06 {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "cdeab";
        StdOut.println(method1(s,t));
        StdOut.println(method2(s,t));
    }

    private static boolean method2(String s, String t) {
        return s.length()==t.length() && (t+t).indexOf(s)>=0;
    }

    private static boolean method1(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 1;i<s.length();i++){
            String left = s.substring(0,i);
            String right = s.substring(i,s.length());
            if ((right+left).equals(t)){
                return true;
            }
        }
        return false;
    }

}
