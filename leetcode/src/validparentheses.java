import java.util.*;
public class validparentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // loop through string s as a array
        for(char c : s.toCharArray()){
            // look into the char
            switch (c) {
                // if char matches the open parentheses then push
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                // check to see if the previous matches the correct parentheses or empty
                case ')':
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}