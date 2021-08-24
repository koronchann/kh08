package loop;

public class test {
	public static void main(String[] args) {
		long money = 1, sum30 = 0, sum40 = 0;
		
		for (int i = 1; i <= 40; i++) {
			System.out.println(i+"일 = "+money+"원");
			if(i<=30) {
				sum30 += money;
			}
			sum40 += money;
			money *= 2;
		}
		
		System.out.println("30일 총액 = "+sum30+"원");
		System.out.println("40일 총액 = "+sum40+"원");
	}
}
