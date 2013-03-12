package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {
	
	public static void display(Stack<String> stack){
		System.out.println("----------Stack----------");
		Iterator<String> iterator = stack.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String args[]){
		Stack<String> stack = new Stack<String>();
		
		stack.push("����");//������ �ε����� ���ʴ�� ����
		stack.push("����");
		stack.push("Ű��");
		stack.push("������");
		display(stack);
		
		stack.set(0, "�ٳ���");//���� �ε����� ������
		stack.set(2, "���");
		display(stack);
		
		stack.pop();//������ �ε����� ���� �����ϰ� ����
		stack.pop();
		display(stack);
		
		System.out.println("\n*�˻�*");
		System.out.println("������ �ε����� ��: " + stack.peek());
		System.out.println("�ε����� 1�� ��: " + stack.get(1));
		System.out.println("�ٳ����� �ε���: " + stack.indexOf("�ٳ���"));
		System.out.println("������ ������ �ε���: " + stack.lastIndexOf("����"));
	}
}
