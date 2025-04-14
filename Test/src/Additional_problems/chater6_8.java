package Additional_problems;

import java.util.Calendar;
import java.util.Scanner;
import java.util.stream.Gatherer.Integrator;

public class chater6_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 오늘의 날 입력
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        // 클래스 생성자 선언
        Cal today = new Cal(year, month, day);

        today.printToday();

        while (true) {
            System.out.println("생일 입력 : ");

            String yearInput = scanner.next();

            if (yearInput.equals("그만")) {
                break;
            }

            // 인트형으로 바꾸기
            year = Integer.parseInt(yearInput);
            month = scanner.nextInt();
            day = scanner.nextInt();

            Cal check_day = new Cal(year, month, day);

            int birthdays = today.days();
            int todays = check_day.days();

            if (birthdays >= todays) {
                System.out.println("오늘까지" + (birthdays - todays) + "일 살아왔습니다.");
            } else if (birthdays < todays) {
                System.out.println(todays - birthdays + "일 더 살아야 생일이 됩니다.");
            }

        }

    }

    /*
     * 
     * calendarr 클래스를 활용해서 생일을 입ㄹ역하면 오늘 이시간까지 몇칠 살았는지 알려주는 프로그램 작성
     * 만약 생일이 오늘 날자보다 이후라면 몇칠뒤에 생일 되는지 출력하기
     * 
     */

}

class Cal {
    int year;
    int month;
    int day;

    Scanner scanner = new Scanner(System.in);

    public Cal(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printToday() {
        System.out.printf("오늘은 %d년 %d월 %d일\n", year, month, day);

    }

    public int days() {
        Calendar cal = Calendar.getInstance();

        cal.set(year, month - 1, day);

        long millis = cal.getTimeInMillis();// 년도 월 일을 초로 변환
        return (int) (millis / (1000 * 60 * 60 * 24)); //
    }

}
