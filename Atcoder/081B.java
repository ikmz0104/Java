public class ABC081B {
  import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //正の整数の個数
		int[] A = new int[N]; //整数の配列
		int C = 0; //2で割るやつの実行カウント
    boolean B = true;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt(); //書き換える前なので、配列の入力処理を行う
			if (A[i] % 2 != 0) B=false; //奇数なので無視
		}

		while (B) {
			for (int i=0; i<N; i++) {
				if (A[i] % 2 != 0) { //奇数であればループを抜けろ
					B=false;
					break;
				}
				A[i] = A[i] / 2; //配列要素全てを2で割って全体表示
			}
			if (B) C++; //カウント
		}

		System.out.println(C);
		sc.close();
	}
}

}