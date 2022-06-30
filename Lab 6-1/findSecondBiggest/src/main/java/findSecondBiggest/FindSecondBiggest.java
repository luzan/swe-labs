package findSecondBiggest;

public class FindSecondBiggest {
	public void findSecondBiggest(int[] a) {
		if (a.length < 2) {
			System.out.println("insert atleast two numbers");
			
		} else {
			int biggest = a[0];
			int secondBiggest = a[1];
			if (biggest < secondBiggest) {
				int temp = biggest;
				biggest = secondBiggest;
				secondBiggest = temp;

			}
			for (int i = 2; i < a.length; i++) {
				int temp = a[i];
				if (temp > secondBiggest) {
					if (temp > biggest) {
						secondBiggest = biggest;
						biggest = temp;

					} else {
						secondBiggest = temp;

					}
				}

			}
			System.out.println("The second biggest is :" + secondBiggest);
		}
	}

	public static void main(String[] args) {
		int a[] = {109,90,191,79,12};
		FindSecondBiggest ob1 = new FindSecondBiggest();
		ob1.findSecondBiggest(a);

	}

}
