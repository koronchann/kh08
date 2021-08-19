package condition;

import java.lang.*;
import java.util.Scanner;

public class Test11_1 {
	
	public static void main(String[] args){
		
		//입력
		
		Scanner sc=new Scanner(System.in);
	
	
		System.out.println("경과된 시간을 초로 입력하세요");
		int second=sc.nextInt();
		
		
		sc.close();
		
		//처리에서 string을 변수로 정해놓고 if구문을 만듬
		
		String message;
						
		if(second<=10) {
			message="방금 전";
		}
		else if(second<60) {
			message=second+"초 전";
		}
		else if(second<3600) {
			int minute=second/60;
			message=minute+"분 전";
		}
		else if(second<60*60*24) {
			int hour=second/60*60;
			message=hour+"시간 전";
		}
		else {
			message="오래 전";	
		}
		
		//출력
		
		System.out.println(message);

	}
}
