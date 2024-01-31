package exsample;

import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
//while + true + if + break
    Scanner scanner = new Scanner(System.in);
    //이름입력, 나이
    //이름에 X면 종료
    String name ="";
    int age = 0;
    while (true){ //무한루프
      System.out.print("나이입력: ");
      age=scanner.nextInt();

      System.out.print("이름입력: 종료 (X)");
      scanner.nextLine();//●●●●●●버퍼의 엔터처리●●●●●●
      name=scanner.nextLine();
      //엔터키가 입력되면 지금까지 입력한 모든 내용을 읽는다
      //버퍼에 남아있는 엔터키가 들어간다.
      if(name.equals("x")){
        System.out.println("프로그램 종료");
        break;
      }//if
      System.out.println("이름 : " +name+"     나이 : "+age);


    }//while

  }//main
}//class




/*
package exsample;

import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
//while + true + if + break
    Scanner scanner = new Scanner(System.in);
    //이름입력, 나이
    //이름에 X면 종료
    int num1=0, num2=0, sum=0;
    while (true){
      System.out.println("정수1");
      num1=scanner.nextInt();
      System.out.println("정수2");
      num2=scanner.nextInt();
      if (num1 ==0||num2==0){
        System.out.println("종료");
        break;
      }//if
      sum=num1+num2;
      System.out.println("합"+sum);
      System.out.println("--------");
    }//while

  }//main
}//class
*/