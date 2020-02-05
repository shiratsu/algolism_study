import java.util.Scanner;

class CardConvRev{

    /**
     * r進数にxを変換する
     */
    static int cardConvR(int x,int r, char[] d){

        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }while(x != 0);
        System.out.println("digits : "+digits);
        for(int i = d.length - 1; i >= 0; i--){
            System.out.println("d_i : "+d[i]);
        }

        return digits;
    }
    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);    

        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10進数を奇数変換します。");
        do{
            do{
                System.out.println("変換する非負の整数：");
                no = stdIn.nextInt();
            }while(no < 0);

            do{
                System.out.println("何進数に変換しますか（2-36）：");
                cd = stdIn.nextInt();
            }while(cd < 2 || cd > 36);

            dno = cardConvR(no,cd,cno);

            System.out.println(cd+"進数では");

            for(int i = dno-1; i >= 0; i--){
                System.out.println(cno[i]);
            }
            System.out.println("です");
            System.out.println("もう一度？(1:yes/2:no)：");
            retry = stdIn.nextInt();

        } while(retry == 1);
    }
}