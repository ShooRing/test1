package exsample;

import java.util.Scanner;
/*문제2)
1. 정수를 키보드로 받기
     nextInt : 공백전까지 정수를 찾기
2. 정수를 입력한만큼 반복 for문
3. 짝수의 합구하기 if문
3. 결과 : 총 짝수의 합은 : xx */
public class Ex6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0, i=0, sum=0;
    System.out.print("정수 입력:");
    num= scanner.nextInt();
        for(i=0;i<=num;i++){
          if(i%2==0){
            sum+=i;
          }//if
        }//for
    System.out.println("총 짝수의 합 : "+sum );
  }//main
}//class
