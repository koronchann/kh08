package loop;

public class Test09 {
	public static void main(String[] args) {
		// 1부터 99사이에 있는 숫자를 이용하여
		// 3,6,9가 숫자에 있다면 개수만큼 박수를 침
		// A:10으로 나눳을때 나머지가 3 6 9면 박수가 한번 쳐짐
		// B:10으로 나눳을때 몫이 3 6 9면 박수가 한번 쳐짐
		// 박수가 두번 쳐질때를 출력 >> A이고 B
		// 박수가 두번 쳐질때를 출력 >> 위에서 걸러진거에서 A또는 B
		// 안쳐질때를 출력 이렇게 세가지 경우로 나눠서 해보자 >> 위에서 걸러진거

		for (int i = 1; i < 100; i++) {
			// i를 1~100까지 대입나열
			boolean a = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			boolean b = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
			

			if (a && b) {
				System.out.println("짝짝");
			}
			else if(a||b) {
				System.out.println("짝");
			}
			else {
				System.out.println(i);
			}

		}

	}

}
