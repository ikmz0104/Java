public class ABC085B {
  import java.util.*;

  public class Main {
	public static void main(String[] args) {
        //標準入力を取得
		Scanner sc = new Scanner(System.in);
      	//Integer.parseIntを使って数値変換し、nextLineで1行を読み込む
		int N = Integer.parseInt(sc.nextLine());
		//リスト生成後、配列の要素をリストに繰り返し詰めこむにてぃ
		List<Integer> square = new ArrayList<>();
      
		for (int i = 0; i < N; i++) {
    	square.add(Integer.parseInt(sc.next()));
		}
      
      	Collections.sort(square);
		Collections.reverse(square);
		int count = 1;
		int under = 0;
		for (int i = 1; i < square.size(); i++) {
			under = square.get(i - 1);
			if (under > square.get(i))
				count++;
		}
		System.out.println(count);
		sc.close();
    }
  }

}