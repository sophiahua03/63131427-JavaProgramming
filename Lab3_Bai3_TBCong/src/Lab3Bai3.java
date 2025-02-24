import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		int [] arr = new int[n];
		
		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		
		// Sắp xếp mảng
		Arrays.sort(arr);
		System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
		
		//Tìm phần tử nhỏ nhất
		int min = arr[0];
		System.out.println("Phần tử nhỏ nhất: " + min);
		
		// Tính trung bình cộng các phần tử chia hết cho 3
		int sum = 0, count = 0;
		for (int num : arr)
		{
			if (num % 3 == 0)
			{
				sum += num;
				count ++;
			}
		}
		
		if (count > 0)
		{
			double avg = (double) sum / count;
			System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + avg);
		}
		else
			System.out.println("Không có phần tử nào chia hết cho 3");
			
		scanner.close();
	}

}
