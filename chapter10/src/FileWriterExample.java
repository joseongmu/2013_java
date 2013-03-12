import java.io.*;

public class FileWriterExample {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(
					"C:\\Users\\Kyungjin\\workspace\\chapter10\\output.txt");
			char arr[] = { '��', 'ü', '��', '��', '��', '��', '��', '��', '��', '2' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
		}
	}

}
