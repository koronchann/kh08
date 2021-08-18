package input;
import java.lang.*;
import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		
		// Scanner : 리모컨의 형태
		// sc : 리모컨
		// .close : sc라는 리모컨의 close라는 버튼
		// new : 새로운걸 가져와서 실행한다
		// read() : read라는 기능을 실행한다
		// close() : close라는 기능을 실행한다

	
		Scanner sc=new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println("a = " + a);

		String b = sc.next();
		System.out.println("b = " + b);

		
		sc.close();
	}

}
