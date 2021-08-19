package condition;

import java.lang.*;
import java.util.Scanner;

public class Test11{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
	
	
		System.out.println("경과된 시간을 초로 입력하세요");
		int second=sc.nextInt();
		
		
		sc.close();
		
						
		if(second<=10) {
			System.out.println("방금 전");
		}
		else if(second<60) {
			System.out.println(second+"초 전");		
		}
		else if(second>=60&&second<3600) {
			int minute=second/60;
			System.out.println(minute+"분 전");			
		}
		else if(second>=3600&&second<86400) {
			int hour=second/3600;
			System.out.println(hour+"시간 전");
		}
		else {
			System.out.println("오래 전");	
		}
		

	}
}
