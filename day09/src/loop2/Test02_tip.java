package loop2;

import java.util.Scanner;

public class Test02_tip {
	public static void main(String args[]) {

		// while 구문을 이용하면 "무한반복"이 가능하다(for도 가능하긴 하다 >> for(;true;)
		// 무한 반복시 반드시 "종료상황"을 알려줘야 한다.

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자 입력");
			int number = sc.nextInt();
			if (number == 0) {
				break; // 현재 진행중인 구문(***if는 제외***)를 탈출하세요
				// 그래서 break에 커서 대면 if가 아닌 while이 나옴
			}

		}

		sc.close();

	}

}
