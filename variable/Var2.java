package variable;

public class Var2 {
  public static void main(String[] args) {
    int a = 10 ; //선언과 동시에 초기화
    int b = 20 ;
    int c = 30 ;
    int d = 40 ;

    //재할당 : 값을 다시 지정한다.
    //재선언은 할 수 없다.
    //int a = 500 <또하면 에러

    a = 100;
    b = 200;
    //출력 ("문자열" + 변수 ) + : 연결
    //sout
    System.out.println("a:"+a);
    System.out.println("b:"+b);
    System.out.println("c:"+c);
    System.out.println("d:"+d);
    System.out.println("a+d:"+a+d);
  }
}
