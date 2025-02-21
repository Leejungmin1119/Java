
public class valuable {
    public static void main(String[] args) {

        int age = 23;// 4바이트 ,정수
        // float 을 선언할때 기본형이 double 형이므로, 아래와 같이 f를 변수 옆에다가 붙여야 한다.        
        float value = 2.22f;
        
        // strnig 선언할때는 앞에 문자가 대문자
        String name = "lee_jung_min";

        //char형
        char A = '?';

        // 선언을 미리 해놓고 나중에 그 값을 정해둬도 가능
        int time;

        time = 7;

        // 값 바꾸기 (자동 형변환)

        // 생략가능
        float time_detail = /*(float) (생략가능)*/ time; 

        // 자동 형변환 순서 = int -> long -> float -> double 
        // 만약 화살표 방향대로 바꾼다면 상관 x 하지만 float 에서 int 로 바꾸는 거와 같이 반대로 바꾼다면 데이터 손실이 일어날 수 있어
        // 형 변환 선언을 해줘야 된다.

        //생략 불가능

        int test_change_time = (int) time_detail; // 자동형 변환 선언
        
        //출력할때는 + 또는 printf() (c언어 문법) 사용        
        System.out.printf("%d,%s,%d\n",test_change_time,name,age);
    }
}
