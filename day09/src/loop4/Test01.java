package loop4;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작할 숫자를 입력");
		int startNum = sc.nextInt();
		System.out.println("끝 숫자를 입력");
		int endNum = sc.nextInt();

		int count = 0;

		for (int i = startNum; i <= endNum; i++) {

			for (int j = i; j > 0; j = j / 10) {
				if (j % 10 == 3 || j % 10 == 6 || j % 10 == 9) {
					count++;
				}

			}
		}
		
		System.out.println(count+"번 박수를 칩니다");

	}
}
