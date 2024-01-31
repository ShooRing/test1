package loopcon;

public class While1 {
  public static void main(String[] args) {
    //무한루프 처리할 때 많이 사용한다.
    /*
     초기값 ;
     while (조건식) {
     실행문
     증감식
    */
    //1~10 합을 구하자
    //총 합 : XX
    int x = 0, sum = 0;
    while (x <= 10 ){
      sum+= x;
      x++;
    }
    System.out.println("x : "+x+" sum :"+sum);
    System.out.println(" 총합 :"+sum);

    System.out.println("-------------------------");
    //1부터 30까지의 짝수의 합
    int i = 0, sum2=0;
    while (i<=30){
      if (i % 2 != 1)
      sum2+= i;
      i++;
    }
    System.out.println("i : "+i+" sum2 :"+sum2);
    System.out.println("총합 :"+sum2);




  }

}

/*
  ○ 0~9 까지 출력
    int x = 0;
    while (x < 10) {
      System.out.println("현재값" + x);
      x++;
    }*/