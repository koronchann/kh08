package loop;

public class Test13 {
	public static void main(String[] args) {

		long firstDayMoney = 1L;
		long money = 1L;
		long total = 0L;

		System.out.println("(1)매일 얼마씩 줘야 하나요?");
		System.out.println("1일차 = 1원");

		int day = 30;

		for (int i = 2; i <= day; i++) {

			money = money * 2;
			System.out.println(i + "일차 = " + money + "원");
			total += money;

		}

		total = firstDayMoney + total;
		System.out.println("(2) " + day + "일동안 노인이 받게되는 총 금액");
		System.out.println(total + "원");

		long money2 = 1L;
		long total2 = 0L;
		int day2 = 40;

		for (int i = 2; i <= day2; i++) {

			money2 = money2 * 2;
			total2 += money2;

		}

		total2 = firstDayMoney + total2;
		System.out.println("(3) " + day2 + "일동안 노인이 받게되는 총 금액");
		System.out.println(total2 + "원");

	}

}
