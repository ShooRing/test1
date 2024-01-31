package loopcon;

public class Break2 {
  public static void main(String[] args) {
    //while 무한루프 true
    // x 10 이면 중단
    int x = 0;  //0부터 시작한다
    while (true) { //무한반복 할것이다.
      System.out.println(x); //숫자를 출력해라
      if(x==10){ //만약 숫자가 10이 되면
        break; //중단하라
      }
      x++;
    }//end while
  }//main
}
