package exsample;

import java.util.Scanner;

/*문제3)
키보드로 받기

foodName : 음식명
foodPrice : 음식가격
foodQuantity:음식수량

주문음식: xx
주문수량: xx  개
주문 총 금액: xx */
public class Ex7 {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    String foodName="";
    int foodPrice=0, foodQuantity=0, foodTotal=0;

    System.out.print("음식이름:");
    foodName = scanner.nextLine();
    System.out.print("음식가격:");
    foodPrice = scanner.nextInt();
    System.out.print("음식수량:");
    foodQuantity = scanner.nextInt();
    foodTotal=foodPrice*foodQuantity;
    System.out.println("-----------------------------------");
    System.out.println("주문음식 : "+foodName+"         "+foodPrice);
    System.out.println("주문수량 :              "+foodQuantity);
    System.out.println("주문 총 금액 :          "+foodTotal);


  }//main
}//class
