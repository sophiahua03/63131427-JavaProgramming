 class GiaiPTBac1 {
	private InputData input2 = new InputData();
	public void PTBac1()
	{
		double a = input2.inputData("\nNhập hệ số a: ");
		double b = input2.inputData("Nhập hệ số b: ");
		
		if (a == 0)
		{	
			if (b == 0)
				System.out.println("Phương trình có vô số nghiệm");
			else
				System.out.println("Phương trình vô nghiệm");
		}
		else
		{
			double x = -b / a;
			System.out.println("Nghiệm của phương trình là: x = " + x);
		}
	}
	
}
