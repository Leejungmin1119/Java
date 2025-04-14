package study_java.collections_and_generics;

import java.util.Vector;

import javax.swing.tree.VariableHeightLayoutCache;

public class collection_and_generic {
    public static void main(String[] args) {

        // 벡터 클래스 선언
        Vector<Integer> v = new Vector<Integer>();

        /*
         * 에러 객체 변수가 기본데이터로 선언되어 있음
         * int a;
         * Vector<a> A = new Vector<Integer>();
         */

        // 제너릭 선언
        Box<Integer> box = new Box<>(3); // ! 꼭 변수의 타입을 정해줘야 한다
        // int 는 일반 데이터 형이라 선언시 에러발생! 비슷하지만 다른 Integer를 선언하자.

    }

}

// 제너릭 선언 기초
class Box<T> // 타입 이름, T의 변수 타입은 선언할때 설정한다.
{
    private T item; // T라는 타입을 지닌 item 변수 생성

    // 타입만 제외하고는 클래스 하듯이 하면 된다.

    // void가 있으면 생성자로 취급 안함!!
    public Box(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}
