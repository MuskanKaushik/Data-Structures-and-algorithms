import javax.lang.model.util.ElementScanner14;
import java.util.Stack;
public class infixtoprefix {
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
    static String infixToPost(String exp) 
    {  
        String res = new String(""); 
          
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char a = exp.charAt(i); 
              
            if (Character.isLetterOrDigit(a)) 
                res += a; 
           
            else if (a == '(') 
                stack.push(a); 
              
            else if (a == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    res += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression";                 
                else
                    stack.pop(); 
            } 
            else
            { 
                while (!stack.isEmpty() && Prec(a) <= Prec(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid Expression"; 
                    res += stack.pop(); 
             } 
                stack.push(a); 
            } 
       
        } 
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            res += stack.pop(); 
         } 
        return res; 
    } 
    static String infixtoPre(String exp){
        String r = "";
        String re ="";
        for(int i= exp.length()-1;i>=0;i--){
            if(exp.charAt(i) == ')'){
                r= r+'(';
            }
            else if(exp.charAt(i)=='('){
                r=r+')';
            }
            else{
                r=r+exp.charAt(i);
            }
        }
        String a = infixToPost(r);

        for(int i= a.length()-1;i>=0;i--){
            re = re+a.charAt(i);
        }

        return re;
    }
  
    public static void main(String[] args)  
    { 
        String st = "(a-b/c)*(a/k-l)"; 
        System.out.println(infixtoPre(st)); 
    } 
    
}