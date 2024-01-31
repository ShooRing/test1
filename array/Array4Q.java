package array;

public class Array4Q {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i =0; i< args.length;i++){
      arr[i]=250+(5*1);
    }
    for (int i : arr){
      System.out.println("사이즈 " +i+" (재고있음)");
    }
  }
}

/*
* public class Array4Q {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i =250; i<=295;i+=5){
      System.out.println("사이즈 " +i+" (재고있음)");
    }
* */