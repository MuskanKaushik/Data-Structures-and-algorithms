import java.util.Stack;
public class prefixtoinfix {
    public String convertinfix(String exp){

        Stack<String> stack = new Stack<>();
        for (int i = exp.length()-1; i >=0 ; i--) {
            char ch = exp.charAt(i);

            if(isOperator(ch)){
                String string1 = stack.pop();
                String string2 = stack.pop();
                String temp = "("+string1+ch+string2+")";
                stack.push(temp);
            }
            else
            {
                stack.push(ch+"");
            }
        }

        String res=stack.pop();

        return res;
    }

    boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        System.out.println("Prefix Expression: " + exp);
        System.out.println("Infix Expression: " + new prefixtoinfix().convertinfix(exp));
    }
}
    
