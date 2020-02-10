import java.util.Scanner;

class PrintNumber2{


    public static void main(String[] args){

        // 基本的に偶数だったら、素数じゃないので無視してる

        int counter = 0;
        int i = 2;
        int ptr = 0;
        int[] sosuu = new int[500];
        sosuu[ptr] = 2;
        ptr++;
        sosuu[ptr] = 3;
        ptr++;
        // System.out.println(sosuu);
        //System.out.println(sosuu[0]);
        for(int n=3; n <= 1000; n+=2){

            System.out.println("top_sosuu[ptr]:"+sosuu[ptr-1]);

            int a;
            boolean isNotSossu = false;
            for(a = 0;a < ptr; a++){
                // System.out.println("ptr="+ptr);
                // System.out.println("a="+a);
                // System.out.println(sosuu[a]);
                if(sosuu[a] == 0){
                    continue;        
                }
                if(n % sosuu[a] == 0){
                    isNotSossu = true;
                    break;
                }
                    
            }
            if(isNotSossu){
                continue;
            }

            System.out.println("sossu_kamo:"+n);
            int lastSossu = sosuu[ptr-1];
            
            for(int j = lastSossu;j <= n; j+=2){
                

                // System.out.println("i="+i);    
                
                if (n % i == 0){
                    break;
                }

                if (j % i == 0){
                    continue;
                }    

                counter++;    
                // System.out.println("n="+n);
                // System.out.println("i="+i);

                // 過去の数字で割り切れるか確認
                
                // boolean isNotSossu = false;
                
                // 上記ループで最後まで言ってたら、途中で割り切れた→素数じゃない
                // if(isNotSossu){
                //     break;
                // }    
                System.out.println("j:"+j); 
                if (n == j){
                    sosuu[ptr] = n;
                    System.out.println("sossu:"+n); 
                    // System.out.println("sossu:"+n);    
                    // System.out.println("sosuu[ptr]:"+sosuu[ptr]);    
                    // System.out.println("ptr:"+ptr); 
                    // System.out.println("sosuu[ptr]:"+sosuu[ptr]);
                    ptr++;
                    // System.out.println("sosuu[ptr]:"+sosuu[ptr-1]);
                }
                    
            }
            
        }
        System.out.println("除算を行った回数:"+counter);

    }
}