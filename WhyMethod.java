
public class WhyMethod {
	public static void printTwoTimesA(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		//100000000
		printTwoTimesA("A", "-");
		//100000000
		printTwoTimesA("B", "*");
		//100000000
		printTwoTimesA("C", "/");
	}
}
