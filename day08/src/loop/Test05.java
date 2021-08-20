package loop;
import java.lang.*;
import java.util.*;
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("실행할 구구단 숫자를 입력하세요");
		int number=sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			
			int j=i*number;
		
			String timesTable=number+" x "+i+" = "+j;
			
			System.out.println(timesTable);
			
		}
		
		sc.close();
		
	}
}
