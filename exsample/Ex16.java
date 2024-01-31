package exsample;

import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int num1=0, num2=0, num3=0, result=0;
    String op="end,+,-,*,/,%";                          //op에 문자열 연산자 입력
    System.out.println("계산기 만들기");

    while (true){
      System.out.println("=========================");
      System.out.print("첫번째 정수: ");
      num1=scanner.nextInt();
      System.out.print("두번째 정수: ");
      num2=scanner.nextInt();
      System.out.println("연산자 선택  : end,+,-,*,/,%");   //연산자 수정
      System.out.print("선택 : ");
      scanner.nextLine();
      op=scanner.nextLine();

      if(op.equals("end")) {                               //op로 수정
        System.out.println("계산기 프로그램 종료");
        break;
      }//if

      switch (op) {                                        //간단하게 수정 정리
        case "+": result = num1 + num2; break;
        case "-": result = num1 - num2; break;
        case "*": result = num1*num2; break;
        case "/": result = num1/num2; break;
        case "%": result = num1%num2; break;
        default: System.out.println("잘못된 연산자 입니다.");
      }//switch
      if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")||op.equals("%")){ //범위설정
      System.out.println(num1+op+num2+"="+result);
      }//if
    }//while
  }//main
}//class












/*
* package exsample;

import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int num1=0, num2=0, num3=0, result=0;
    String op="";
    System.out.println("계산기 만들기");
    while (true){
      System.out.println("=========================");
      System.out.print("첫번째 정수: ");
      num1=scanner.nextInt();
      System.out.print("두번째 정수: ");
      num2=scanner.nextInt();
      System.out.println("연산자 선택  : 종료 : 0 , 1:+, 2:-, 3:*, 4:/, 5:%");
      System.out.print("선택 : ");
      num3=scanner.nextInt();
      if(num3==0) {
        System.out.println("계산기 프로그램 종료");
        break;
      }//if

      switch (num3) {
        case 1:
          result = num1 + num2;
          op = "+";
          break;
        case 2:
          result = num1 - num2;
          op = "-";
          break;
        case 3:
          result = num1*num2;
          op = "*";
          break;
        case 4:
          result = num1/num2;
          op = "/";
          break;
        case 5:
          result = num1%num2;
          op = "%";
          break;
        default:
          System.out.println("잘못된 연산자 입니다.");
      }//switch
      if(num3>=1&& num3<=5){
      System.out.println(num1+op+num2+"="+result);
      }//if
    }//while
  }//main
}//class
* */