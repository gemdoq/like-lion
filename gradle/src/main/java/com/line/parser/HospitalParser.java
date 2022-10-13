package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{

    private String getSubdivision(String name) {
        String[] subdibisions = {"소아과", "피부과", "성형외과", "정형외과", "산부인과", "관절", "안과", "가정의학과", "비뇨기과", "치과", "내과", "외과"};

        for (String subdivision : subdibisions) {
            if (name.contains(subdivision)) {return subdivision;}
        }
        return "";
    }

    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");
//        address;
//        district;
//        category;
//        Integer emergencyRoom;
//        name;
//        subdivision;

        // subdivision 파싱을 해서 넣는 것이 좋을 것 같습니다.
        String name = splitted[10];
        String subdivision = getSubdivision(name);

        return new Hospital(splitted[0], splitted[1], splitted[2], Integer.parseInt(splitted[6]), name, subdivision);
    }
}