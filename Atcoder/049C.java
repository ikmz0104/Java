public class ABC049C {
  import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in); //標準入力を取得
        String s = stdln.nextLine();
        String t = "";

        String dream = "dream";
        String dreamer = "dreamer";
        String erase = "erase";
        String eraser = "eraser";

      
        while (true) {
            if (s.equals("")) {
                System.out.println("YES");
                return;
            }
            if (s.endsWith(dream)) { //文字列が指定された部分文字列で始まるかどうかを判定するには、startsWith
      	//指定の部分文字列で終わるかどうかを判定するならば、endsWithメソッド
                t += dream; 
                s = s.substring(0,s.length()-5); //文字列Sに対して全てが抜き出される。//dreamは5文字なので空にする
                //この場合を除く 
                continue; 
            }

            if (s.endsWith(dreamer)) {
                t += dreamer;
                s = s.substring(0,s.length()-7);
                continue;
            }

            if (s.endsWith(eraser)) {
                t += eraser;
                s = s.substring(0,s.length()-6);
                continue;
            }

            if (s.endsWith(erase)) {
                t += erase;
                s = s.substring(0,s.length()-5);
                continue;
            } else {
                System.out.println("NO");
                return;
            }
        }

    }

}

}