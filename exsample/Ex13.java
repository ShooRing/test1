package exsample;

import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = "";
    String hak="";
    int kor,eng,mat,sum=0;
    double avg;
    System.out.print("이름 : ");
    name = scanner.nextLine();
    System.out.print("국어 : ");
    kor = scanner.nextInt();
    System.out.print("영어 : ");
    eng = scanner.nextInt();
    System.out.print("수학 : ");
    mat = scanner.nextInt();

    sum=kor+eng+mat;
    avg=(double) sum/3;
    System.out.println("------------");
    System.out.println("총점 : "+sum);
    System.out.println("평균 : "+avg);

    if (avg >= 90) {
      hak="A";
    } else if (avg >= 80) {
      hak="B";
    } else if (avg >= 70) {
      hak="C";
    } else if (avg >= 60) {
      hak="D";
    } else {hak="F";}
    System.out.println( name+"의 총점은"+sum+ "이고 평균은 "+avg+"이며 학점은 " +hak+" 입니다.");

  }//main
}//class
