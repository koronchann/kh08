package condition;
import java.lang.*;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		int month=sc.nextInt();
		int period=sc.nextInt();
		
		sc.close();
		
		
		int price=10;
		
		int saleRate;
		
		if(month==12||month==1||month==2) {
			saleRate=20;
		}
		
		else if(month==9||month==10||month==11) {
			saleRate=30;
		}
		
		else if(month==6||month==7||month==8) {
			saleRate=40;
		}
		
		else {
			saleRate=10;
		}
		
		
		System.out.println("할인율 : "+saleRate+"%");
		
		
		int salePrice=price*(100-saleRate)/100;
		int totalPrice=salePrice*period*10;
		
		
		System.out.println("예상경비 : "+totalPrice+"만원");
		
	
		
		
		
		
			
	}
	
}
