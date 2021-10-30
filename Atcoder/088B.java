public class ABC088B {
  import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	
      	int N = sc.nextInt();
		    int[] Card = new int[N];
      
      	for(int i=0; i<N; i++) {
          Card[i] = sc.nextInt();
        }
      
      	int Alice_Score = 0;
        int Bob_Score = 0;
        int Card_Count = 0;
      
      	Arrays.sort(Card); //配列の要素を昇順（値が小さい順）でデータを並べ替える
      	for(int i=N-1; i>=0; i--){ //最低限カードは2枚必要である
      		if(Card_Count % 2 == 0) { //アリスは初回を含めた偶数回にカードを引く
          		Alice_Score += Card[i];
        	} else {
          		Bob_Score += Card[i]; //ボブは奇数回にカードを引く
        	}
              	Card_Count++;
        }
          int Math = Alice_Score - Bob_Score;
          System.out.println(Math);
  }
}

}