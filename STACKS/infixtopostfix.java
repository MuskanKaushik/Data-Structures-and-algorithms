import java.util.Stack; 
  
class infixtopostfix
{ 
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
  
    public static void main(String[] args)  
    { 
        String st = "a+b*(c^d-e)^(f+g*h)-i"; 
        System.out.println(infixToPost(st)); 
    } 
} 