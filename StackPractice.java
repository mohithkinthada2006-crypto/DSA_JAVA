import java.util.*;
class StackPractice{
    public static void main(String[]args){
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push("D");
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}