package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test04{
	public static void main(String[] args) {
		Map<String, Car> rent = new HashMap<>();

		rent.put("스타렉스", new Car("스타렉스", 1, 15, true));
		rent.put("카니발", new Car("카니발", 7, 17, false));
		rent.put("그랜저", new Car("그랜저", 4, 20, true));

		Scanner sc = new Scanner(System.in);
		String name = "";
		System.out.println("렌트할 차를 선택");
	}
}
	