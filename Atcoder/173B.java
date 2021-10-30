import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      int N = sc.nextInt(); //全提出の個数Nを入力
      String S[] = {"AC","WA","TLE","RE"}; //N個分の４種類の配列を入力
      int C[] = {0,0,0,0}; //出力個数
      for(int i=0; i<=N; i++) { //入力内容から4種類を抽出する
       String I = sc.nextLine();
       if(I.equals(S[0])) {
				C[0]++;
			}else if(I.equals(S[1])) {
				C[1]++;
			}else if(I.equals(S[2])) {
				C[2]++;
			}else if(I.equals(S[3])) {
				C[3]++;
			}
      }
      for (int i=0; i<4; i++) {
        System.out.println(S[i] + "×" + C[i]);
      }
   }
}


// public class B-JudgeStatusSummary1 {
//    import java.util.Scanner;
  
//  public class Main {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
      
//        int N = sc.nextInt();
      
//        String A = "AC";
//        String B = "WA";
//        String C = "TLE";
//        String D = "RE";
      
//        int C0 = 0;
//        int C1 = 0;
//        int C2 = 0;
//        int C3 = 0;
      
      
//        for(int i=0; i<=N; i++) {
//         String H = sc.nextLine();
//         if(H.equals(A)) {
//              C0++;
//           }else if(H.equals(B)) {
//              C1++;
//           }else if(H.equals(C)) {
//              C2++;
//           }else if(H.equals(D)) {
//              C3++;
//           }
//        }
//          System.out.println("AC x " + C0);
//        System.out.println("WA x " + C1);
//        System.out.println("TLE x " + C2);
//        System.out.println("RE x " + C3);
//     }
//  }
 
//  }
