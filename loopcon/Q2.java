package loopcon;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    int num1, num2, result, num3 = 0;
    Scanner scanner = new Scanner(System.in); //외부로부터 입력받아라

    System.out.println("정수1 : ");
    num1 = scanner.nextInt();// 외부에서 입력받을 정수
    System.out.println("정수2 : ");
    num2 = scanner.nextInt();// 외부에서 입력받을 정수
    System.out.println("연산자 : ");
    num3 = scanner.nextInt();// 외부에서 입력받을 정수
  }
}
