package exsample;

import java.util.Scanner;

public class Ex9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int price , age , discount=0;
    System.out.print("가격:");
    price = scanner.nextInt();
    System.out.print("나이:");
    age = scanner.nextInt();
    //--------------------------if--------------------------
    if( price >= 10000 && age <=10) { //중복할인
      discount += 2000;
      System.out.println("10000원 이상 구매시, 1000원 할인");
      System.out.println("어린이는 1000원 추가 할인");
    }else if( price >= 10000||age<=10) { //가격할인
        discount += 1000;
        System.out.println("10000원 이상 구매 또는 어린이 1000원 할인");
    }else{
      discount=0;
      System.out.println("할인 항목이 없습니다.");
    }//if

    System.out.println("총 할인 금액 : "+discount+"원");
  }//main
}//class









/*package exsample;

import java.util.Scanner;

public class Ex9 {
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
    }else if(age<=10){ //나이할인
      discount+= 1000;
      System.out.println("어린이는 1000원 추가 할인");
    }else{
      discount=0;
      System.out.println("할인 항목이 없습니다.");
    }//if

    System.out.println("총 할인 금액 : "+discount+"원");
  }//main
}//class*/