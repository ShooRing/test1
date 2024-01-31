package operator;

public class Oper1 {
  //1. 산술연산자 +,-,*,/,%
  public static void main(String[] args) {
    int a , b ;
    int sum, sub, div, mod ,mul;
    a=30;
    b=4;

    sum= a+b;
    sub= a-b;
    div= a/b; // 0으로는 나눌 수 없다
    mod=a%b; // int % int = int
    mul=a*b;
    //double mod  = (double) a % b  => 둘 중 하나를 형태 변환


    System.out.println("합 : "+sum);
    System.out.println("차 : "+sub);
    System.out.println("곱 : "+mul);
    System.out.println("몫 : "+div);
    System.out.println("나머지 : "+mod);

  }}
