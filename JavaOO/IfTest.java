package totototo;
import java.util.*;
public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int num1 = r.nextInt(6)+1;
		int num2 = r.nextInt(6)+1;
		System.out.println("��ǻ�Ͱ� ���� ���ڴ�: " +num1);
		System.out.println("���� ���� ���ڴ�: " +num2);
		if (num1<num2)
			System.out.println("����!!!!! ���� �����ϴ�.");
		else if (num1>num2)
			System.out.println("�̷�,���� ��� �Ҿ����ϴ�.");
		else
			System.out.println("�����ϴ�.");
	}

}
