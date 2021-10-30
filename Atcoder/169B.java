// import java.util.*;
//   public class Main {
//     public static void main(String[] args) {
     
//         //sec--1 (definition)
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
// 		//int[] A = new int[N];
//         //incompatible types: possible lossy conversion from long to int
//         long[] A = new long[N];
      
//         //sec--2 (loop--0)
//         for(int i=0; i<=N; i++) {
//           //int[] A = nextLine();
//           //A[i] = nextLine();
//           A[i] = sc.nextLong();
//           if(A[i] == 0) {
//             System.out.println(0);
//             return;
//           }
//         }
//         //pre sec--3
//         //int cal = 0;
//         long cal = 1;
      
//         //sec--3 (cal = A[i](i=0 to N))
//         for(int i=0; i<=N; i++) {
//           //Longなので数値にL
//           if(cal*A[i] > 1000000000000000000L) {
//           System.out.println("-1");
//           return;
//         } 
//           cal *= A[i];
//         }
      
//         System.out.println(cal);
//     }
//   }


  import java.util.*;
  public class Main {
    public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long cal = 1;
        long max = (long)Math.pow(10,18);
      
        //sec--2 (loop,0)
        for(int i=0; i<N; i++){
          A[i] = sc.nextLong();
          if(A[i]==0){
            System.out.println(0);
            return;
          }
        }
      
        //sec--3 (loop,-1.cal)
        //returnで初期に戻るので
        if(cal != 0) {
        for(int i=0; i<N; i++){
          //if(max < A[i]*cal){
          if(max/cal < A[i]){
            System.out.println(-1);
            return;
          } else {
            cal *= A[i];
          }
        }
        }
            System.out.println(cal);
            return;
    }
  }