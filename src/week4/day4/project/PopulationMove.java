package week4.day4.project;

public class PopulationMove {
    private int fromSido; //서울시에서 온
    private int toSido; //서울시로 간

    public PopulationMove(int fromSido, int toSido) {
        //constructor 추가
        this.fromSido = fromSido;
        this.toSido = toSido;
    }


    //getter setter
    public int getFromSido() {
        return fromSido;
    }

    public void setFromSido(int fromSido) {
        this.fromSido = fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public void setToSido(int toSido) {
        this.toSido = toSido;
    }
}
