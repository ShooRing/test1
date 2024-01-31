package loopcon;

import java.util.Scanner;

public class Scanner2 {
  public static void main(String[] args) {

    //외부(키보드)로부터 정수 2개를 입력받아서 합계를 구하시오

    int num1 , num2 , sum = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수1: ");
    num1 = scanner.nextInt();
    System.out.print("정수2: ");
    num2 = scanner.nextInt();
    sum = num1 + num2;
    System.out.println("합계 : " + sum);


  }
}
