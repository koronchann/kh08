package input;
import java.lang.*;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String name=sc.next();
		int krScore=sc.nextInt();
		int enScore=sc.nextInt();
		
		sc.close();
		
		
		int totalScore=krScore+enScore;
		float average=totalScore/2f;
		
		
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+totalScore);
		System.out.println("평균 : "+average);
		
		
	}
}
