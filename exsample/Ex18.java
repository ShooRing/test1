package exsample;

import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    //입력for / 출력for
    //kor 배열선언 5개
    Scanner scanner = new Scanner(System.in);
    int[] korScores;
    korScores = new int[5];
    int sum = 0;
    double avg = 0.0;
    //입력
    for (int i = 0; i < 5; i++) {
      System.out.print("학생" + (i + 1) + "번의 국어 : "); //i+1: i번호가 0부터 시작하기 때문에
      korScores[i] = scanner.nextInt(); //입력된것
      sum += korScores[i];
    }//for

    //출력
    for (int i = 0; i < korScores.length; i++) {
      System.out.println("korScores[" + i + "] : " + korScores[i]);
    }//for
    //double ●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
    avg = sum / korScores.length;
  //평균 = 합계 / 국어점수. 갯수;
  //학생 n명의 국어점수 합은 nn 이고, 반 평균점수는 nn 입니다.
    System.out.println("학생 "+korScores.length+ "명의 국어점수 합은 " +sum+ "점 이고, 반 평균점수는 "+avg+"점 입니다.");

  }//main
}//class
