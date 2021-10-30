public class ABC086A {
import java.util.Scanner;

  public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     	int N = sc.nextInt(); //合計枚数
      	int Y = sc.nextInt(); //合計金額

      	boolean B = false; //Yの値は不確か

      	for(int i = 0; i <= N; i++) { //１万円札がN枚以下
        	for(int j = 0; j <= N-i; j++) {	//５千円札がi枚を超えない
            int k = N - i - j; //千円札は残った枚数でしかない（拘束条件式）
      		int sum = 10000*i + 5000*j + 1000*k; //結果的合計金額
            
          	  if(sum == Y) { //結果的合計金額が入力金額と一致したら
          		System.out.println(i + " " + j + " " + k);
                B = true; //嘘をついていない（Yの値は確か）
    	    	break; //forループからすべて抜ける
    	      }
          	}
          if(B) {
            break;
          }
      	}
      
      	if(!B) { //Yの値は不確かなので以下を出力
    	  System.out.println("-1 -1 -1");
      	}
    }
}
}