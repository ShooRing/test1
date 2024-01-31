package loopcon;

public class Break1 {
  public static void main(String[] args) {
    //반복문 안에 특정 조건을 만나면 중단
    //for + if + break : 횟수,개수에 만나 중단될 때
    //while + if + break : 무한루프 중단할 때
    //1~10 반복처리 (for문) 5가 되면 중단한다.
    for(int i =1; i<=10 ; i++){ //1부터, 10까지, 1씩증가할 것인데
      System.out.println(i); // 숫자를 출력할것이다.
      if(i==5){ // 만약 숫자가 5가 된다면
        break; //중단해라.
      }//end if
    }//end for
  }
}
