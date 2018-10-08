//10081247~1310
import java.util.Scanner;
import java.util.ArrayList;
public class Main10828 {
    static int N;
    static ArrayList<Integer> stack;
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        N = Integer.parseInt(s.nextLine());
        stack = new ArrayList<>();
        for( int i = 0 ; i < N ; ++i){
            String inst = s.nextLine();
            //System.out.println(inst);
            if(inst.contains("push"))
                push(Integer.parseInt(inst.substring(inst.indexOf(" ")+1)));
            else if(inst.contains("pop"))
                System.out.println(pop());
            else if(inst.contains("size"))
                System.out.println(size());
            else if(inst.contains("empty"))
                System.out.println(empty());
            else if(inst.contains("top"))
                System.out.println(top());
        }
    }
    public static void push(int elem){
        stack.add(elem);
    }
    public static int pop(){
        return size()==0 ? -1 : stack.remove(stack.size()-1);
    }
    public static int size(){
        return stack.size();
    }
    public static int empty(){
        return size()==0 ? 1 : 0;
    }
    public static int top(){
        return size()==0 ? -1 : stack.get(stack.size()-1);
    }

}
