class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(') stack.add(')');
            else if(ch == '[') stack.add(']');
            else if(ch == '{') stack.add('}');
            else{
                if(stack.isEmpty() || stack.pop() != ch){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
