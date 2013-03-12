package ArrayCopy;

public class ArrayCopyExam {
	public static void main(String[] args) {
		char arr1[] = { '가', '나', '다', '라', '마', '바', '사', '아', '자', '차', '카',
				'타', '파', '하' };
		char arr2[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' };
		int arr3[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.arraycopy(arr1, 10, arr1, 2, 3);
		for (char ch : arr1) {
			System.out.print(ch + " ");
		}
		System.out.println();

		System.arraycopy(arr2, 0, arr2, 5, 6);
		for (char ch : arr2) {
			System.out.print(ch + " ");
		}
		System.out.println();

		System.arraycopy(arr3, 0, arr3, 4, 7);
		for (int num : arr3) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
