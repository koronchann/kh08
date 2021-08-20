package loop;

public class Test08 {
	public static void main(String[] args) {

		// 5,15,25,35,45,50,51,52,--...,95를 출력
		// 1부터 100까지 나열
		// 그 중에 10의자리가 5인 수를 출력
		// 그리고 10의자리가 5가 아닐 경우 1의자리가 5인 수를 출력

		int count = 0;

		for (int j = 1; j < 100; j++) {
			boolean first = j / 10 == 5;
			boolean second = j % 10 == 5;
			if (first || second) {
				System.out.println(j);
				count++;
			}

		}

		System.out.println("count =" + count);
	}

}
