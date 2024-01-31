package condition;

public class Switch2 {
  public static void main(String[] args) {
    /*
    변수 선언 정수형 : 초기값은 선언하는것이 좋다
    자바 : 처음 실행을 모두 처리한 후 실행 (에러의 경우의 수가 없어야함)
    * 회원등급 쿠폰을 발급하기
    * 회원 등급 (1,2,3 => grade)
    * 쿠폰 : coupon
    * 1등급 : 쿠폰 3000원
    * 2등급 : 쿠폰 3000원
    * 3등급 : 쿠폰 1000원
    * 그 외 : 쿠폰 500원
    * */

    //if문 : 조건 관계 비교 산술등 - true / false
    //~와 같다 : 분기형 switch ~ case 문 (처리속도가 빠르다.)

    int coupon, grade = 5;
    switch (grade) {//swich (변수)
      case 1: //grade가 1과 같으면, if(grade ==1)
        coupon = 3000;
        break;

      case 2: case 5: coupon = 2000 ; break; //if (grade ==2||grade==5)
      case 3: case 7: coupon = 1000 ; break;
      default:coupon = 500;
    }
    System.out.println(grade +"등급, 쿠폰"+coupon); //문장사이에 쉼표X
  }}




/* String name="00의 쿠폰발급";
    double rating = 2;
    String result = ( rating <= 1)? "3000" : (rating <=2)?"2000": (rating <=3)?"1000":"500";
    System.out.println("해당등급은 "+result+"원 쿠폰 발급");

     int coupon, grade = 2;
    if (grade == 1) {
      coupon = 3000;
    } else if (grade == 2) {
      coupon = 2000;
    } else if (grade == 3) {
      coupon = 1000;
    } else {
      coupon = 500;
    }
    System.out.println(grade + "등급 / 쿠폰발급 : " + coupon+"원");





    int coupon, grade = 3;
    if (grade <= 3) {
      coupon = 3000;
    } else {
      coupon = 500;
    }
    System.out.println(grade + "등급 / 쿠폰발급 : " + coupon + "원");



-스위치문
  int coupon, grade = 2;
    switch (grade) {//swich (변수)
      case 1: //grade가 1과 같으면, if(grade ==1)
        coupon = 3000;
        break;

      case 2: coupon = 2000 ; break;
      case 3: coupon = 1000 ; break;
      default:coupon = 500;
    }
    System.out.println(grade +"등급, 쿠폰"+coupon); //문장사이에 쉼표X
  }}
}*/


