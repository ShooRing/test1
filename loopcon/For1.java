package loopcon;

public class For1 {
  public static void main(String[] args) {
    //1부터 10까지 1씩 증가하도록.
    //반복문 변수는 임의설정 가능 i j k ...a x ...
    for( int i = 1 ; i < 11; i++){
    //i 변수는 {}스코프(영역) 안에서 사용 - 지역변수
      System.out.print(", "+i);
    }//end for
    System.out.println("");

    System.out.println("-------2번째-------");
    /*{for(int i = 1; i<=10; i=i+1);
    System.out.print(", "+ i);
  }//end for */
}}