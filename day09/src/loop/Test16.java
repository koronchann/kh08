package loop;

import java.util.Scanner;

public class Test16 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num = sc.nextInt();
		sc.close();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			int i2 = num % i;
			// i2는 0 0 1 2 0 4 3 2 1 0 임
			// 여기서 i2중에서 0의 갯수를 새야함
			// i2를 10으로 나눳을 때 나머지가 0인경우 >> 카운트 1개씩 한다.
			// 그 카운트 된 숫자가 2일경우 소수이고, 아닐경우 합성수이다.

			if (i2 % 10 == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("소수입니다");
		} else {
			System.out.println("합성수입니다");
		}
	}

}
