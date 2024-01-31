package loopcon;

public class For6 {
  public static void main(String[] args) {
    for(int i = 0 ; i <=2 ; i++){
      System.out.println("=====이중 for 문 =====");
      for(int j = 0 ; j <=2 ; j++){
        System.out.print("i = " + i+" / j =" + j+" ");
      }//for2
      System.out.println();
    }//for1
  }//main
}//class



/*
*  for 2중 : 변수는 사용자 정의   i,j,k,a,x,z,y...
*
*   for(초기값;조건식;증감식){
*      for(초기값;조건식;증감식){
*       실행문
*     }//for2
*   }for1
*
*
*   for(초기값;조건식;증감식){
*      for(초기값;조건식;증감식){
*       실행문
*     }//for2
*     실행문
*   }for1
*
*
*   for(int i = 0 ; i<=2 ; i++ ){     <행
*      for(int j = 0; j=2 ; j++){     <열
*       실행문
*     }//for2
*   }for1
*
*         열(j)
* 행(i)0 : 0  1  2
* 행(i)1 : 0  1  2
* 행(i)2 : 0  1  2
*
* 행   열
* i=0, j=0
* i=0, j=1
* i=0, j=2
*
* i=1, j=0
* i=1, j=1
* i=1, j=2
*
* i=2, j=0
* i=2, j=1
* i=2, j=2
*
* 실행순서
*   for( 0 ; 1,12 ; 11 ){     <행
*      for(2,13 ; 3,6,9 ; 5,8){     <열
*       4실행문7
*     }//for2
*     10 j for문 벗어남
*   }for1
*
*
* */