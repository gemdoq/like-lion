package week5.day2.babylion;

public class WhyClass {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(
                "A1120837",
                "서울특별시 금천구 벚꽃로 286",
                "C",
                2,
                "365병원",
                null
        );
        System.out.println(hospital.getDistrict());
    }
}