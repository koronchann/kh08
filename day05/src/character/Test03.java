package character;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		String str="나는 지금 \"피자\"가 먹고싶다";
		String str2="안녕\t하세요";
		String str3="안\n녕";
		
		//   \n(New Line이란 뜻. 다음 행으로 이동)
		//   \t(Tab, 탭. 다음 탭으로 이동)
		//   \r(carriage return. 첫 칸으로 이동)
		//   \", \', \\ : \뒤의 글자를 출력
			
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
