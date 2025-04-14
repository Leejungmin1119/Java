public class string {
    public static void main(String[] args) {

        // 문자열 기능 알아보기 in java

        // 1. length

        String str = "문자열입니다.";

        // java 에서의 문자열 길이 함수는 s.length(); 처럼 써줘야 함 
        System.out.println(str.length());// 7

        // 2. toUpperCase , toLowerCase = 대문자 소문자 변환

        String my_names = "jung_min_lee";

        System.out.println(my_names.toUpperCase()); //JUNG_MIN_LEE

        // contains = 포함여부 확인

        System.out.println(my_names.contains("lee")); // true
        System.out.println(my_names.contains("Lee")); // false
        
        // indexOf, lastIndexOf= index 위치 확인
        String s = "i like java";

        System.out.println(s.indexOf("a"));//8
        System.out.println(s.lastIndexOf("a"));//10

        // 추가 문자열 기능

        /* 
         * startsWith = 문자열로 시작하는지? ( () 안에 비교할 문자열 필요)
         * endsWith = 문자열로 끝나는지? ( () 안에 비교할 문자열 필요)
         * replace = 문자열 변환 ('a','b') 
         * substring = 문자열 자르기
         * trim = 앞 뒤 공백 제거
         * concat = 문자열 결합
         * 
        */

        System.out.println(s.startsWith("i"));//false 시작부분이 i가 아니므로

        // 문자열 비교

        String s1 = new String("java");
        String s2 = new String("java");

        System.out.println(s1 == s2);// false 발생 ! 

        // 해결법

        /*  
            new String() 을 선언하게 되면 value는 같지만 주소가 서로 다르기 때문에 비교할떄

            그냥 값끼리 비교하는 것이 아닌 주소값을 비교하게 되는데 아까 위와 가팅 주소값은 다르기 때문에 false 가 출력 되는 것이다.


            그럼 어떻게 해야 주소값에 상관없이 값을 비교할 수 있는 것일까?

            s1.equals(s2)

            equals 함수를 사용하게 되면 주소값을 비교하는 것이 아닌 값 자체를 비교하게 되기 때문에 true가 출력된다.
        */


        System.out.println(s1.equals(s2));//true

        // 특수 문자.

        // \n = 줄바꿈 , \t = 탭 공백 , \\ 역슬래쉬 (\출력법) , \" 큰따음표 출력 , \' 작은 따음표 출력

        System.out.println("hello\n my name\t: jungminlee \\ \n23 and my vision is \' develop. \'");

    }

}
