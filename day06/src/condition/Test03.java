package condition;
import java.lang.*;

public class Test03 {
	public static void main(String[] args) {
		// and연산 : &&
		// or 연산 : || (shift키+\)
		
		int age=10;
		
		boolean upper=age>=14;
		boolean lower=age<=19;
		boolean isTeen=upper&&lower;
		
		System.out.println("청소년? " + isTeen);
		
		
	}
}
