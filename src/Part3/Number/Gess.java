package Part3.Number;

public class Gess {
	public static void main(String[] args){
		char word = 'd', word2 = '@';
		int p = 23045, p2 = 45213;
		System.out.println("d在unicode " + (int)word);
		System.out.println("@在unicode " + (int)word2);
		System.out.println("unicode 中第23045位的是" + (char)p);
		System.out.println("unicode 中第45213位的是" + (char)p2);
	}
}
