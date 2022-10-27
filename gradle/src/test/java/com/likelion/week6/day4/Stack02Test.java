package com.likelion.week6.day4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    // make instance object which is stack02
    Stack02 stack02 = new Stack02();

    @BeforeEach
    void setUp(){
        //example) db delete code
        //example) db insert code
        // push()
        stack02.push(10);
        stack02.push(20);
        System.out.println("before each");
    }

    @Test
    @DisplayName("is push working")
    void push() {
        // getArr()
        Integer[] arr = stack02.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    @DisplayName("is pushAndPop working")
    void pushAndPop() {
        assertEquals(20, stack02.pop());
        assertEquals(10, stack02.pop());
        assertThrows(EmptyStackException.class, ()-> {
            stack02.pop();
        });
    }

    @Test
    @DisplayName("is stack empty")
    void isEmpty() {
        Stack02 stack02 = new Stack02();
        assertTrue(stack02.isEmpty());
        stack02.push(10);
        assertFalse(stack02.isEmpty());
        stack02.pop();
        assertTrue(stack02.isEmpty());
    }

    @Test
    void peek() {
        Stack02 stack02 = new Stack02();
        // peek() when stack is empty
        assertThrows(EmptyStackException.class, ()->{
            stack02.peek();
        });
        stack02.push(50);
        assertEquals(50, stack02.peek());
    }

    //    @Test
//    @DisplayName("what happen if pop when stack is empty")
//    void realStack() {
//        Stack<Integer> stack = new Stack<>();
//        assertThrows(EmptyStackException.class, ()-> {
//            stack02.pop();
//        });
//    }
}