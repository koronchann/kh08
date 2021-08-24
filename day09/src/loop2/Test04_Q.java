package loop2;
import java.util.*;
public class Test04_Q {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int odd=0;
		int even=0;
	
		
		while(true) {
			System.out.println("숫자 입력");
			int num=sc.nextInt();
			
			if(num==0) {
				break;
			}
				
				else {
					if(num%2==1) {
					odd++;
					}
					else{
						even++;
					}
						
				}
			}
			
		System.out.println("홀수의 갯수 : "+odd);
		System.out.println("짝수의 갯수 : "+even);
		
		sc.close();
	}
		
}
