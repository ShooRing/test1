package loopcon;

public class Test {
  public static void main(String[] args) {
    /*
    * 반복문
        * 1. for : 횟수가 정해져 있을 때 (몇 번 반복 하라)
            *for (초기값 ; 조건식 ; 증감식 {
            * 실행문 (조건이 true 일 때 실행되는 부분)
            * }

            *초기값 : 시작값 변수 i j k 순으로
            *조건식 : ~까지 , 관계연산자 true/false
            *증감식 : ++변수 ,--변수, 수식을 쓸 때

        * 2. while : 무한 반복 + if문 + break (조건이 만족할때 그만해라)
        *           아이디, 비번 등 여러번 반복 입력한 경우
        *           게임 exit 하면 중단하는 경우
        *           메뉴 선택시
        * 3. do~while : 조건에 만족하지 않아도 무조건 한번 실행
    * */
  /*int num = 0;
  num++; // num = num +1, num +=1
    System.out.println("현재 값"+num);

    num++; // num = num +1, num +=1
    System.out.println("현재 값"+num);

    num++; // num = num +1, num +=1
    System.out.println("현재 값"+num);
    결과 >
    현재 값1
    현재 값2
    현재 값3*/
    /*
    1~4까지 출력 예제
    반복회수 : i가 1부터 4까지 1씩 증가
    규칙성 : 숫자를 1부터 4까지
    반복회수 초기화, 조건식 증삼식으로 결정
    규칙성 실행문을 결정한다
     */

    for( int i = 1 ; i <= 4 ; i++){
      System.out.println("현재값:"+i);
    }//end for
  }
}


