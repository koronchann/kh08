package deciamal;
import java.lang.*;

public class Test04 {
	public static void main(String[] args) {
		
		int hour=1;
		int minute=30;
		int day=20;
		int dayTime=hour*60+minute;
		int totalTime=dayTime*20;
		int totalHour=totalTime/60;
		int totalMinute=totalTime%60;
		
		System.out.println(totalHour+"시간"+totalMinute+"분");
		

		
	}
}
