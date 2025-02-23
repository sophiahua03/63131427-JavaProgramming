
public class GiaiPTBac2 {
	private InputData input = new InputData();
	public void PTBac2()
	{
		double a = input.inputData("\nNhập hệ số a: ");
		double b = input.inputData("\nNhập hệ số b: ");
		double c = input.inputData("Nhập hệ số c: ");
		
		if (a == 0)
		{
			System.out.println("Đây là phương trình bậc nhất: ");
			new GiaiPTBac1().PTBac1();
			return;
		}
		
		double Delta = Math.pow(b, 2) - 4 * a * c;
		if (Delta > 0)
		{
			double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
			System.out.println("Phương trình có hai nghiệm: x1 = " + x1
					+ "\n và x2 = " + x2);
		}
		else if (Delta == 0)
		{
			double x = -b / (2 * a);
			System.out.println("Phương trình có nghiệm kép: " + x);
		}
		else
			System.out.println("Phương trình vô nghiệm");
	}
}
