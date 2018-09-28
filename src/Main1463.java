import java.util.*;
public class Main1463 {
    public static Integer [] minArr;
    public static ArrayList<Integer>  maxArr = new ArrayList<Integer>();
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(),rst = 0;
         minArr= new Integer [N+1];
        minArr[1]=0;
        //need min array, min function
        //for(int i = 0 ; i < 10 ; ++i)
          //  System.out.println(minArr[i]);
        rst=minfun(N);
        System.out.println(rst);
        return;
    }
    static int minfun(int n){

        //return min(f(n-1),f(n/3),f(n/2))
        return minArr[n]==null? wk(n): minArr[n];
    }
    static int wk(int n){
        //if(minArr[0])
        if(minArr[n]!=null) return minArr[n];
        int rst;
        if(n%3!=0 && n%2!=0)
            rst= wk(n-1)+1;
        else if(n%3!=0 && n%2==0)
            rst= min(wk(n-1),wk(n/2))+1;
        else if(n%3==0 && n%2!=0)
            rst= min(wk(n-1),wk(n/3))+1;
        else
            rst= min(wk(n-1),wk(n/3),wk(n/2))+1;
        minArr[n]=rst;
        return rst;
    }
    static int min(int a, int b){
        return a>=b?b:a;
    }
    static int min(int a, int b, int c){
        if(a>=b && b>=c)   return c;
        if(a<=b && b<=c)   return a;
        if(b>=a && a>=c)   return c;
        if(c>=a && a>=b)   return b;
        if(a>=c && c>=b)   return b;
        if(b>=c && c>=a)   return a;
        return a;
    }
}


