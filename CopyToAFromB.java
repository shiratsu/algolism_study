import java.util.Scanner;

class CopyToAFromB{

    static int[] copy(int[] b){

        int[] a = new int[b.length];

        
        for(int i = 0;i < b.length; i++){
            a[i] = b[i];
        }

        return a;
    }
    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);    

        System.out.println("bの要素数は:");
        int numB = stdIn.nextInt();

        int[] b = new int[numB];

        for(int i = 0; i < numB; i++){
            System.out.println("b["+i+"] = :");
            b[i] = stdIn.nextInt();
        }

        int[] a = copy(b);

        for(int i = 0; i < a.length; i++){
            System.out.println("a["+i+"] = "+a[i]);
            System.out.println("bb["+i+"] = "+b[i]);

        }
    }
}