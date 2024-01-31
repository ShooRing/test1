package exsample;

import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    //키보드로 부터 이름과 나이를 입력받기
    // 이름 : 문자 / 나이 : 숫자
    Scanner scanner = new Scanner(System.in);
    String name = " ";
    int age = 0;
    System.out.print("이름 : "); //console 대기
    name = scanner.nextLine();

    System.out.print("나이 : "); //console 대기
    age = scanner.nextInt();
    //----출력----
    System.out.println("당신의 이름은 "+name+" 이고 나이는 "+age+"세 입니다.");
  }//main
}//class
