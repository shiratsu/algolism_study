import java.util.Scanner;

class PrintNumber2{


    public static void main(String[] args){

        // 基本的に偶数だったら、素数じゃないので無視してる

        int counter = 0;
        int i = 2;
        int ptr = 0;
        int[] sosuu = new int[500];
        // sosuu[ptr] = 2;
        // ptr++;
        // System.out.println(sosuu);
        System.out.println(sosuu[0]);
        for(int n=2; n <= 50; n++){
            
            for(int j = 2;j <= n; j++){
                
                // System.out.println("i="+i);    
                counter++;
                if (n % i == 0)
                    break;
                // System.out.println("n="+n);
                // System.out.println("i="+i);

                // 過去の数字で割り切れるか確認
                int a;
                for(a = 0;a < ptr; a++){
                    System.out.println("ptr="+ptr);
                    System.out.println(sosuu[a]);
                    if(n % sosuu[a] == 0)
                        break;
                }
                // 上記ループで最後まで言ってたら、途中で割り切れた→素数じゃない
                if(a == sosuu.length-1){
                    break;
                }    

                if (n == j)
                    sosuu[ptr] = n;
                    ptr++;
                    System.out.println(n);    
            }
            
        }
        System.out.println("除算を行った回数:"+counter);

    }
}