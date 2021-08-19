package condition;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name=sc.next();
		System.out.println("국어점수를 입력하세요");
		int korScore=sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		int engScore=sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		int matScore=sc.nextInt();

		
		int totalScore=korScore+engScore+matScore;
		int averageScore=totalScore/3;
				
		
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+totalScore);
		System.out.println("평균 : "+averageScore);
		
		boolean isPass=korScore>=40&&engScore>=40&&matScore>=40&&averageScore>=60;
		
		if(isPass) {
			System.out.println("해당 평가 통과입니다");
		}
		
		else {
			System.out.println("재평가 입니다");
		}
	}
}
