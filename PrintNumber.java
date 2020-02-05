import java.util.Scanner;

class PrintNumber1{


    public static void main(String[] args){


        int counter = 0;

        for(int n=2; n <= 9; n++){
            int i;
            for(i = 2;i < n; i++){
                System.out.println("n="+n);  
                System.out.println("i="+i);    
                counter++;
                if (n % i == 0)
                    break;

                if (n == i)
                    System.out.println(n);    
            }
        }
        System.out.println("除算を行った回数:"+counter);

    }
}