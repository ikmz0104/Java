public class ABC083B {
  import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
      //標準出力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      
      int origin=0;
      int sum=0;
      int result =0;
 
      for(int i=1; i<=N; i++) { //N以下の正の整数ループ
	      origin=i;
	      sum=0;
    	  while(origin>0) { //正の整数である限り以下のループ
	    	  sum=sum+(origin%10); //初期を10で割った余りを足す
	    	  origin=origin/10; //そして10で割って上書き
	      }
    	  if(A<=sum && sum<=B) {
    		  result=result+i;
    	  }
      }
 
      System.out.println(result);
 
    }
}

}