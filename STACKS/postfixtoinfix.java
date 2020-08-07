import java.util.*; 
import java.util.Stack;
class postfixtoinfix {
static boolean ischaracter(char x) 
{ 
    return (x >= '0' && x <= '9');
             }

static String getInfix(String st) 
{ 
    Stack<String> stack = new Stack<String>(); 
  
    for (int i = 0; i < st.length(); i++) 
    { 
        char a = st.charAt(i);
        if (ischaracter(a)) 
        stack.push(a + ""); 
        
        else{
        String A = stack.pop();
        String B = stack.pop();

        if(a=='+'){
            stack.push("(" + B +"+"+ A + ")");
        }
        else if(a == '-'){
            stack.push( "(" + B +"-"+  A + ")");
        }
        else if(a == '/'){
            stack.push("("+ B+"/" + A+ ")");
        }
        else if(a == '*'){
            stack.push("("+ B+ "*" +A +")");
        }
    }
} 
    return stack.peek(); 
} 
public static void main(String args[]) 
{ 
    String st = "12+54+*"; 
    System.out.println( getInfix(st)); 
} 
} 
    
