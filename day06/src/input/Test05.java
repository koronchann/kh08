package input;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("시작한 시각을 입력하세요");
		int startHour=sc.nextInt();
		int startMin=sc.nextInt();
		System.out.println("종료한 시각을 입력하세요");
		int endHour=sc.nextInt();
		int endMin=sc.nextInt();
		int pricePerHour=600;
		
		sc.close();
		
		int startTime=startHour*60+startMin;
		int endTime=endHour*60+endMin;
		int usedTime=endTime-startTime;
		int usedHour=usedTime/60;
		int usedMin=usedTime%60;
		float minPrice=pricePerHour/60f;
		int totalPrice=(int)(minPrice*usedTime);
		
		System.out.println("이용시간 : "+usedHour+"시간 "+usedMin+"분");
		System.out.println("이용요금 : "+totalPrice+"원");
		
		
		
		
	}
}
