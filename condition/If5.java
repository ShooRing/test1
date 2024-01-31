package condition;
// 단일 if문
/*
num = 0
양수입니다.
음수입니다.
0입니다.
*/
public class If5 {
  public static void main(String[] args) {
    int num = 10;
    if( num > 0 ) {
      System.out.println("양수");
    }
    if( num < 0 ) {
      System.out.println("음수");
    }
    if( num == 0 ) {
      System.out.println("0입니다.");
    }
  }
}
