

public class class_value2 {
    public static void main(String[] args) {
        
        // 클래스에서 선언한 생성자 가져오기
        person person1 = new person("lee\n",23);

        System.out.printf(person1.name,person1.age);

        // getter setter

        food menu1 = new food();

        menu1.money = 10000;
        menu1.setmenu("gimch");
        System.out.printf("총 자산은 %d원\n",menu1.getmoney());
        System.out.printf("%s 가 나왔습니다. 카운터에서 받아가소.\n",menu1.menu);

    }

}
// 생성자
class person {
    String name;
    int age;
    
    // 생성자 메소드 주로 초기화 작업을 시행할때 사용이 된다.
    // !! 무조건 클래스 이름과 생성자의 이름은 같아야 사용이 가능하다.
    person(String input_name, int input_age)
    {
        this.name = input_name;
        this.age = input_age;
    }

}
// getter 와 setter

// 왜 쓰는 걸까?

// private 비공개 설정일때의 클래스 접근
/* 
 * public 과는 다르게 private 는 
 * 
 * 
 * 
*/
class food {
    int money;
    String menu;

    // 무조건 메소드 명앞에 get을 붙여줘야 사용이 가능하다.
    // 또한 무조건 void를 제외한 반환타입이 있어야 사용이 가능하다.

    //getter 변수의 값 반환
    public int getmoney()
    {   
        return money - 1000;
    }

    //setter 변수의 값 저장

    public void setmenu(String menu)
    {
        this.menu = menu;
    }

    /* 
     * 아니 왜? getter 와 setter를 사용하는가? 
     * 
     * 물론 일반적인 상황에서는 사용할 필요는 없다.
     * 
     * 그냥 클래스에서 메소드 사용해도 충~분히 가능하다. 하지만 우리는 뭐 딱히 쓸일이 없지만 getter 와 setter는 
     * 
     * 1. 추가적으로 private 변수에 접근이 가능하다. 
     * 
     * 2. 잘못된 데이터의 입력을 방지 시켜줌
     * 
     * 3. 코드가 일관성 있음 get?? set??? 와 같이 일관성 및 마크 와 같이 큰 개발에서는 이를 쓰는 것이 유지보수에 굉장히 유용하다.
     * 
     * 
    */

    /* 
     * + 접근 제어자
     * 
     * 접근 제어자는 위에 말했듯이 private, pubilc 그리고 추가로 default , protected 이렇게 총 4가지를 접근 제어자로 부르는데
     * 
     * 
     * 클래스 에서 사용할 수 있는 접근 제어자는 총 2개 (pubic 과 defalt)로 public 은 말 그대로 모두에게 접근이 가능하고 
     * 
     * defalt는 public을 안붙이면 자동으로 defalt가 선언이 되는데 이거 같은 패키지 안에선 접근이 가능하다.
     * 
     * 클래스 변수 선언에서는 총 4개로
     * 
     * private 는 같은 클래스 내에서만 접근 가능
     * 
     * protect 는 같은 패키지 내의 모든 클래스 and 다른 패키지의 자식 클래스 까지 가능
     * 
     * 나머지는 이전과 동일하다.
     * 
    */
}


