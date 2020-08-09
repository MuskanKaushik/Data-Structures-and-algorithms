import java.util.Stack;
public class posttoprefix {
    static boolean isOperator(char x){
        switch (x){
            case '-':
            case '+':
            case '/':
            case '*':
            case '^':
                return true;
        }
        return false;
    }

    public static String convertpostfix(String exp){

        Stack<String> stack = new Stack<>();
        for (int i = 0; i <exp.length() ; i++) {

            char ch = exp.charAt(i);

            if(isOperator(ch)){
                String string1 = stack.pop();
                String string2 = stack.pop();
                String temp = ch + string2 + string1;
                stack.push(temp);
            }else{
                stack.push(ch+"");
            }
        }
        String res = stack.pop();
        return res;
    }

    public static void main(String[] args) {
        String postfix = "ABC/-AK/L-*";
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Prefix Expression: " + convertpostfix(postfix));
    }
}
    
