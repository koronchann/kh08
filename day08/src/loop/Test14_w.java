package loop;

public class Test14_w {
	public static void main(String[] args){

		int sum=10;

		System.out.println("(1)30일간 매일 할 푸시업 개수");
		for(int i=1;i<=30;i++) {
			int push=10+(i-1)*3;
			
			//sum+=push 는 위치 정말 조심해야한다.
			//sysout 밑에 치면 답이 다르게나옴
			
			sum+=push;	
			System.out.println(i+"일차 푸시업 개수 : "+push+"개");
		
		}
	System.out.println("(2)30일간 하게되는 총 푸시업 개수 : ");
	System.out.println(sum+ "개");

	}

}