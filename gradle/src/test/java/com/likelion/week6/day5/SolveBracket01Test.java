package com.likelion.week6.day5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracket01Test {
    @Test
    @DisplayName("is solvable bracket?")
    void bracket() {
        SolveBracket01 solveBracket01 = new SolveBracket01();
        assertTrue(solveBracket01.solution("()()"));
    }
}