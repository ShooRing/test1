package variable;  //폴더

public class Var1 {
  public static void main(String[] args) {
      int a = 100; // a 변수 (그릇) 100값을 대입(치환)
      int score = 80;
      char ch ='A';
      String str1 = "B"; //문자열 , 문자 -> String 으로 사용. char 많이사용 X
      String str2 = "안녕 자바";
      boolean done = true ;
      byte b = 127;
      short s = 32767;
      double num1 = 10.1; //실수 기본형
      float num2 = 10.2f; //정밀도가 떨어짐. 맨뒤에 f,F 가 들어감

    System.out.println(a);
    System.out.println(score);
    System.out.println(ch);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(done);
    System.out.println(b);
    System.out.println(s);
    System.out.println(num1);
    System.out.println(num2);

  }
}
/*
* 변수 : 변하는 값을 저장하는 저장공간 (메모리공간)
* 예) 아이디, 이메일, 비밀번호, 상품명, 상품 개수, 주민번호 등등
*
* 이름규칙 : 변수규칙
* 1. 영문, 숫자, _, $ 사용가능
* 2. 첫글자는 숫자를 제외한다. (단, 영문자 소문자로 시작: 클래스명 첫글자가 대문자라서)
* 3. 한글은 가용하지만 권하지 않음
* 4. 공백 미포함, 특수문자 _, $ 제외 사용
* 5. 예약어 (자바 명령어) 사용불가
* 6. 두 단어가 합쳐지면 두번째 첫단어 글자는 대문자 (낙타 표기법:카멜케이스)
*   myName, dogCat
* 7. 이름은 의미에 맞는 영문이름
* 8. 클래스명 : 첫글자는 대문자
                두 단어가 합쳐지면 낙타표기법
                * DogCat / MyName
                *
  * 타입
  * 정수 : int 기본 / 20억이 넘으면 long
  * 실수 : double 기본
  * float: 정밀도가 떨어져 거의 사용하지 않음
  * boolean: 논리값 true / false

 * 타입: 그릇1 = 물; (숫자,문자,논리값 등)
  물을 가져오고싶을 떄 : 그릇1에 담아 오는 용도
  타입: 그릇2 = 국;
  대소문자 구분함*/