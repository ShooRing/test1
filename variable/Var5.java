package variable;
public class Var5 {
  public static void main(String[] args) {

    String name = "홍길동";
    String year = "2023년";
    String month = "1월";
    String day = "20일";
    String tel = "010-1111-2222";
    boolean merried = false;


    System.out.println("이름 : " + name);
    System.out.println("생일 : " + year+month+day);
    //int 로 연원일을 생성후 year+"년"+month+"월"+day+"일" 로 작성할 수 있다.
    System.out.println("연락처 : " +tel);
    System.out.println("결혼 : " +merried);

  }
}
