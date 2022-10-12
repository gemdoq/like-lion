package week5.day2.line.parser;

public interface Parser<T> {
    T parse(String str); // 어떤 파일을 파싱하느냐에 따라서 객체가 어떤 타입인지 결정
}
