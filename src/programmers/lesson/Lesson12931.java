package programmers.lesson;

public class Lesson12931 {
    public int solution(int n) {
        int answer = 0;

        // for? while?
        while( n > 0) {
            answer += n%10;
            n = n/10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lesson12931 ls = new Lesson12931();
        int result = ls.solution(1234);

        if(result == 10) {
            System.out.println("test pass");
        } else {
            System.out.println("test fail");
        }
    }
}