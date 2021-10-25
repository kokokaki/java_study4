package day18.api.time;

import java.time.*;

public class LocalTimeBasic {

    public static void main(String[] args) {

        //날짜 정보 제어
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        //임의의 날짜정보 생성
        LocalDate targetDate
                = LocalDate.of(2022, 5, 4);
        System.out.println("targetDate = " + targetDate);

        //시간정보 제어
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalTime targetTime = LocalTime.of(20, 0, 3);
        System.out.println("targetTime = " + targetTime);

        //날짜와 시간정보 제어
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        //현재 시간의 밀리초 (유닉스 타임)
        // 1970-01-01 00:00:00 를 기준으로 현재까지 흘러간 시간의 단위(밀리초)
        long nowTimeMs = System.currentTimeMillis();
        System.out.println("nowTimeMs = " + nowTimeMs);

        //각 날짜와 시간정보 추출
        int year = now.getYear();
        System.out.println("year = " + year);

        Month month = now.getMonth();
        System.out.println("month = " + month);

        int monthValue = now.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);

        String weekDay = "";
        switch (dayOfWeek) {
            case MONDAY: weekDay = "월요일"; break;
            case TUESDAY: weekDay = "화요일"; break;
        }

    }
}
