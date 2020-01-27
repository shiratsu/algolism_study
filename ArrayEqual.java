import java.util.Scanner;

class ArrayEqual{

    static boolean equals(int[] a, int[] b){
        if (a.length != b.length){
            return false;        
        }
        for(int i = 0;i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);    

        System.out.println("aの要素数は:");
        int numA = stdIn.nextInt();

        int[] a = new int[numA];

        for(int i = 0; i < numA; i++){
            System.out.println("a["+i+"] = :");
            a[i] = stdIn.nextInt();
        }

        System.out.println("bの要素数は:");
        int numB = stdIn.nextInt();

        int[] b = new int[numB];

        for(int i = 0; i < numB; i++){
            System.out.println("b["+i+"] = :");
            b[i] = stdIn.nextInt();
        }

        System.out.println("配列aとbは"+(equals(a,b) ? "同じ" : "違う"));


    }
}