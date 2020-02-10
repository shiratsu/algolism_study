import java.util.Scanner;

class DayOfYear{

    static int[][] mdays = {
        {31,28,31,30,31,30,31,31,30,31,30,31},
        {31,29,31,30,31,30,31,31,30,31,30,31},
    };

    /**
     * 閏年かどうか
     */
    static int isUruuYear(int year){
        return (year % 4 == 0) ? 1 : 0;
    }

    /**
     * 年内の経過日数を求める
     */
    static int dayOfYear(int y,int m,int d){
        int days = d;

        for(int i = 1;i < m; i++){
            days += mdays[isUruuYear(y)][i-1];
        }
        return days;
    }

    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in); 
        int retry;

        do{

            System.out.println("年:");int year = stdIn.nextInt(); // 年
            System.out.println("月:");int month = stdIn.nextInt(); // 月
            System.out.println("日:");int day = stdIn.nextInt(); // 日
            System.out.printf("年内で%d日目です\n",dayOfYear(year,month,day));

            System.out.println("もう一度？(1:yes/2:no)：");
            retry = stdIn.nextInt();

        }while(retry == 1);   

    }    
}


