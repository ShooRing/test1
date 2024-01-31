package loopcon;

public class Continue {
  public static void main(String[] args) {
    //continue 만나면 다시 처음 반복문으로 이동한다.
    // 1~5 실행, 단, 3은 건너뛰기 해야한다.
    //특정 조건을 건너뛰고 나머지만 실행

    for (int i = 1; i <= 5; i++) {  //수가 1부터 5일때까지 하나씩 증가
      if (i % 2==1) //만약 수를 2로나눈 나머지가 1일때 (홀수일때)
      { continue; //for 반복문으로 거슬러 올라가라
      }
      System.out.println( i );

    }
  }

  /*    for (int i = 1; i <= 5; i++) {  //수가 1부터 5일때까지 하나씩 증가
      if (i == 3) //만약 수가 3이라면
      { continue; //초기 반복문으로 거슬러 올라가라
      }
      System.out.println( i );*/
}
