import java.util.Stack;
public class pretopost {
    boolean isOperator(char a){
        switch (a){
            case '-':
            case '+':
            case '/':
            case '*':
            case '^':
            return true;
        }
        return false;
    }
    
    public String convertprefix(String exp){

        Stack<String> stack = new Stack<String>();
        for (int i = exp.length()-1; i >=0 ; i--) {

            char ch = exp.charAt(i);

            if(isOperator(ch)){
                String string1 = stack.pop();
                String string2 = stack.pop();
                String temp = string1 + string2 + ch;
                stack.push(temp);
            }
            else{
                stack.push(ch+"");
            }
        }

        String res = stack.pop();
        return res;
    }

    public static void main(String[] args) {
        String prefix = "*-A/BC-/AKL";
        System.out.println("Prefix Expression: " + prefix);
        System.out.println("Postfix Expression: " + new pretopost().convertprefix(prefix));
    }
}
    