public class ABC086C {
  import java.util.Scanner;
   public class Main {
      public static void main(String[] args) {
        //標準入力
        Scanner stdln = new Scanner(System.in);
        int N = stdln.nextInt();
        int[] dir = { 1, -1 }; //方向づけ
        int dft = 0; //defaultx（開始時点）
        int dfx = 0;
        int dfy = 0;
        int dift = 0;
        int difx = 0;
        int dify = 0;
        boolean b = true; //条件分岐
 
        for (int i = 1; i <= N; i++) {
            int time = stdln.nextInt();
            int x = stdln.nextInt();
            int y = stdln.nextInt();
 
            dift = Math.abs(dft - time); //変化量の絶対値を計算
            difx = Math.abs(dfx - x);
            dify = Math.abs(dfy - y);
            if (dift >= (difx + dify) && dift % 2 == (difx + dify) % 2) {
                dft = time;
                dfx = x;
                dfy = y;
                continue; //取り除き
            } else {
                b = false;
                break;
            }
        }
        System.out.println(b ? "Yes" : "No");
    }
}

}