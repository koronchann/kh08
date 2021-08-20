package condition2;
import java.lang.*;
public class Test03_switch_Q {
	public static void main(String[] args) {
		//입력
		int score=80;
		
		//Q 알아야 할것
		
		//switch 구문
		//case에는 식이나 변수를 적을 수 없다
		//switch에 계산을 할 수 있다.
		//switch ()안에 double float long 등은 안되고
		// 값은 byte,short,char,int,String 만 가능
		// 한 번의 검사를 통해 특정 지점으로 이동하여 탈출명령(break_ 전까지 실행
		//모든 지점이 동일한 속도로 실행된다
		
		//if 구문
		//논리를 기반으로 한 분기를 수행하는 구문
		//순차적을 조건을 검사하여 결과 블록 1개를 실행
		//하단의 구문은 실행 속도가 다소 느리다(티 날 정도는 아니다)
		
		String grade;
		
		switch(score/10) {
		case 10: case 9:
			grade="A등급";
			break;
		case 8: case 7:
			grade="B등급";
			break;
		default:
			grade="C등급";
			break;	
			
			
		}
		
		System.out.println(grade);
	}
}