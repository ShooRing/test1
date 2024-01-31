package exsample;

import java.util.Scanner;

//scanner 외부로부터 값을 입력받을 수 있다
public class Ex1 {
  public static void main(String[] args) {
    /*
    *1. 입력 객체 생성 [키보드 입력된 데이터 scanner 객체에 저장]
    *2. 객체 생성 : 클래스명 변수 = new 생성자
    *3. 문자를 키보드로 입력받기 (정수 실수 문자)
    *
    * */
      Scanner scanner = new Scanner(System.in);
    //클래스명  변수   = new  생성자
    String str = "";
//        str = scanner.next(); //띄어쓰기 X
    str = scanner.nextLine(); // 엔터키를 입력하면 지금까지 입력한 모든 내용을 읽는다.
    System.out.println(str);
  }
}
