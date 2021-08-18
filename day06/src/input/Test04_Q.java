package input;
import java.lang.*;
import java.util.Scanner;
public class Test04_Q {
		public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("이름을 입력하세요");
		String name=sc.next();
		System.out.println("신장을 입력하세요(cm)");
		float height=sc.nextFloat();
		System.out.println("몸무게를 입력하세요(kg)");
		float weight=sc.nextFloat();
		float bmiLimit=24.5f;
		
		sc.close();
		
		float heightMeter=height/100;
		float bmi=weight/(heightMeter*heightMeter);
		boolean overWeight=bmi>=bmiLimit;
		
		float bmi2=(int)(bmi*100)/100f;
		
		// bmi*100 : 2605.1224  >>  int: 2605 >>  /100f : 26.05 
		
		System.out.println("BMI 수치 : "+bmi2);
		System.out.println("과체중 여부 : " +overWeight);
			
		}
	

	// double은 sc.nextDouble() 이라는 명령으로 입력 가능
	// float는 sc.nextFloat()라는 명령으로 입력 가능
	//=next 계열 명령은 엔터, 띄어쓰기 등을 이용하여 데이터를 구분하여 입력받는다.

}
