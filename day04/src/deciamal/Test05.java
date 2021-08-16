package deciamal;
import java.lang.*;

public class Test05 {
	public static void main(String[] args) {
		int startHour=7;
		int startMinute=50;
		int finishHour=9;
		int finishMinute=15;
		int price=600;
				
		int startTime=startHour*60+startMinute;
		int finishTime= finishHour*60+finishMinute;		
		int totalTime=finishTime-startTime;
		int totalHour=totalTime/60;
		int totalMinute=totalTime%60;
		
		int minutePrice=price/60;
		int totalPrice=totalTime*minutePrice;
		
		
		System.out.println(totalHour+"시간"+totalMinute+"분");
		System.out.println(totalPrice+"원");
			
		
	}

}
