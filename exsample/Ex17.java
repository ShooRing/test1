package exsample;

public class Ex17 {
  public static void main(String[] args) {
    int[] arr; //배열 변수 선언 - 사용자정의
    arr = new int[4]; //배열을 생성하겠다

    arr[0]=10; //배열명[인덱스번호]=값;  -> 인덱스번호는 0부터
    arr[1]=20;
    arr[2]=30;
    arr[3]=40;
    //배열명.length -> 배열의 총갯수 (ex:4개),인덱스 순서 0부터
    //for (int i = 0 ; i <=3; i++) {
    for (int i = 0 ; i < arr.length ; i++) {
      System.out.println("arr[i] : " + arr[i]);
    }//for
  }//main
}//class




/*


package exsample;

public class Ex17 {
  public static void main(String[] args) {
    int[] arr; //배열 변수 선언 - 사용자정의
    arr = new int[4]; //배열을 생성하겠다

    arr[0]=10; //배열명[인덱스번호]=값;  -> 인덱스번호는 0부터
    arr[1]=20;
    arr[2]=30;
    arr[3]=40;

    System.out.println("arr[0] : " + arr[0]);
    System.out.println("arr[1] : " + arr[1]);
    System.out.println("arr[2] : " + arr[2]);
    System.out.println("arr[3] : " + arr[3]);

  }//main
}//class







* int a, b, c, d;
    a=10;
    b=20;
    c=30;
    d=40;
    //각각의 값이 30개 이상일 때 하나씩 변수 선언
    //코드를 줄일수 없다
    System.out.println("a : " + a);
    System.out.println("a : " + b);
    System.out.println("a : " + c);
    System.out.println("a : " + d);
    */