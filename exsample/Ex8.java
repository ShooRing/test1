package exsample;

import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int price , age , discount=0;
    System.out.print("가격:");
    price = scanner.nextInt();
    System.out.print("나이:");
    age = scanner.nextInt();

    //--------------------------if--------------------------
    if( price >= 10000) { //가격할인
      discount += 1000;
      System.out.println("10000원 이상 구매시, 1000원 할인");
    }//if1
    if(age<=10){ //나이할인
      discount+= 1000;
      System.out.println("어린이는 1000원 추가 할인");
    }//if2
    System.out.println("총 할인 금액 : "+discount+"원");
  }//main
}//class








/*
  public class Ex8 {
  public static void main(String[] args) {
    int price , age , discount=0;
    price = 20000;
    age = 10;


  //--------------------------if--------------------------
    if( price >= 10000) { //가격할인
      discount += 1000;
      System.out.println("10000원 이상 구매시, 1000원 할인");
    }//if1
    if(age<=10){ //나이할인
      discount+= 1000;
      System.out.println("어린이는 1000원 할인");
    }//if2
    System.out.println("총 할인 금액 : "+discount+"원");
    */