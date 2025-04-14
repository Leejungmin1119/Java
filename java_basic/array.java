public class array {
    public static void main(String[] args) {
        // 배열 선언
        //기본형 = 자료형 [] 변수이름 = new 자료형 [배열크기];

        //예제
        int [] a = new int [3]; // 3의 크기를 지닌 배열 생성
        int b[] = new int[3]; // 이렇게 해도 됨
        int c[] = new int[] {1,2,3,4,5}; // 이렇게 바로 선언도 가능
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        // a[3] = 4; 에러발생 

        System.out.println(a[1]);//2

        
        // 배열 순회

        for (int i =0;i<a.length;i++)
        {
            System.out.printf("%d\n",a[i]);
        }

        // i에다가 바로 배열 자체의 값을 집어넣어서 순회하는 방식
        for (int i : a)
        {
            //
            System.out.println(i);
        }

        // 다차원 배열 선언

        int lists[][] = new int[3][2];// 양쪽에 배열을 추가
        
    }
}
