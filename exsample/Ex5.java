package exsample;

import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    /* 정수를 키보드로 받기
          nextInt : 공백 전까지 정수를 찾는다
       입력받은 값이 짝수, 홀수
       결과 : 입력한 정수 30은 짝수
     */
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    System.out.print("정수입력 : "); //console 대기
    num = scanner.nextInt();

    if (num % 2 == 0 ) {
      System.out.println("입력한 정수 " + num + " 은 짝수 입니다.");
    }else {
      System.out.println("입력한 정수 " + num + " 은 홀수 입니다.");
    }//if


  }//main
}//class