import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	public static void printTwoTimesA(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimiter+"\n");
		fw.write(text+"\n");
		fw.write(text+"\n");
		fw.close();
		
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out += delimiter+"\n";
		out += text + "\n";
		out += text+"\n";
		return out;
	}
	
	public static void main(String[] args) throws IOException {
		//100000000
		printTwoTimesA("A", "-");
		//100000000
		printTwoTimesA("B", "*");
		//100000000
		printTwoTimesA("C", "/");
		
		FileWriter fw = new FileWriter("output.txt");
		fw.write(twoTimes("A", "-"));
		fw.close();
	}
}
