package condition;

public class Switch3 {
  public static void main(String[] args) {
  //month =1,3,5,7,8,10,12  day = 31
  //month =2 , day = 29
  //month =4,6,9,11 day = 30

    int month = 1; //월을 입력하면 날짜수가 나오도록 한다 if문
    String result =""; //result = null
      if(month == 1 || month == 3|| month == 5|| month == 7|| month == 8|| month == 10|| month == 12) {result = "31";}
      else if (month == 2){result = "29";}
      else if (month == 4|| month == 6|| month == 9|| month == 11) {result = "30";}
      else {result="해당 월은 존재하지 않습니다.";}
          System.out.println(month+"월은 "+result+"일까지 입니다");

  }}

  /*
  int month = 11; //월을 입력하면 날짜수가 나오도록 한다 - 스위치문
    String result =""; //result = null
      switch (month){
    case 1,3,5,7,8,10,12: result="31"; break;
    case 2: result="29"; break;
    case 4,6,9,11: result="30"; break;
      default:  System.out.println("해당 월은 존재하지 않습니다");
          }
    System.out.println(month+"월은 "+result+"일까지 입니다");







  public class Switch3 {
  public static void main(String[] args) {
    int month = 6; //월을 넣으면 계절이 나오도록 한다
    String result;

   if(month >=3 && month <= 5) {
     result = "봄";
   } else if (month >=6 && month <=8) {
     result = "여름";
   } else if (month >=9 && month <=11) {
     result = "가을";
   } else if (month <=2 || month >=12) {
     result = "겨울";
   } else  {
     result = "잘못된 월";
   }
    System.out.println(month+"월은 "+result+" 입니다");





  //if(month>=1 && month <= 12 ){
    //System.out.println(month+"월은 "+result+" 입니다");
   int month = 10; //월을 넣으면 계절이 나오도록 한다.
    String result =""; //result = null

    switch (month){
      case 3: case 4: case 5: result="봄"; break;
      case 6,7,8: result="여름"; break;
      case 9,10,11: result="가을"; break;
      case 12: case 1: case 2: result="겨울"; break;
      default:  System.out.println("해당 월은 존재하지 않습니다");
    */
