package exsample;

import java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int num = 0, money=0, inMoney=0, outMoney=0;

    while (true){
      System.out.println("=========================");
      System.out.println("1.예금 2.출금 3.잔고 4.종료");
      System.out.println("=========================");
      System.out.print("선택 > ");
      num=scanner.nextInt();
       if (num==1) {
         System.out.print("1.예금");
         money=scanner.nextInt();
         inMoney=money+inMoney;
         System.out.println("예금액>"+inMoney);
       }else if (num == 2) {
         System.out.print("2.출금");
         outMoney=scanner.nextInt();
         System.out.println("출금액>"+outMoney);   //if 양수,양수 - 음수:대출
       }else if (num == 3) {
         System.out.println("잔고>"+(inMoney-outMoney)+"원");
       }else if (num == 4) {
         System.out.print("4.종료");
         break;
       }else {
         System.out.println("잘못 입력했습니다.");
       }//if
    }//while
  }//main
}//class