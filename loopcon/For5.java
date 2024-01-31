package loopcon;

public class For5 {
  public static void main(String[] args) {
    //1부터 35까지 짝수의 합을 구하시오
    int sum1 = 0, sum2 = 0;
    for(int i =1; i <=35; i++) {
      if (i % 2 != 1) {
      }//end for
      sum1 += i;
    }
    System.out.println("1부터 35까지의 짝수 합 :" + sum1);

    //0부터 50까지 홀수의 합을 구하시오
    for(int i =0; i<50; i++) {
      if (i % 2 == 1) { //if(i%2!=0){
        sum2 += i;
      }
    }//end for
    System.out.println("0부터 50까지의 홀수 합 :" + sum2);



  }}