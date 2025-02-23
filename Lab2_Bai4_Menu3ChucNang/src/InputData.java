import java.util.Scanner;

public class InputData {
	private Scanner scanner = new Scanner(System.in);
	
	public double inputData(String message)
	{
		System.out.print(message);
		return scanner.nextDouble();
	}
}
