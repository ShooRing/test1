package condition;

public class Switch4 {
  public static void main(String[] args) {
    //짝수, 홀수 구하기 : if문 , 삼항연상자를 쓰는걸 추천한다
    int num = 6;
    switch (num % 2){ //추천하지 않는 방식
      case 0 :
        System.out.println("짝수"); break;
      default:
        System.out.println("홀수");
    }
  }
}
