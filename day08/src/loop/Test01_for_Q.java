package loop;
import java.lang.*;
public class Test01_for_Q {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i=i+1) {
			System.out.println("흑흑");
		}
	}
}

//for구문은 동일한 코드를 여러번 실행, 변화하는 코드를 여러번 실행 할 때 사용

//for의 형태
//for(선언부;조건부;증감부){
// }
//실행순서 : 선언부 ->조건부(괄호안에 if문과 같은 논리식이 들어감)->코드->증감부->조건부->코드->증감부->....

