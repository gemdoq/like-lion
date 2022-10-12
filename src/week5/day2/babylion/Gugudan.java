package week5.day2.babylion;

public class Gugudan {
    public void print(int dan) {
        System.out.println(dan + "단이 시작합니다");
        for(int i = 2; i <= 9; i++) {
            System.out.printf("%d X %d = %d\n", dan, i, dan * i);
        }
        System.out.println(dan + "단이 끝났습니다");
    }
    // 다형성
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        for(int j = 1; j <= 9; j++) {
            gugudan.print(j);
        }
    }
}