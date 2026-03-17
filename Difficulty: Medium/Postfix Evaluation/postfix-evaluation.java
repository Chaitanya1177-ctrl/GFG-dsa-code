import java.util.*;
import java.io.*;

class Solution {

    public int evaluatePostfix(String[] arr) { // ✅ fixed name
        Stack<Integer> ss = new Stack<>();

        for(String ff : arr){
            if(cc(ff)){
                int b = ss.pop();
                int a = ss.pop();
                int re = rr(a, b, ff);
                ss.push(re);
            } else {
                ss.push(Integer.parseInt(ff));
            }
        }

        return ss.pop();
    }

    // operator check (your style)
    static boolean cc(String s){
        return s.equals("+") || s.equals("-") ||
               s.equals("*") || s.equals("/") ||
               s.equals("^");   // ✅ added
    }

    // operation function (your rr style)
    static int rr(int a, int b, String op){
        switch(op){

            case "+": return a + b;

            case "-": return a - b;

            case "*": return a * b;

            case "/":
                // ✅ floor division fix
                int div = a / b;
                if((a ^ b) < 0 && a % b != 0){
                    div--;   // adjust for negative
                }
                return div;

            case "^":
                return (int)Math.pow(a, b); // power
        }
        return 0;
    }
}