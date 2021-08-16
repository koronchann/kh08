import java.lang.*;
public class Calculate6 {
	public static void main(String[] args) {
			int adultPrice=1250, adultCount=2;
			int teenagerPrice=720,teenagerCount=2;
			int childPrice=450,childCount=1;
			
			int adultTotalPrice=adultPrice*adultCount;
			int teenagerTotalPrice=teenagerPrice*teenagerCount;
			int childTotalPrice=childPrice*childCount; 
			int total=adultTotalPrice+teenagerTotalPrice+childTotalPrice; 
			
			
			System.out.println(adultTotalPrice);
			System.out.println(teenagerTotalPrice);
			System.out.println(childTotalPrice);
			System.out.println(total);
	}
}
