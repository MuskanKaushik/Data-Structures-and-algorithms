import java.util.Stack;
public class post_evaluation {
    static int post_eval(String st){
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<st.length(); i++){
            char a = st.charAt(i);

            if(Character.isDigit(a))
            stack.push(a - '0');

            else{

                int A = stack.pop();
                int B = stack.pop();

                if(a=='+'){
                    stack.push(B+A);
                }
                else if(a == '-'){
                    stack.push(B-A);
                }
                else if(a == '/'){
                    stack.push(B/A);
                }
                else if(a == '*'){
                    stack.push(B*A);
                }
            }

        }
        return stack.pop();
    }
    public static void main(String[] args){
        String st = "236*+5-";
        System.out.println(post_eval(st));
    }
    
}