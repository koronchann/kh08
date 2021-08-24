package loop2;

import java.util.Scanner;

public class Test03_QQ {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		

		int total = 0;
		int round=0;
		while (true) {
			System.out.println("숫자입력");
			int num = sc.nextInt();
			
			//이부분 자꾸 기억안남
			total += num;
			round++;

			if (total > 100) {

				break;

			}

		}
		System.out.println("Game over");
		System.out.println(round+"회 실행");

		sc.close();

	}

}
