import java.io.*;

public class FileWriterExample {
	public static void main(String[] args) {
		FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\Kyungjin\\workspace\\chapter10\\output.txt");
            char arr[] = { '��', '��', ' ', '��', '��', '��', '��', ' ', 'J', 'a', 'v', 'a' };
            for (int cnt = 0; cnt < arr.length; cnt++)
                writer.write(arr[cnt]);
        }
        catch (IOException ioe) {
            System.out.println("���Ϸ� ����� �� �����ϴ�.");
        }
        finally {
            try {
                writer.close();
            }          
            catch (Exception e) {
            }
        }
    }

}
