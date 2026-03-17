class Solution {
    public int evaluatePrefix(String[] arr) {
 Stack<Integer> ss = new Stack<>();

        // ✅ Traverse RIGHT → LEFT
        for (int i =arr.length - 1; i >= 0; i--) {
            String ff = arr[i];

            if (cc(ff)) {
                int a = ss.pop();   // first operand
                int b = ss.pop();   // second operand

                int re = rr(a, b, ff);
                ss.push(re);
            } else {
                ss.push(Integer.parseInt(ff));
            }
        }
        return ss.pop();
    }

    private boolean cc(String s) {
        return s.equals("+") || s.equals("-") || 
               s.equals("*") || s.equals("/")
               ||
               s.equals("^");
    }

    int rr(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return (int)Math.floor((double)a / b); // ✅ floor division
                    case "^": return (int)Math.pow(a,b);
            
            
        }
        return 0;
    }
}