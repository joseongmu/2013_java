import java.io.*;

public class FileWriterExample {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(
					"C:\\Users\\Kyungjin\\workspace\\chapter10\\output.txt");
			char arr[] = { '객', '체', '지', '향', '프', '로', '그', '래', '밍', '2' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
		}
	}

}
