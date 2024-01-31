package loopcon;

public class For8 {
  public static void main(String[] args) {
    //별찍기
    for(int i=0; i<5; i++){
      for(int j=0; j<(5-i); j++){   // ▶ 모양
        System.out.print(" * ");
      }//for j
      System.out.println();
    }//for i
  }//main
}//class



/*
 //별찍기
    for(int i=0; i < 5; i++){
      for(int j=0; j<5; j++){
        System.out.print(" * ");
      }//for j
      System.out.println();
    }//for i



    //별찍기 ▶ 모양
    for(int i=0; i<5; i++){
      for(int j=0; j<=i; j++){   // ▶ 모양
        System.out.print(" * ");
      }//for j
      System.out.println();
    }//for i
* */