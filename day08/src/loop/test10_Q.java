package loop;

public class test10_Q {
	public static void main(String[] args) {

		
		//count와 total의 사용법
		
		int count = 0;
		int total = 0;
		for (int i = 1; i<=10; i++) {
			System.out.println(i);
			count++;
			total+=i;
		}
		System.out.println(count);
		System.out.println(total);
	}
}
