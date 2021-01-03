package KataProblems.week8.ValidBraces;

import java.util.Stack;

public class BraceChecker {
    public boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        for (char letter: braces.toCharArray()){
            if (letter=='{' || letter=='[' || letter=='('){
                stack.push(letter);
            } else if (!stack.isEmpty() && ((letter=='}' && stack.peek()=='{') || (letter==')' && stack.peek()=='(') || (letter==']' && stack.peek()==  '['))){
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
