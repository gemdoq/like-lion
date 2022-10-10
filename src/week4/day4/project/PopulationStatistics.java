package week4.day4.project;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class PopulationStatistics {

    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        // 파일을 곧장 다 읽어와서 객체 생성하는 게 아님
        //read()를 할 때마다 필요한 만큼 읽어오는 것

        //100만 글자를 한 글자씩 읽어오기
        //시간이 엄~청 오래 걸림 -> 비효율.
        //그래서 Bufferedreader를 사용 합니다!
        String fileContents = "";
        while (fileContents.length() <1000000) {
            char c = (char) fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);

    }

    public PopulationMove PopulationMoveParse (String data) {
        String[] sidoData = data.split("\\,");
        return new PopulationMove(Integer.parseInt(sidoData[0]), Integer.parseInt(sidoData[6]));
    }

    public List<PopulationMove> readByLine(String filename) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename));

        String str = "";
        while((str = reader.readLine()) != null) {
//            System.out.println(str);
            PopulationMove pm = PopulationMoveParse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }

    public void readByLine2(String filename) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        try{
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createAFile (String filename) {
        File file = new File(filename);
        try{
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //List<String>을 지정한 파일에 write하는 메소드
    public void write (List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 키 만들기
    // map에 키에 해당하는 밸류 없으면 1 대입
    // map에 키에 해당하는 밸류 있으면 +1
    // 리턴
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm : pml) {
            String key = pm.getFromSido()+","+pm.getToSido();
            if(moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            } else{
                moveCntMap.put(key, moveCntMap.get(key)+1);
            }
        }
        return  moveCntMap;
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }

    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\안락한곳\\Desktop\\멋사\\2021_인구관련연간자료_20220927_66125.csv";
//
//       PopulationStatistics populationStatistics = new PopulationStatistics();
//        List<PopulationMove> pml = populationStatistics.readByLine(address);
//
////        System.out.println(pml.size());
//        List<String> strings = new ArrayList<>();
//        for(PopulationMove pm : pml) {
////            System.out.printf("전입:%s, 전출:%s\n",pm.getFromSido(), pm.getToSido());
//            String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);
//        }
//
////        populationStatistics.createAFile("from_to.txt");
//
//
////        Strings.add("11, 11");
//        populationStatistics.write(strings, "from_to.txt");

        address = "from_to.txt";
        PopulationStatistics populationStatistics2 = new PopulationStatistics();
        List<PopulationMove> pml2 = populationStatistics2.readByLine(address);

//        for(PopulationMove pm : pml2) {
//             System.out.printf("전입:%s, 전출:%s\n",pm.getFromSido(), pm.getToSido());
//        }

        Map<String, Integer> map = populationStatistics2.getMoveCntMap(pml2);
        String targetFilename = "for_heatmap.txt";
        populationStatistics2.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String[] fromto = key.split("\\,");
            String s = String.format("[%s, %s, %d]\n",fromto[0],fromto[1],map.get(key));
            cntResult.add(s);
            //System.out.printf("key : %s value : %d\n",key, map.get(key));
        }
        populationStatistics2.write(cntResult, targetFilename);
    }
}