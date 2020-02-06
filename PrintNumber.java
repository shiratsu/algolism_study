import java.util.Scanner;

class PrintNumber1{


    public static void main(String[] args){

        // 基本的に偶数だったら、素数じゃないので無視してる

        int counter = 0;
        int i = 2;
        for(int n=2; n <= 15; n++){
            
            for(int j = 2;j <= n; j++){
                
                // System.out.println("i="+i);    
                counter++;
                if (n % i == 0)
                    break;
                // System.out.println("n="+n);
                // System.out.println("i="+i);   
                if (n == j)
                    System.out.println(n);    
            }
        }
        System.out.println("除算を行った回数:"+counter);

    }
}