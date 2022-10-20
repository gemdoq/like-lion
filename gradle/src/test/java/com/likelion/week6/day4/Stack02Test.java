package com.likelion.week6.day4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    @BeforeEach
    void setUp(){
        //example) db delete code
        //example) db insert code
        System.out.println("before each");
    }

    @Test
    @DisplayName("is push working")
    void push() {
        // push()
        // getArr()
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);
        Integer[] arr = stack02.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    @DisplayName("is pushAndPop working")
    void pushAndPop() {
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);

        assertEquals(20, stack02.pop());
        assertEquals(10, stack02.pop());
    }
}