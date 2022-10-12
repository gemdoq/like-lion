package week5.day2.line;

import week5.day2.line.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {

    Parser<T> parser; // Parser라는 interface에 의존하게끔
    boolean isRemoveColumnName = true;

    public LineReader(Parser<T> parser) {
        this.parser = parser;
    }
    public LineReader(Parser<T> parser, boolean isRemoveColumnName) {
        this.parser = parser;
        this.isRemoveColumnName = isRemoveColumnName;
    }

    List<T> readLine(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        if(isRemoveColumnName) { br.readLine(); }
        while ((str = br.readLine()) != null) {
            result.add(parser.parse(str));
        }
        return result;
    }
}