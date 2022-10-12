package week5.day2.readlineparser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class LineReader {
    //스트링 리턴할거
    List<String> readLine(String filename) throws FileNotFoundException {
        List<String> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        while((str = br.readLine()) != null ) {
            result.add(str);
        }
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "";
        LineReader lr = new LineReader();
        List<String> lines = lr.readLine(filename);
        System.out.println(lines.size());
    }
}
