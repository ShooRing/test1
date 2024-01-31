package loopcon;

public class For2 {
  public static void main(String[] args) {
    //0부터 20까지 짝수만 옆으로 나열하여 출력
    // for + if   변수는 i
    System.out.println("-------짝수-------");
    for (int i = 0 ; i <=20 ; i++){
      if( i % 2 ==0){
        System.out.print( i +", ");
      }}
    System.out.println();
    System.out.println();

    System.out.println("-------홀수-------");
    for (int i = 0; i <=20 ; i++){
      if(i%2 !=0){ //==1 나머지가 0이 아니다 = 나머지가 1이다
        System.out.print(i+", ");
      }
    }//end for

    System.out.println();
    System.out.println();


    
  }}