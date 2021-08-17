package logical;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		
		double currentSpeed=109;
		double limitSpeed=100;
		double marginSpeed=limitSpeed*1.1;

		boolean speeding=currentSpeed>marginSpeed;
		
		System.out.println(speeding);
		
		
	}
}
