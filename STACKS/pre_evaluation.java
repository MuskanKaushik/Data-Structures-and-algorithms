import java.util.Stack;
public class pre_evaluation {
    static int pre_eval(String st){
        Stack<Integer> stack = new Stack<>();

        for(int i=st.length()-1; i>=0; i--){
            char a = st.charAt(i);

            if(Character.isDigit(a))
            stack.push((int)a -48);

            else{

                int A = stack.pop();
                int B = stack.pop();

                if(a=='+'){
                    stack.push(A+B);
                }
                else if(a == '-'){
                    stack.push(A+B);
                }
                else if(a == '/'){
                    stack.push(A/B);
                }
                else if(a == '*'){
                    stack.push(A*B);
                }
            }

        }
        return stack.pop();
    }

    public static void main(String[] args){
        String st = "+9*26";
        System.out.println(pre_eval(st));
    }
    
}