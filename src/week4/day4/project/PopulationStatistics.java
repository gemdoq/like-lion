package week4.day4.project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    public void readFileByCharacter(String filename) throws IOException {
        //파일 리더로 한 글자씩 읽는 메서드
        FileReader fileReader = new FileReader(filename);

        String fileCon = "";
        while (fileCon.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileCon += c;
        }
        System.out.println(fileCon);
    }

    public List<PopulationMove> readFileByLine(String filename) throws IOException {
        //한 줄씩 읽ㅇ는 메서드. 매개변수로 파일 이름 받음.

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename));
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        } //while문 안에서 string을 populationmove로 파싱하여 pml에 add
        reader.close();

        return pml; //파일 다 읽어서 파싱 끝나면 리턴
    }

    //public void readFileByLine2(String filename) throws IOException {    }

    public PopulationMove parse(String data) {
        //file 읽고 ,로 스플릿 -> 한 줄의 데이터를 populationMove로 리턴하는 메서드

        String[] parsedData = data.split(",");

        return new PopulationMove(Integer.parseInt(parsedData[0]), Integer.parseInt(parsedData[1])); //from to
    }

    public void createAFile(String filename) {
        //필요한 부분만 추출해서 파일로 만드는 메서드

        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String filename) {
        //생성한 파일에 데이터를 넣는 메서드
        //

        File file = new File(filename);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String fromToString(PopulationMove populationMove) {
        //pm을 string으로 가공
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }

    public static void main(String[] args) throws IOException {
        String address = "./from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();

        //한 줄 넣고 파싱해보기
        //PopulationMove populationMove=populationStatistics.parse("50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528");
        //System.out.printf("toSido: %d fromSido: %d", populationMove.getToSido(), populationMove.getFromSido());

        //list 형식으로 받아옴
        //List<PopulationMove> pml = populationStatistics.readFileByLine(address);
        //System.out.println(pml.size());


        //populationStatistics.createAFile("from_to.txt"); //vv파일 생성
        List<PopulationMove> pml = populationStatistics.readFileByLine(address);
        //List<String> strings = new ArrayList<>();
        for (PopulationMove pm : pml) {
            System.out.printf("전입:%s, 전출:%s \n", pm.getFromSido(),pm.getToSido());
            //String fromTo = populationStatistics.fromToString(pm);
            //strings.add(fromTo);
        }

        //strings.add("11,11");

        //populationStatistics.write(strings, "./from_to.txt");
    }
}
