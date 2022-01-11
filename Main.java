import java.util.Stack;
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c==')') stack.pop();
            if(stack.size()>0) str.append(c);
            if(c=='(') stack.push(c);
        }
        return str.toString();
    }
}
