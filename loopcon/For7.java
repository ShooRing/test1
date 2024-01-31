package loopcon;

import java.util.Scanner;

public class For7 {
  public static void main(String[] args) {
  //1부터 9까지 연속출력 (for)
  //result dan
    //문제 : 단을 키보드로 입력받기로 수정하라
   /* int dan = 2, result = 0; //항상 제일먼저 해야함
    for(int i = 1; i<=9;i++){
      result= dan*i;
      System.out.println(dan+" X "+i+" = "+result);
    }*/

    Scanner scanner = new Scanner(System.in);
    int dan =  scanner.nextInt(), result = 0;
    for(int i = 1; i<=9;i++){
      result= dan*i;
      System.out.println(dan+" X "+i+" = "+result);
    }

  }//main
}//class

/*
*
* 2단
* 2x1=2
* 2x2=4
* ...
* 2x9=18
*
* */
