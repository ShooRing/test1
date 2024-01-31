package loopcon;

import java.util.Scanner;

public class Q {
  public static void main(String[] args) {
    int num1, num2, sum = 0; //정수2개와 덧셈 필요
    Scanner scanner = new Scanner(System.in); //외부로부터 입력받아라

    while (true) { //무한루프로 실행
      System.out.println("===두 수의 합===");
      System.out.print("정수1: "); //정수1: 출력
      num1 = scanner.nextInt();// 외부에서 입력받을 정수
      System.out.print("정수2: ");//정수2: 출력
      num2 = scanner.nextInt(); // 외부에서 입력받을 정수
      if (num1 == 0 && num2 == 0) {//정수 둘 모두 0이면
        System.out.println("종료");
        break;//실행중지
      }//end if
      sum = num1 + num2; //외부에서 입력받은 두 정수의 합계
      System.out.println("합계 : " + sum); //합계출력
    }//end while
  }//end main
}
