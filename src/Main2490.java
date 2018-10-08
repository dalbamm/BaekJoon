import java.util.Scanner;
public class Main2490{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < 3 ; ++i){
			String raw = scan.nextLine();
			System.out.println(typeYut(raw));
		}
		
	}
	public static String typeYut(String raw){
		String [] yuts =raw.split(" ");
		int cnt_1 = 0;
		for(int i = 0 ; i < 4 ; ++i){
			if(yuts[i].equals("1"))	cnt_1++;
		}
		switch(cnt_1){
		case 0:	return "D";
		case 1:	return "C";
		case 2:	return "B";
		case 3:	return "A";
		case 4: return "E";
		}
		return "";
	}
}
