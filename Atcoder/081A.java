public class ABC081A {
  import java.util.*;
public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
    int count = 0;
    
     for (int i = 0; i<s.length(); i++){
       
       		//s配列のi番目が1ならビー玉を置く
            if (s.charAt(i) == '1'){
                count++;
            }
        }
    
    System.out.println(count);
  	}
  }
}