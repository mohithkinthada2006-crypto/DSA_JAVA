import java.util.*;
public class isValid {
    public static void main(String[]args){
        Stack<Character> stack = new Stack<>();
        String s ="([)]";
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(')');
            } else if(c=='{'){
                stack.push('}');
            } else if(c=='['){
                stack.push(']');
            } else{
                if(stack.isEmpty()||stack.pop()!=c){
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
