import java.lang.*;
public class Calculate4 {
	public static void main(String[] args) {
		int chinaNoodlePrice=5000;
		int chinaNoodleCount=2;
		int champonPrice=6000;
		int champonCount=2;
		
		int chinaNoodleTotal=chinaNoodlePrice*chinaNoodleCount;
		int champonTotal=champonPrice*champonCount;
		int total=chinaNoodleTotal+champonTotal;
		
		System.out.println(chinaNoodleTotal);
		System.out.println(champonTotal);
		System.out.println(total);
	}
}

