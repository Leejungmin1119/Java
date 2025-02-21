

public class operator {
    public static void main(String[] args) {
        
        int a = 5;
        System.out.println(a);

        // 산술 연산자

        //1씩 증가 
        ++a; // 전위연산
        System.out.println(a);

        //1씩 감소
        a--; // 후위연산
        System.out.println(a);

        /*다른 연산자 +,-,*,/,% 기존 파이썬 이랑 같음*/


        // 대입 연산자

        // 복합 대입 연산자 (파이썬과 같음)

        double tier = 100;

        tier /= 30;

        System.out.println(tier);

        // 비교 연산자 (파이썬과 동일)
        
        // 파이썬에는 그냥 괄호없이 뒤에 : 쓰면 됨 / if () 이런식으로 사용 밑에 {} 필요 
        if (tier < 0) 
        {

        }

        // 삼향 연산자 (c언어랑 동일)
        int x =3;
        int y =5;

        // x > y 라면 ? max에 x 대입 아니면? y대입

        int max =  x>y ? x:y;

        System.out.println(max);

    }
}
