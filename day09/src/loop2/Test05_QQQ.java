package loop2;

import java.util.*;

public class Test05_QQQ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("테스트 하는 단 수를 입력하세요 : ");
		int num = sc.nextInt();
		int n = 1;
		int wrongCount = 0;
		int correctCount = 0;

		while (true) {
			System.out.print(num + " x " + n + " = ");
			int answer = sc.nextInt();
			n++;
			
			if (answer % num != 0) {
				wrongCount++;

				if (wrongCount == 3) {
					System.out.println("Game Over");
					break;
				}

			}
			else{
				correctCount++;
			}

		}
		int score = correctCount * 100;

		System.out.println("님 능지는" + score + "점");

		sc.close();
	}
}
