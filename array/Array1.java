package array;

public class Array1 {
  public static void main(String[] args) {
    //음식주문 - 문자열
    //배열선언 : 타입이 동일한 연속공간 선언

     //생성타입 이름 = new 타입[개수]
    //String foods[] = new String[5];
    //String foods[] = new String[]{};

    //String[] foods = new String[]{"라면", "김밥", "우동", "소바", "쫄면"};
                                      //값이 간단하면 초기화
    String[] foods = {"라면", "김밥", "우동", "소바", "쫄면"};
      for( int i = 0; i < foods.length; i++){
      System.out.println(foods[i]+ " 하나 주문 ");}



      //다른 자료형
    int[]x=new int[3];
      x[0] =10;
      x[1] =20;
      x[2] =30;

      double[]d=new double[]{10.2,11.6,20.33};
      boolean[]b={true, false, true};


  }//main
}//class




/*
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●Step 1
//음식주문 - 문자열
* 변수로 처리할 경우
* 단, 주문자가 30명 일때는...? 코드도 30줄.

    String food1 = "라면";
    String food2 = "김밥";
    String food3 = "우동";
    String food4 = "소바";
    String food5 = "쫄면";

    System.out.println(food1+ " 하나 주문 ");
    System.out.println(food2+ " 하나 주문 ");
    System.out.println(food3+ " 하나 주문 ");
    System.out.println(food4+ " 하나 주문 ");
    System.out.println(food5+ " 하나 주문 ");
    System.out.println("하겠습니다. 주문완료");
 *
 *
 *
 *
●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●Step 2
     //음식주문 - 문자열
    //배열선언 : 타입이 동일한 연속공간 선언

    //String[] foods = new String[5]; //생성타입 이름 = new 타입[개수]
    String foods[] = new String[5];

    foods[0] = "라면";
    foods[1] = "김밥";
    foods[2] = "우동";
    foods[3] = "소바";
    foods[4] = "쫄면";

    System.out.println(foods[0]+ " 하나 주문 ");
    System.out.println(foods[1]+ " 하나 주문 ");
    System.out.println(foods[2]+ " 하나 주문 ");
    System.out.println(foods[3]+ " 하나 주문 ");
    System.out.println(foods[4]+ " 하나 주문 ");
    System.out.println("하겠습니다. 주문완료");






 ●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●Step 3
     //음식주문 - 문자열
    //배열선언 : 타입이 동일한 연속공간 선언

    //String[] foods = new String[5]; //생성타입 이름 = new 타입[개수]
    String foods[] = new String[5];

    foods[0] = "라면";
    foods[1] = "김밥";
    foods[2] = "우동";
    foods[3] = "소바";
    foods[4] = "쫄면";

  //  for( int i = 0; i <=4; i++){
      for( int i = 0; i < foods.length; i++){
      System.out.println(foods[i]+ " 하나 주문 ");}
    System.out.println("하겠습니다. 주문완료");



 * */