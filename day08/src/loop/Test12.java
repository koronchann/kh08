package loop;

public class Test12 {
	public static void main(String[] args){
		
		int sum=10;
		int total=0;
		
		System.out.println("(1)30일간 매일 할 푸시업 개수");
		for(int i=1;i<=30;i++) {
			System.out.println(i+"일차 푸시업 개수 : "+sum+"개");
			total+=sum;			
			sum+=3;			
		}
	System.out.println("(2)30일간 하게되는 총 푸시업 개수 : ");
	System.out.println(total+ "개");
	
	}
	
}
