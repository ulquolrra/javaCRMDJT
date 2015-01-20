package DayThree;

public class Calculation {
	public static void main(String[] args){
		int a = 2, b = 5;
		boolean result = ((a > b) && (a != b));
		boolean result2 = ((a > b) || (a != b));
		System.out.println("result is " + result);
		System.out.println("result2 is " + result2);
	}
}
