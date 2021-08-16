package deciamal;

import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
	
		byte a=127;
		System.out.println(a);
		
		int b=21000000;
		System.out.println(b);
		
		long c=21000000000000L;
		System.out.println(c);
		
		int d = 1234567*1234567;
		System.out.println(d);
		
		//모든 정수의 계산은 최소 int 이상으로 나온다
		// byte f=100+200; 가 오류가 나는 이유는 인트로 결과값이 나왓는데 바이트에 넣어야 하기 때문임
		
		System.out.println(10+20);
		System.out.println(10-20);
		System.out.println(10*20);
		System.out.println(10/20);
		System.out.println(10%20);
		
		
		System.out.println("카와이민진쨔응");
		
	}
}
