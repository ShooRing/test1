package operator;

// 증감연산자
// ++(--) 변수 : 전위형, 변수(--)++ : 후위형
public class Oper9 {
  public static void main(String[] args) {
    int x = 1;
    int y = 0;
    y = ++x ; // x값 1증가 먼저시키고 그 결과값을 y에 대입
    System.out.println("x :" + x + ", y :" + y ); //x :2, y :2

    x = 1;
    y = 0;
    y = x++; // x의 현재값(1)을 y에 먼저 대입, 그후 x값을 1증가
    System.out.println("x :" + x + ", y :" + y );
  }
}
