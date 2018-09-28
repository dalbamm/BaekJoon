//180928_1947~1_1956
import java.util.Scanner;
public class Main15953 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        Integer [] table_17 = {1,3,6,10,15,21};
        Integer [] table_18 = {1,3,7,15,31};
        Integer [] table_17m = {500,300,200,50,30,10};
        Integer [] table_18m= {512,256,128,64,32};

        for(int i = 0 ; i < N ; ++i){
            int grade_17=s.nextInt();
            int grade_18=s.nextInt();
            int prize=0;
            if(grade_17!=0) {
                for (int j = 0; j < table_17.length; ++j) {

                    if (table_17[j] >= grade_17) {
                        prize += table_17m[j] * 10000;
                        break;
                    }
                }
            }
            if(grade_18!=0) {
                for (int j = 0; j < table_18.length; ++j) {
                    if (table_18[j] >= grade_18) {
                        prize += table_18m[j] * 10000;
                        break;
                    }
                }
            }
            System.out.println(prize);
        }

    }
}
