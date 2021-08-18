package condition;
import java.lang.*;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		
		
		boolean even=number%2==0;
		
		// !even : even이 아니다
		
		if(!even) {
			System.out.println("홀수입니다");
		}
		
		// 이 밑에 if(even) : else 로 바꿔도 무방
		
		if(even) {
			System.out.println("짝수입니다");
		}
		
	}
}
