package loop;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		
		
		//주의 : scanner같은 도구는 반복문 안에서 만들지 않도록 한다
		
		
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<5;i++) 
			
		{ System.out.println("이름을 입력하세요");
		String name=sc.next();
		
		System.out.println("이름 : "+name);
		}
		
		sc.close();
		
	}

}
