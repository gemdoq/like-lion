package com.likelion.week6.day5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracket02Test {

    @Test
    @DisplayName("is solvable bracket?")
    void bracket() {
        SolveBracket02 solveBracket02 = new SolveBracket02();
        assertTrue((solveBracket02.solution("()()")));
    }
}