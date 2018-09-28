import java.util.Scanner;
public class Main15954 {

    static Long[] data;
    static int N, K;
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        K = s.nextInt();
        data = new Long[N];
        for(int i = 0 ; i < N ; ++i){
            data[i]=(long)(s.nextInt());
        }
        double realmin=Double.MAX_VALUE;
        for(int k = K ; k <= N; ++k){
            double tmp=find_min(k);
            if(tmp<realmin) realmin=tmp;
        }
        System.out.println(realmin);
        return;
    }
    public static double calc(int idx, int k){
        long sum=0;
        double var=0.;
        for(int i = idx ; i < idx+k ; ++i){
            long x = data[i];
            sum+=x;
        }
        long average_Q = sum/k;
        double average_res = (sum%k)/(double)k;
        double average= average_Q+average_res;
        for(int i = idx ; i < idx+k ; ++i){
            long x = data[i];
            var+=((double)x-average)/k*((double)x-average);
        }
        double stderr = Math.sqrt(var);
        return stderr;
    }
    public static double find_min(int k){
        Double candidates [] = new Double[(int)(N-k+1)];
        Double min=Double.MAX_VALUE;
        for(int i = 0 ; i <= N-k ; ++i){
            candidates[i] = calc(i,k);
            if(min > candidates[i]) min=candidates[i];
        }
        return min;
    }
}
