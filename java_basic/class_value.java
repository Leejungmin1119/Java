

public class class_value {
    public static void main(String[] args) {

        // 메인 함수에 클래스 가져오기
        schoolP school_1 = new schoolP();
        
        // 클래스 값 설정
        school_1.ip = "22,156,138,101\n";
        school_1.number = 13;
        schoolP.grade  = "A+";

        //출력
        System.out.println(school_1.ip);

        System.out.println(schoolP.grade);
        // 인스턴스 메소드 호출
        school_1.student();

        // 클래스 메소드 호출
        schoolP.rule();
    }
}

    //클래스 선언 class_value 밖에서 선언해야 한다.
    class schoolP{

        // 인스턴스 변수 = 클래스 내에서 변수 선언만 되고 값은 할당이 안 된상태를 말함
        String ip;
        int number;
        String memo;
        //클래스 변수 선언
        // 클래스 변수는 다른 인스턴스 변수와 달리 메인 함수에서 클래스 객체를 선언할 필요 없이 만들 수 있어 용이하다.

        static String grade;
        
        // 객체 내의  인스턴트 메소드 선언
        public void student() {
            
            System.out.printf("이 학교의 인원수는? %d\n",number);
            System.out.printf("이 학교의 ip는? %s\n",ip);
        }

        // 객체 내의 클래스 메소드 선언
        public static void rule()
        {
            System.out.printf(grade);
        }

        public void project(String memo)
        {   // 여기서 this의 메모는 위쪽에 메모를 오른쪽에 있는 메모는 선언할때의 메모로 구분지어줌.
            this.memo = memo; 
        } 
        

    } 

