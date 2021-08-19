package condition;
import java.lang.*;
import java.util.Scanner;

// 지하철 요금 계산기

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("생년월일 4자리를 입력하세요");
		
		int birthYear=sc.nextInt();
		

		int nowYear=2021;
		String old="무료";
		int adult=1250;
		int teen=720;
		int child=450;
		String baby="무료";
		
		
		int age=nowYear-birthYear+1;
		
		
		System.out.println("지하철 기본요금 : ");
		
		if (age>=65) {
			System.out.println(old);
		}
		
		else if (age>=20) {
			System.out.println(adult+"원");
		}
		
		else if (age>=14) {
			System.out.println(teen+"원");
		}
		
		else if (age>=8) {
			System.out.println(child+"원");
		}
		else {System.out.println(baby);
		}
		
		
	}
	
}
