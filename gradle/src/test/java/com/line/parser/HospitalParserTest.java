package com.line.parser;

import com.line.domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalParserTest {

    @Test
    @DisplayName("test doing well parse id")
    void parseID() {
        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parse("1");
        Assertions.assertEquals("1", hospital.getId());
    }
}