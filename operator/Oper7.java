package operator;
//이름, 국어점수, 영어점수, 수학점수의 합계와 평균을 구하라

public class Oper7 {
  public static void main(String[] args) {
    String name="김뫄뫄";
    int kor,eng,mat,sum;
    double avg;
    kor=80;
    eng=70;
    mat=97;
    sum=kor+eng+mat;
    avg=sum/3.0;
    
    System.out.println("이름 :" + name);
    System.out.println("국어 :" + kor);
    System.out.println("영어 :" + eng);
    System.out.println("수학 :" + mat);
    System.out.println("합계 :" + sum);
    System.out.println("평균 :" + avg );




  }
}
