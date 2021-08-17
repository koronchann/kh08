package total;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		
		int inHour=12, inMinute=34;
		int outHour=15, outMinute=21;
		int pricePerTenminute=500;
		int saleHour=2;
				
		
		int inTime=inHour*60+inMinute;
		int outTime=outHour*60+outMinute;
		int totalTime=outTime-inTime;
		int totalHour=totalTime/60;
		int totalMinute=totalTime%60;
		
		int price=pricePerTenminute*(totalTime/10);
		
		int saleTime=saleHour*60;
		boolean discount=totalTime>=saleTime;				
		
		
		System.out.println(totalHour+"시간"+totalMinute+"분");
		System.out.println(price+"원");
		System.out.println(discount);
		
		
	}

}
