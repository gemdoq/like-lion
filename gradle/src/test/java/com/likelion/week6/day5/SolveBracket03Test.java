package com.likelion.week6.day5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracket03Test {

    @Test
    @DisplayName("is solvable bracket?")
    void bracket() {
        SolveBracket03 solveBracket03 = new SolveBracket03();
        assertTrue(solveBracket03.solution01("()()"));
    }
}