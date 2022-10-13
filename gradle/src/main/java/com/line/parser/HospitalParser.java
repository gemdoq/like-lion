package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(splitted[0]);
    }
}