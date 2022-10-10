package week4.day4.project;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    // 생성자

    public PopulationMove() {
    }

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public PopulationMove PopulationMoveParse (String data) {
        String[] sidoData = data.split("\\,");
        return new PopulationMove(Integer.parseInt(sidoData[0]), Integer.parseInt(sidoData[6]));
    }
}