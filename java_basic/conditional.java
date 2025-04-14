
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        
        // 조건문

        //if  = if () {}

        Scanner x = new Scanner(System.in);
        
        // 값 입력받기 !! Scanner 객체 선언 필요.!!
        int num1 = x.nextInt();

        int num2 = x.nextInt();

        if (num1 >num2)
        {

            System.out.printf("%s",num1 + "가" + num2 + "보다 큼\n");
            System.out.printf("아니 이것도 돼? %s...\n","(이정민)");
        }
        else
        {
            System.out.println("안돼 돌아가");
        }


        // switch

        int menu = x.nextInt();

        // switch 에서 break 와 defult 생략 가능 하지만 하지 않으면 그만큼 모든 case를 다 실행하기 때무에 시간이 오래 걸림
        switch (menu)
        {

                case 1: System.out.println("메뉴 1개임\n");

                case 2: System.out.println("메뉴 2개임\n");

                default: System.out.println("아몰랑\n");

                


        }
        
        // for 문 (c언어 처럼 하면 됨)

        for (int i = 0; i < 3; i++)
        {
            System.out.printf("지금 현제 i의 횟수는? %d 임..!\n",i);

        }


        // while 문
        int ch = 1;
        while (ch <= 100)
        {

            System.out.printf("현 진행도 %d\n",ch);
            ch++;
        }

        // do while
        do
        {
            System.out.printf("현 진행도 %d\n",ch);
            ch--;
        }
        while (ch >= 0); // do while 문은 while 끝에 세미클론 ; 을 붙여야함 
        // 입출력 종료
        Scanner close;





    }


}
