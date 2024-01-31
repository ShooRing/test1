package array;

import java.util.Scanner;
//음식주문 , 키보드로받기 , 4개, for문, 입력for, 출력for

public class Array2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] foods=new String[5];
    for(int i = 0;i<foods.length; i++){
      System.out.println((i+1)+"번째사람 메뉴주문>");
      foods[i]=scanner.nextLine();
          //foods[0]~foods[4]
      }//for

    //배열의 방의 개수 - 배열명.length
    for( int i = 0; i < foods.length; i++){
      System.out.println(foods[i]+ " 하나 주문 ");}

    //확장 for문 : for~each문
    /*
    * for(타입 변수 : 배열){
    * 배열의 개수만큼 반복
    * 반복하면 변수 각각의 값을 대입
    * }
    * */
    for(String item : foods){
      System.out.println("확장 for:"+item);

    }//for~each
  }//main
}//class
