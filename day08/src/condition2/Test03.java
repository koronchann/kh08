package condition2;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		//입력
		int score=80;
		
		//처리
		String grade;
		if (score>=90) {
			grade="A";}
		else if(score>=70) {
			grade="B";}
		else {
			grade="C";
		}
		
		System.out.println(grade);
	}
}