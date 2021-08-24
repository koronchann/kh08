package loop;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("분과 초를 정수 형태로 입력");
		int min = sc.nextInt();
		int sec = sc.nextInt();

		sc.close();

		int time = min * 60 + sec;

		for (int i = time; i >= 0; i--) {
			
			int min2 = i / 60;
			int sec2 = i % 60;
			System.out.println(min2 + "분 " + sec2 + "초 후 알람이 울립니다");

		}

		System.out.println("시간이 다 되었습니다~!");
	}

}
