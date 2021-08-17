package realnumber;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		
		double height=190;
		double weight=105;
		double heightMeter=height/100;
				
		double bmi=weight/(heightMeter*heightMeter);
		
		System.out.println(bmi);
	}
	

}
