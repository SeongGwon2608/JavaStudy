package naver.insa8029.Control;

import java.util.Scanner;

public class ControlIf {

	public static void main(String[] args) {
		// if Test
		// ������ �Է¹޾Ƽ� 60�� �̻��̸� �հ��̶�� �������, ������ ���
		// �׷��� ���� ���� ������ ���
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��Ͻÿ� : ");
		int score = sc.nextInt();

		// score�� 60�̻����� Ȯ��
		if (60 <= score) {
			System.out.println("�հ�");
		}

		System.out.println("����");

		// Scanner�� ����� �������Ƿ� ����
		sc.close();
		
	}
}
