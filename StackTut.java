import java.util.Stack;

public class StackTut{
    public static void main(String[] args){
        // stack - LIFO last in first out like a stack of bookcase
        // push() add
        // pop()  remove
        // usage? 
        // undo/redo - text editor
        // moving back/forward in web browser
        // backtracking algorithm
        // calling functions
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // reach exception if you pop more than what is on
        // the stack


        // System.out.println(stack.peek());
        // String myFavGame = stack.pop();
        // System.out.println(stack.search("Minecraft"));
        //    for(int i=0; i<10000; i++){
        //     stack.push("Fallout76");
        //      return -1 stack overflow
        //    }
    }

}