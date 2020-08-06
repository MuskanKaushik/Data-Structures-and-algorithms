import java.util.Stack;
public class balanced_parenthesis {

    public static String checkparenthesis(String expr){
        if(expr.isEmpty()){
            return "Balanced";
        }
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<expr.length(); i++)
        {
            char c =expr.charAt(i);
            if(c == '{' || c == '(' || c == '[')
            {
                stack.push(c);
            }
            if(c == '}' || c == ')' ||  c == ']')
            {
                if(stack.isEmpty())
                return "Not balanced";

                char l = stack.peek();
                if( c == '}' && l == '{' || c == ')' && l == '(' || c == ']' && l == '[' )
                {
                    stack.pop();
                }
                else
                return "Not balanced";
            }
        }
        return stack.isEmpty()?"Balanced":"Not balanced";

    }
    public static void main(String[] args){
        String expr1 = checkparenthesis("a*(b+c)-(d*e)");
        System.out.println("a*(b+c)-(d*e): " +expr1);

        String expr2 = checkparenthesis("(a*(b-c)*{d+e}");
        System.out.println("(a*(b-c)*{d+e}: "+expr2);
    }
}