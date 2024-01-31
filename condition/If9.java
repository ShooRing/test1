package condition;
//if ~ else
// 정수 num의 결과 5의 배수 , 5의 배수가 아니다 
public class If9 {
  public static void main(String[] args) {
    int num = 20 ;
    if( num % 5 == 0 ) { 
      System.out.println("5의 배수");
    }else{
      System.out.println("5의 배수가 아니다");
    }
  }
}


/*
int num = 20 ;
    if( num % 2 == 0 ) { // num이 2로 나눈 나머지가 0이면 짝수
      System.out.println("짝수");
    }else{
      System.out.println("홀수");
    }

* */