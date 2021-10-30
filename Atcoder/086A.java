public class ABC086A {
  import java.util.*;
  public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      
      int c = a * b;
      String res = "";
      
      if(c % 2 != 0){
        res = "Odd";
      } else {
        res = "Even";
      }
	System.out.println(res);
  }
}
}