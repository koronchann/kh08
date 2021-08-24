package loop;
import java.util.*;
public class Test15_QQ {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num=sc.nextInt();
		sc.close();
		int count=0;
		
		for(int i=num;i>0;i/=10) {
			int n=i%10;
			if(n==7) {
				count++;
			}

		}
		

		System.out.println("입력하신 숫자 ["+num+"]에는 7이 "+count+"개 있습니다");

		
	}
}
