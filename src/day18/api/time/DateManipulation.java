package day18.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateManipulation {

    public static void main(String[] args) {

        //대여일 : 오늘
        LocalDate orderDate = LocalDate.now();
        //반납일 : 3일 뒤
        LocalDate returnDate = orderDate.plusDays(3);
        System.out.println("returnDate = " + returnDate);

        //오늘로부터 2년 1개월 3일 후의 날짜정보
        // Builder패턴
        LocalDateTime target = LocalDateTime.now()
                .plusYears(2)
                .plusMonths(1)
                .plusDays(3)
                .minusHours(5);

        System.out.println("target = " + target);

        //시간 비교
        //이벤트 시작, 종료일
        LocalDateTime start
                = LocalDateTime.of(2021, 10, 1, 0, 0);

        LocalDateTime end
                = LocalDateTime.of(2022, 3, 17, 23, 59, 59);

        if (LocalDateTime.now().isBefore(end)) {
            System.out.println("진행중인 이벤트입니다.");
        } else {
            System.out.println("종료된 이벤트입니다.");
        }

        //사이 날짜 구하기
        long between = ChronoUnit.DAYS.between(start, end);
        System.out.println("between = " + between);

        //날짜와 시간 포맷팅
        LocalDateTime nowTime = LocalDateTime.now();

        System.out.println("nowTime = " + nowTime);

        DateTimeFormatter f
                = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초");

        String day = nowTime.format(f);
        System.out.println("day = " + day);
    }
}
