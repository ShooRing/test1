package exsample;
//while문
public class Ex3 {
  public static void main(String[] args) {
    //1부터 10까지의 합을 구하라
    int i = 1 , max = 10, sum = 0 ; //1부터 ; 10까지 ; 0부터더할것임
    while (i<= max ){
      //실행문, 출력문...
      sum += i;
      //증감식
      i++;
    }//end while
    System.out.println("합 : "+sum);
  }//end main
}//end class
