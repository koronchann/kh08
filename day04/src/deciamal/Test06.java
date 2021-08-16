package deciamal;
import java.lang.*;

public class Test06 {
	public static void main(String[] args) {
		int birth=19990101;
		int inputYear=2021;
		int calculateYear=inputYear*10000+9999;		
		int age=(calculateYear-birth)/10000+1;
		int birthYear=birth/10000;
		int birthMonth=(birth%10000)%100;
		int birthDay=birth%100;
		
		
		System.out.println(age);
		System.out.println(birthYear);
		System.out.println(birthMonth);
		System.out.println(birthDay);
		
	}

}
