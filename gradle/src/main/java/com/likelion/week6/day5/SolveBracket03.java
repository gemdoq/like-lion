package com.likelion.week6.day5;

import java.util.EmptyStackException;
import java.util.Stack;

public class SolveBracket03 {
    public boolean solution01(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if(stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
    public boolean solution02(String s) {
        Stack<Character> bigBracket = new Stack<>();
        Stack<Character> midBracket = new Stack<>();
        Stack<Character> smallBracket = new Stack<>();
        Stack<Character> angleBracket = new Stack<>();

        for (int i = 0; i<s.length(); i++) {
            try {
                switch (s.charAt(i)) {
                    case '[':
                        bigBracket.push(s.charAt(i));
                        break;
                    case ']':
                        bigBracket.pop();
                        break;
                    case '{':
                        midBracket.push(s.charAt(i));
                        break;
                    case '}':
                        midBracket.pop();
                        break;
                    case '(':
                        smallBracket.push(s.charAt(i));
                        break;
                    case ')':
                        smallBracket.pop();
                        break;
                    case '<':
                        angleBracket.push(s.charAt(i));
                        break;
                    case '>':
                        angleBracket.pop();
                        break;
                    default:
                        break;
                }
            } catch (EmptyStackException e) {return false;}
        }
        return bigBracket.isEmpty() && midBracket.isEmpty() && smallBracket.isEmpty() && angleBracket.isEmpty();
    }
    private boolean isPair(char a, char b) {
        if (a == '(' && b == ')') return true;
        if (a == '[' && b == ']') return true;
        if (a == '{' && b == '}') return true;
        if (a == '<' && b == '>') return true;
        return false;
    }
    public boolean solution03(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '<') {
                stack.push(str.charAt(i));
                continue;
            }
            if (isPair(stack.peek(), str.charAt(i))) {
                stack.pop();
                continue;
            }
            return false;
        }
        return stack.isEmpty();
    }
}
