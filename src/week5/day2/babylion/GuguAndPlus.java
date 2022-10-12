package week5.day2.babylion;

interface Operation {
    int operation(int a, int b);
}

public class GuguAndPlus {
    public void printGugu(int dan, String operator, Operation operation) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d %s %d = %d\n", dan, operator, i, operation.operation(dan, i));
        }
    }
    public void printPlusGugu(int dan) {
        System.out.println(dan + "단이 시작합니다");
        printGugu(dan, "+", new Operation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        });
        System.out.println(dan + "단이 끝났습니다");
    }
    public void printMultiGugu(int dan) {
        System.out.println(dan + "단이 시작합니다");
        printGugu(dan, "*", new Operation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        });
        System.out.println(dan + "단이 끝났습니다");
    }

    public static void main(String[] args) {
        GuguAndPlus guguAndPlus = new GuguAndPlus();
        for (int j = 2; j <= 9; j++) {
            guguAndPlus.printPlusGugu(j);
        }
    }
}
