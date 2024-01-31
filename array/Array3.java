package array;

public class Array3 {
  public static void main(String[] args) {
    // 배열 3 -> 각각 A코드, B코드, C코드 를 담는다.
    // 1차원 배열
    String[] arrA = {"A1", "A2", "A3"};
    String[] arrB = {"B1", "B2", "B3"};
    String[] arrC = {"C1", "C2", "C3"};
    System.out.println("arrC[1]:" + arrC[1]);
    System.out.println("==========================");

    // 2차원 배열
    //String[][] arrs=new String[][]{};
    String[][] arrs = new String[][]{
        {"A1", "A2", "A3"},
        {"B1", "B2", "B3"},
        {"C1", "C2", "C3"}
    };
    System.out.println("A2  :  " + arrs[0][1]);
    System.out.println("C3  :  " + arrs[2][2]);
    System.out.println("==========================");

/*  String[][] arrs=new String[][]{
    행   열0    1    2
     0   {"A1","A2","A3"},
     1   {"B1","B2","B3"},
     2   {"C1","C2","C3"}
  */

    //2차원 배열 2중 for문 출력
    for (int i = 0; i <= 2; i++){  //[행][열] -> i행  가로
      for (int j = 0; j <= 2; j++){  //[행][열] -> j열  세로
        System.out.print(arrs[i][j] + " ");
      }//for j
      System.out.println();
    }//for i

    System.out.println("==========================");

    //2차원 배열 2중 for문 출력  자동수정 버전
    for (int i = 0; i < arrs.length; i++){  //[행][열] -> i행  가로
      for (int j = 0; j < arrs.length; j++){  //[행][열] -> j열  세로
        System.out.print(arrs[i][j] + " ");
      }//for j
      System.out.println();
    }//for i


    String[][] arr1 = new String[][]{
        {"A1", "A2", "A3"},
        {"B1", "B2", "B3", "B4"},
        {"C1", "C2", "C3", "C4", "C5"}
    };
    System.out.println("2차원 배열, 열의 개수 다르게");
    for (int i = 0; i < arrs.length; i++) {  //[행][열] -> i행  가로
      for (int j = 0; j < arrs.length; j++) {  //[행][열] -> j열  세로
        System.out.print(arrs[i][j] + " ");
      }
      System.out.println();
    }

  }//main
}//class