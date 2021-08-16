package deciamal;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		
		int hour = 3,yesterdayHour=2,todayHour=4;
		int minute = 35,yesterdayMinute=50,todayMinute=30;
		
		int time = hour*60+minute;
		int yesterdayTime=yesterdayHour*60+yesterdayMinute;
		int todayTime=todayHour*60+todayMinute;
		int totalTime=yesterdayTime+todayTime;

		int totalHour=totalTime/60;
		int totalMinute=totalTime%60;
	
	System.out.println(time+"분");
	System.out.println( totalHour+ "시간 " + totalMinute+"분")	;
	
	}
}
