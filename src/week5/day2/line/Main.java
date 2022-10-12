package week5.day2.line;

import week5.day2.line.domain.Hospital;
import week5.day2.line.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "/Users/a/Downloads/서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLine(filename);

        System.out.println(hospitals.size());
        for (Hospital hospital : hospitals) {
            System.out.println(hospital.getId());
        }
    }
}
