// public class A-RainySeason {
//   import java.util.Scanner;
//    public class Main {
//    public static void main(String[] args) {
     
//         //sec--1 (definition)
//         Scanner sc = new Scanner(System.in);
//         String S = sc.nextLine();
//         int cnt = 0;
         
//         //sec--2 (branch)
//         for(int i=1; i<3; i++){
//           S = S.substring(S.length() - 1);
//           if(S[i].equals("R")) {
//             cnt++;
//           } else if (S.equals("S")) {
//             continue;
//           }
//         }
//              System.out.println(cnt);
//    }
// }
// }


// import java.util.Scanner;
//    public class Main {
//    public static void main(String[] args) {
     
//         //sec--1 (definition)
//         Scanner sc = new Scanner(System.in);
//         String S = sc.nextLine();
//         int count = 0;
         
//         //sec--2 (branch)
//           if(S.equals("SSS")) {
//             count = 0;
//           }  if (S.equals("SSR")) {
//             count = 1;
//           }  if (S.equals("SRR")) {
//             count = 2;
//           }  if (S.equals("RRR")) {
//             count = 3;
//           }  if (S.equals("RRS")) {
//             count = 2;
//           }  if (S.equals("RSS")) {
//             count = 1;
//           }  if (S.equals("RSR")) {
//             count = 2;
//           }  if (S.equals("SRS")) {
//             count = 1;
//           }
//      System.out.println(count);
//      sc.close();
//    }
// }
// import java.util.Scanner;
//    public class Main {
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String S = sc.nextLine();
//         int cnt = 0;
          
//           if(S.equals("SSS")) {
//             cnt = 0;
//           } else if (S.equals("SSR") || S.equals("RSS") || S.equals("SRS")) {
//             cnt = 1;
//           } else if (S.equals("SRR") || S.equals("RRS") || S.equals("RSR")) {
//             cnt = 2;
//           } else if (S.equals("RRR")) {
//             cnt = 3;
//           }
     
//      System.out.println(cnt);
//      sc.close();
//    }
// }

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int cnt = 0;
		for(int i=0; i < 3; i++) {
			if(S.charAt(i)=='R') {
				if(i==2&&S.charAt(1)=='S'){
                  cnt=0;
                }
				  cnt++;
			}
		}
		System.out.println(cnt);
	}
}