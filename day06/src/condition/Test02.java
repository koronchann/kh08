package condition;
import java.lang.*;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("여행할 달을 숫자로 입력하세요.");
		int month=sc.nextInt();
		System.out.println("여행할 기간을 일단위로 입력하세요.");
		int period=sc.nextInt();
				
		sc.close();
		
		boolean isSummer=month/3==2;
				
		if (isSummer) {
			int summerPrice=8;
			int summerTotalPrice=period*summerPrice;
			
			
			System.out.println("\"여름특가적용\"");
			System.out.println("예상경비 : "+summerTotalPrice+"만원");
		}
		
		else {
			int notSalePrice=10;
			int notSaleTotalPrice=period*notSalePrice;
			
			System.out.println("예상경비 : "+notSaleTotalPrice+"만원");
					
		}
	}

}
