package condition;

import java.lang.*;
import java.util.Scanner;

public class Test12 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("연도를 입력하세요");
		int year=sc.nextInt();
		System.out.println("월을 입력하세요");
		int month=sc.nextInt();
		sc.close();

		int endNumber;
		
		if (month==2) {
			if(year/400==0) {
				endNumber=29;
			}
			else if(year/100==0) {
				endNumber=28;
			}
			else if(year/4==0) {
				endNumber=29;
			}
			else {
				endNumber=28;
			}
		}
		
		else if(month==4&&month==6&&month==9&&month==11) {
			endNumber=30;
		}
		
		else {
			endNumber=31;
			}
		
		System.out.println("해당 월의 마지막 날은 "+endNumber+"일 입니다.");
					
		}			
		
}
