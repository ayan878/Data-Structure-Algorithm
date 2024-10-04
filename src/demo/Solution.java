package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        // Initialize the mapping of closing brackets to their corresponding opening brackets
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < x.length(); i++) {
            char curr = x.charAt(i);

            if (map.containsKey(curr)) {
                // Check if the stack is empty or the top of the stack does not match the expected opening bracket
                if (stack.isEmpty() || stack.pop() != map.get(curr)) {
                    return false; // Brackets are not balanced
                }
            } else {
                // If it's an opening bracket, push it onto the stack
                stack.push(curr);
            }
        }

        // If the stack is empty, all brackets were properly balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{([])}"; // Example input
        System.out.println(ispar(input)); // Expected output: true
    }
}
